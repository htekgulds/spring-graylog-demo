package com.tuik.tuikdemo.web;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.tuik.tuikdemo.dto.IslemDTO;
import com.tuik.tuikdemo.service.IslemService;
import com.tuik.tuikdemo.util.ApiResponse;

@Controller
public class IslemControllerImpl implements IslemController {

	@Autowired
	IslemService islemService;

	@Override
	public ResponseEntity<?> createIslem(@Valid IslemDTO islemDTO) throws Exception {

		islemService.createIslem(islemDTO);
		return ResponseEntity.ok(new ApiResponse(true, "Ekleme başarılı"));
	}

	@Override
	public ResponseEntity<?> getIslem(Long id) throws Exception {

		return new ResponseEntity<>(islemService.getIslem(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getIslemList() throws Exception {

		return new ResponseEntity<>(islemService.islemList(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> updateIslem(@Valid IslemDTO islemDTO) throws Exception {

		return new ResponseEntity<>(islemService.updateIslem(islemDTO), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> deleteIslem(Long id) throws Exception {

		islemService.deleteIslem(id);
		return ResponseEntity.ok(new ApiResponse(true, "Silme başarılı"));
	}

}
