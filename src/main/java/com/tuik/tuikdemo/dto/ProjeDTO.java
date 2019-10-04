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
public class ProjeDTO {

	private Long id;

	private String ad;

	private String sema;

	@ApiModelProperty(hidden = true)
	private List<IslemDTO> islemDTO = new ArrayList<>();

}
