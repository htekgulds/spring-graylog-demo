package com.tuik.tuikdemo.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.tuik.tuikdemo.dto.IslemDTO;
import com.tuik.tuikdemo.model.Islem;

@Mapper(componentModel = "spring", uses = { TabloMapper.class, ProjeMapper.class })
public interface IslemMapper {

	@Mappings({ @Mapping(source = "tablo", target = "tabloDTO"), @Mapping(source = "proje.id", target = "projeId") })
	IslemDTO toIslemDTO(Islem islem);

	List<IslemDTO> toIslemDTOs(List<Islem> islems);

	@Mappings({ @Mapping(source = "tabloDTO", target = "tablo"), @Mapping(source = "projeId", target = "proje.id") })
	Islem toIslem(IslemDTO islemDTO);

	List<Islem> toIslems(List<IslemDTO> islemDTOs);
}
