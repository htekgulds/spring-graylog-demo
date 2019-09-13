package com.tuik.tuikdemo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tuik.tuikdemo.dto.TabloDTO;

@Service
@Transactional 
public class TabloServiceImpl implements TabloService {

	@Override
	public void createTablo(TabloDTO tabloDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTablo(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TabloDTO updateTablo(TabloDTO tabloDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TabloDTO getTablo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TabloDTO> tabloList() {
		// TODO Auto-generated method stub
		return null;
	}


}
