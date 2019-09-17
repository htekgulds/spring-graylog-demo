package com.tuik.tuikdemo.dto;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
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
public class IslemDTO {

	private Long id;

	private String ad;

	private Long projeId;
		
	@ApiModelProperty(hidden = true)
	private List<TabloDTO> tabloDTO = new ArrayList<>();
}
