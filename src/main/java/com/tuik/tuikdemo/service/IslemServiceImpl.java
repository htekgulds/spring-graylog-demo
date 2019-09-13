package com.tuik.tuikdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tuik.tuikdemo.dto.IslemDTO;

@Service
@Transactional
public class IslemServiceImpl implements IslemService {

	@Override
	public void createIslem(IslemDTO islemDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteIslem(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IslemDTO updateIslem(IslemDTO islemDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IslemDTO getIslem(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IslemDTO> islemList() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
