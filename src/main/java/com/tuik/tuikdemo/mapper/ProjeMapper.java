package com.tuik.tuikdemo.mapper;

import org.mapstruct.Mapper;

import com.tuik.tuikdemo.dto.ProjeDTO;
import com.tuik.tuikdemo.model.Proje;

import java.util.List;

@Mapper
public interface ProjeMapper {

	ProjeDTO toProjeDTO(Proje proje);

	List<ProjeDTO> toProjeDTOs(List<Proje> projes);

	Proje toProje(ProjeDTO projeDTO);

	List<Proje> toProjes(List<ProjeDTO> projeDTOs);

}
