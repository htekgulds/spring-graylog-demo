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
import com.tuik.tuikdemo.dto.TabloDTO;

@RestController
@RequestMapping("/api/tablo")
public interface TabloController {

	@PostMapping
	ResponseEntity<?> createUpdateTablo(@Valid @RequestBody TabloDTO tabloDTO) throws Exception;

	@GetMapping("/{id}")
	ResponseEntity<?> getTablo(@PathVariable Long id) throws Exception;

	@GetMapping
	ResponseEntity<?> getTabloList() throws Exception;

	@DeleteMapping("/{id}")
	ResponseEntity<?> deleteTablo(@PathVariable Long id) throws Exception;
}
