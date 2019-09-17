package com.tuik.tuikdemo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.tuik.tuikdemo.dto.TabloDTO;
import com.tuik.tuikdemo.model.Tablo;

@Mapper(componentModel = "spring")
public interface TabloMapper {

	@Mapping(source = "islem.id", target = "islemId")
	TabloDTO toTabloDTO(Tablo tablo);

	List<TabloDTO> toTabloDTOs(List<Tablo> tablos);

	@Mapping(source = "islemId", target = "islem.id")
	Tablo toTablo(TabloDTO tabloDTO);

	List<Tablo> toTablos(List<TabloDTO> tabloDTOs);
}
