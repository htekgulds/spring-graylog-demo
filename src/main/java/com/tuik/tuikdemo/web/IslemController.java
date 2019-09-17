package com.tuik.tuikdemo.web;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tuik.tuikdemo.dto.IslemDTO;

@RestController
@RequestMapping("/api/islem")
public interface IslemController {

	@PostMapping
	ResponseEntity<?> createUpdateIslem(@Valid @RequestBody IslemDTO islemDTO) throws Exception;

	@GetMapping("/{id}")
	ResponseEntity<?> getIslem(@PathVariable Long id) throws Exception;

	@GetMapping
	ResponseEntity<?> getIslemList() throws Exception;

	@DeleteMapping("/{id}")
	ResponseEntity<?> deleteIslem(@PathVariable Long id) throws Exception;
}
