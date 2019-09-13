package com.tuik.tuikdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tuik.tuikdemo.dto.IslemDTO;
import com.tuik.tuikdemo.exception.TuikException;
import com.tuik.tuikdemo.mapper.IslemMapper;
import com.tuik.tuikdemo.model.Islem;
import com.tuik.tuikdemo.model.Proje;
import com.tuik.tuikdemo.repository.IslemRepository;
import com.tuik.tuikdemo.repository.ProjeRepository;

@Service
@Transactional
public class IslemServiceImpl implements IslemService {

	@Autowired
	IslemRepository islemRepo;

	@Autowired
	ProjeRepository projeRepo;

	@Autowired
	IslemMapper islemMapper;

	@Override
	@Transactional(readOnly = false)
	public void createIslem(IslemDTO islemDTO) {

		islemRepo.save(islemMapper.toIslem(islemDTO));
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteIslem(Long id) {

		Islem islem = islemRepo.findById(id).orElseThrow(() -> new TuikException());
		islemRepo.delete(islem);
	}

	@Override
	@Transactional(readOnly = false)
	public IslemDTO updateIslem(IslemDTO islemDTO) {

		Islem islem = islemRepo.findById(islemDTO.getId()).orElseThrow(() -> new TuikException());
		Proje proje = projeRepo.findById(islemDTO.getProjeId()).orElseThrow(() -> new TuikException());
		islem.setAd(islemDTO.getAd());
		islem.setProje(proje);
		islemRepo.save(islem);
		return islemDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public IslemDTO getIslem(Long id) {

		Islem islem = islemRepo.findById(id).orElseThrow(() -> new TuikException());
		return islemMapper.toIslemDTO(islem);
	}

	@Override
	@Transactional(readOnly = true)
	public List<IslemDTO> islemList() {

		List<IslemDTO> islemDTO = islemMapper.toIslemDTOs(islemRepo.findAll());
		return islemDTO;
	}

}
