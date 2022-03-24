package com.example.modeldemo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
	private String name;
	private String lastname;
	private Order order;
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", lastname=" + lastname + ", order=" + order + "]";
	}
	
}
