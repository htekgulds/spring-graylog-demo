package com.tuik.tuikdemo.service;

import java.util.List;

import com.tuik.tuikdemo.dto.IslemDTO;

public interface IslemService {

	public void createUpdateIslem(IslemDTO islemDTO);

	public void deleteIslem(Long id);

	public IslemDTO getIslem(Long id);

	public List<IslemDTO> islemList();
}
