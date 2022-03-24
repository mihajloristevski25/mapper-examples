package com.example.modeldemo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	private int id;
	private String product;
	private String city;
	private String adress;
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + ", city=" + city + ", adress=" + adress + "]";
	}
	
	
}
