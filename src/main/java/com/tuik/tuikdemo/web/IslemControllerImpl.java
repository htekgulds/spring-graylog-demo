package com.tuik.tuikdemo.web;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.tuik.tuikdemo.dto.IslemDTO;
import com.tuik.tuikdemo.service.IslemService;
import com.tuik.tuikdemo.util.ApiResponse;
import lombok.extern.log4j.Log4j;



@Controller
@Log4j
public class IslemControllerImpl implements IslemController {

	@Autowired
	IslemService islemService;

	@Override
	public ResponseEntity<?> createUpdateIslem(@Valid IslemDTO islemDTO) throws Exception {
		
		log.info("XXXXXXXXX");
		islemService.createUpdateIslem(islemDTO);
		return ResponseEntity.ok(new ApiResponse(true, "İşlem başarılı"));
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
	public ResponseEntity<?> deleteIslem(Long id) throws Exception {

		islemService.deleteIslem(id);
		return ResponseEntity.ok(new ApiResponse(true, "Silme başarılı"));
	}

}
