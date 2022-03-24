package com.example.modeldemo.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	
	private String customerName;
	private String customerLastname;
	private String orderProduct;
	private String orderAdress;
	private String orderCity;
	
}
