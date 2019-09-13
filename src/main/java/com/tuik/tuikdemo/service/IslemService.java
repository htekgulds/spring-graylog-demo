package com.tuik.tuikdemo.service;

import java.util.List;

import com.tuik.tuikdemo.dto.IslemDTO;

public interface IslemService {

	public void createIslem(IslemDTO islemDTO);

	public void deleteIslem(Long id);

	public IslemDTO updateIslem(IslemDTO islemDTO);

	public IslemDTO getIslem(Long id);

	public List<IslemDTO> islemList();
}
