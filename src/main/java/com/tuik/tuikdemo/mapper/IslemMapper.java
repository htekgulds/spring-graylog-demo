package com.tuik.tuikdemo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.tuik.tuikdemo.dto.IslemDTO;
import com.tuik.tuikdemo.model.Islem;

@Mapper
public interface IslemMapper {

	IslemDTO toIslemDTO(Islem islem);

	List<IslemDTO> toIslemDTOs(List<Islem> islems);

	Islem toIslem(IslemDTO IslemDTO);

	List<Islem> toIslems(List<IslemDTO> IslemDTOs);
}
