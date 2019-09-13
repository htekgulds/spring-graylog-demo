package com.tuik.tuikdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tuik.tuikdemo.dto.ProjeDTO;
import com.tuik.tuikdemo.exception.TuikException;
import com.tuik.tuikdemo.mapper.ProjeMapper;
import com.tuik.tuikdemo.model.Proje;
import com.tuik.tuikdemo.repository.ProjeRepository;

@Service
@Transactional
public class ProjeServiceImpl implements ProjeService {

	@Autowired
	ProjeRepository projeRepo;

	@Autowired
	ProjeMapper projeMapper;

	@Override
	@Transactional(readOnly = false)
	public void createProje(ProjeDTO projeDTO) {

		projeRepo.save(projeMapper.toProje(projeDTO));
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteProje(Long id) {

		Proje proje = projeRepo.findById(id).orElseThrow(() -> new TuikException());
		projeRepo.delete(proje);
	}

	@Override
	@Transactional(readOnly = false)
	public ProjeDTO updateProje(ProjeDTO projeDTO) {

		Proje proje = projeRepo.findById(projeDTO.getId()).orElseThrow(() -> new TuikException());
		proje.setAd(projeDTO.getAd());
		proje.setSema(projeDTO.getSema());
		projeRepo.save(proje);
		return projeDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public ProjeDTO getProje(Long id) {

		Proje proje = projeRepo.findById(id).orElseThrow(() -> new TuikException());
		return projeMapper.toProjeDTO(proje);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ProjeDTO> projeList() {

		List<ProjeDTO> projeDTO = projeMapper.toProjeDTOs(projeRepo.findAll());
		return projeDTO;
	}
}
