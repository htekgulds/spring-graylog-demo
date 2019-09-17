package com.tuik.tuikdemo.web;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.tuik.tuikdemo.dto.ProjeDTO;
import com.tuik.tuikdemo.repository.ProjeRepository;
import com.tuik.tuikdemo.service.ProjeService;
import com.tuik.tuikdemo.util.ApiResponse;
import io.swagger.annotations.ApiModelProperty;

@Controller
public class ProjeControllerImpl implements ProjeController {

	@Autowired
	ProjeService projeService;

	@Autowired
	ProjeRepository projeRepo;

	@Override
	@ApiModelProperty(value = "")
	public ResponseEntity<?> createUpdateProje(@Valid ProjeDTO projeDTO) throws Exception {

		projeService.createUpdateProje(projeDTO);
		return ResponseEntity.ok(new ApiResponse(true, "İşlem başarılı"));
	}

	@Override
	public ResponseEntity<?> getProje(Long id) throws Exception {

		return new ResponseEntity<>(projeService.getProje(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getProjeList() throws Exception {

		return new ResponseEntity<>(projeService.projeList(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> deleteProje(Long id) throws Exception {

		projeService.deleteProje(id);
		return ResponseEntity.ok(new ApiResponse(true, "Silme başarılı"));
	}

}
