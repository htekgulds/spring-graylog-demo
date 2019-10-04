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
import com.tuik.tuikdemo.dto.ProjeDTO;

@RestController
@RequestMapping("/api/proje")
public interface ProjeController {

	@PostMapping
	ResponseEntity<?> createUpdateProje(@Valid @RequestBody ProjeDTO projeDTO) throws Exception;

	@GetMapping("/{id}")
	ResponseEntity<?> getProje(@PathVariable Long id) throws Exception;

	@GetMapping
	ResponseEntity<?> getProjeList() throws Exception;

	@DeleteMapping("/{id}")
	ResponseEntity<?> deleteProje(@PathVariable Long id) throws Exception;

}
