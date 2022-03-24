package com.example.mapstructdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.mapstructdemo.domain.Car;
import com.example.mapstructdemo.dto.CarDTO;



@Mapper
public interface MapperInterface {
	@Mappings({
		@Mapping(target = "manufacturer" , source = "engine.manufacturer")
	})
	CarDTO carToDTO(Car car);
	Car dtoToCar(CarDTO carDTO);
}