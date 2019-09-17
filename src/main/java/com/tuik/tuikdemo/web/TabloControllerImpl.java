package com.tuik.tuikdemo.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.tuik.tuikdemo.dto.TabloDTO;
import com.tuik.tuikdemo.service.TabloService;
import com.tuik.tuikdemo.util.ApiResponse;

@Controller
public class TabloControllerImpl implements TabloController {

	@Autowired
	TabloService tabloService;

	@Override
	public ResponseEntity<?> createUpdateTablo(@Valid TabloDTO tabloDTO) throws Exception {

		tabloService.createUpdateTablo(tabloDTO);
		return ResponseEntity.ok(new ApiResponse(true, "İşlem başarılı"));
	}

	@Override
	public ResponseEntity<?> getTablo(Long id) throws Exception {

		return new ResponseEntity<>(tabloService.getTablo(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getTabloList() throws Exception {

		return new ResponseEntity<>(tabloService.tabloList(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> deleteTablo(Long id) throws Exception {

		tabloService.deleteTablo(id);
		return ResponseEntity.ok(new ApiResponse(true, "Silme başarılı"));
	}

}
