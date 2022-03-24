package com.example.dozerdemo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonDTO {
	
	private String name;
	private String surname;
	private String email;
	private String personCountry;
	private String personCity;
	private String personAdress;

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + 
				", surname=" + surname + 
				", email=" + email + 
				", personCountry=" + personCountry + 
				", personCity=" + personCity + 
				", personAdress=" + personAdress + "]";
	}

}