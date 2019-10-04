package com.tuik.tuikdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.tuik.tuikdemo.dto.ProjeDTO;
import com.tuik.tuikdemo.model.Proje;
import java.util.List;

@Mapper(componentModel = "spring", uses = IslemMapper.class)
public interface ProjeMapper {

	@Mapping(source = "islem", target = "islemDTO")
	ProjeDTO toProjeDTO(Proje proje);

	List<ProjeDTO> toProjeDTOs(List<Proje> projes);

	@Mapping(source = "islemDTO", target = "islem")
	Proje toProje(ProjeDTO projeDTO);

	List<Proje> toProjes(List<ProjeDTO> projeDTOs);

}
