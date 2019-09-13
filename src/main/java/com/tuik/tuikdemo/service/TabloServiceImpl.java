package com.tuik.tuikdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tuik.tuikdemo.dto.TabloDTO;
import com.tuik.tuikdemo.exception.TuikException;
import com.tuik.tuikdemo.mapper.TabloMapper;
import com.tuik.tuikdemo.model.Islem;
import com.tuik.tuikdemo.model.Tablo;
import com.tuik.tuikdemo.repository.IslemRepository;
import com.tuik.tuikdemo.repository.TabloRepository;

@Service
@Transactional
public class TabloServiceImpl implements TabloService {

	@Autowired
	TabloRepository tabloRepo;

	@Autowired
	IslemRepository islemRepo;

	@Autowired
	TabloMapper tabloMapper;

	@Override
	@Transactional(readOnly = false)
	public void createTablo(TabloDTO tabloDTO) {

		tabloRepo.save(tabloMapper.toTablo(tabloDTO));
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteTablo(Long id) {

		Islem islem = islemRepo.findById(id).orElseThrow(() -> new TuikException());
		islemRepo.delete(islem);
	}

	@Override
	@Transactional(readOnly = false)
	public TabloDTO updateTablo(TabloDTO tabloDTO) {

		Tablo tablo = tabloRepo.findById(tabloDTO.getId()).orElseThrow(() -> new TuikException());
		Islem islem = islemRepo.findById(tabloDTO.getIslemId()).orElseThrow(() -> new TuikException());
		tablo.setAd(tabloDTO.getAd());
		tablo.setSil(tabloDTO.isSil());
		tablo.setGuncelle(tabloDTO.isGuncelle());
		tablo.setIslem(islem);
		islemRepo.save(islem);
		return tabloDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public TabloDTO getTablo(Long id) {

		Tablo tablo = tabloRepo.findById(id).orElseThrow(() -> new TuikException());
		return tabloMapper.toTabloDTO(tablo);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TabloDTO> tabloList() {

		List<TabloDTO> tabloDTO = tabloMapper.toTabloDTOs(tabloRepo.findAll());
		return tabloDTO;
	}
}
