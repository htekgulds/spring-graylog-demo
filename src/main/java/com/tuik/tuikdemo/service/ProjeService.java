package com.tuik.tuikdemo.service;

import java.util.List;
import com.tuik.tuikdemo.dto.ProjeDTO;

public interface ProjeService {

	public void createProje(ProjeDTO projeDTO);

	public void deleteProje(Long id);

	public ProjeDTO updateProje(ProjeDTO projeDTO);

	public ProjeDTO getProje(Long id);

	public List<ProjeDTO> projeList();
}
