package com.example.dozerdemo.domain;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
	
	private int id;
	private String name;
	private String surname;
	private String email;
	private Date dob;
	private LivingAdress loc;
	
	@Override
	public String toString() {
		return "Person [id=" + id + 
				", name=" + name + 
				", surname=" + surname + 
				", email=" + email + 
				", dob=" + dob+ 
				", loc=" + loc + "]";
	}
}
