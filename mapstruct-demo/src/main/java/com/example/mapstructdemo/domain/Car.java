package com.example.mapstructdemo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
	
	private int id;
	private String model;
	private String color;
	private Engine engine;
	
}
