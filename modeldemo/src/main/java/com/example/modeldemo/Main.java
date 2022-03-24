package com.example.modeldemo;

import org.modelmapper.ModelMapper;

import com.example.modeldemo.domain.Customer;
import com.example.modeldemo.domain.Order;
import com.example.modeldemo.dto.CustomerDTO;

public class Main {

	static ModelMapper mapper = new ModelMapper();

	public static void main(String[] args) {
		Customer c = new Customer();
		Order o = new Order();

		o.setId(1);
		o.setProduct("Laptop");
		o.setAdress("adress 32");
		o.setCity("Bitola");

		c.setName("Jane");
		c.setLastname("Doe");
		c.setOrder(o);

		mapper.typeMap(Customer.class, CustomerDTO.class).addMappings(
				mapping -> {
					mapping.map(src -> src.getOrder().getAdress() , CustomerDTO::setOrderAdress);
					mapping.map(src -> src.getOrder().getCity() , CustomerDTO::setOrderCity);
				});
		
		
		CustomerDTO dto = mapper.map(c, CustomerDTO.class);
		
		System.out.println(dto);

	}
}