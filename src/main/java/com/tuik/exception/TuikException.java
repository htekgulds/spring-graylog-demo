package com.tuik.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TuikException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TuikException() {
		super("Hatalı giriş.");
	}

}
