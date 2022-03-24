package com.example.mapstructdemo;

import org.mapstruct.factory.Mappers;

import com.example.mapstructdemo.domain.Car;
import com.example.mapstructdemo.domain.Engine;
import com.example.mapstructdemo.dto.CarDTO;
import com.example.mapstructdemo.mapper.MapperInterface;

public class Main {
	
	static MapperInterface mapper = Mappers.getMapper(MapperInterface.class); 
	
	public static void main(String[] args) {
		Car car = new Car();
		Engine engine = new Engine();

		engine.setManufacturer("Volksvagen");
		engine.setSerialNumber("A343453C5436");
		
		car.setId(1);
		car.setModel("Golf 8");
		car.setColor("Blue");
		car.setEngine(engine);
		
		CarDTO cardto =  mapper.carToDTO(car);
		
		
		System.out.println(cardto);
		
	}
}
