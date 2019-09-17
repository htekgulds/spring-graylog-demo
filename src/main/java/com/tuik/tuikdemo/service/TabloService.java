package com.tuik.tuikdemo.service;

import java.util.List;
import com.tuik.tuikdemo.dto.TabloDTO;

public interface TabloService {

	public void createUpdateTablo(TabloDTO tabloDTO);

	public void deleteTablo(Long id);

	public TabloDTO getTablo(Long id);

	public List<TabloDTO> tabloList();
}
