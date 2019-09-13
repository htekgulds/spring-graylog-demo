package com.tuik.tuikdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TabloDTO {

	private Long id;
	
	private String ad;
	
	private boolean guncelle;
	
	private boolean sil;
	
	private Long islemId;
	
}
