package com.tuik.tuikdemo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.tuik.tuikdemo.dto.TabloDTO;
import com.tuik.tuikdemo.model.Tablo;

@Mapper
public interface TabloMapper {

	TabloDTO toTabloDTO(Tablo tablo);

	List<TabloDTO> toTabloDTOs(List<Tablo> tablos);

	Tablo toTablo(TabloDTO TabloDTO);

	List<Tablo> toTablos(List<TabloDTO> TabloDTOs);
}
