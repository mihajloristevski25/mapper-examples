package com.example.dozerdemo;

import java.util.Arrays;
import java.util.Date;

import org.dozer.DozerBeanMapper;

import com.example.dozerdemo.domain.LivingAdress;
import com.example.dozerdemo.domain.Person;
import com.example.dozerdemo.dto.PersonDTO;

public class Main {

	static DozerBeanMapper mapper = new DozerBeanMapper();

	public static void main(String[] args) {

		configureMapper("file:src\\main\\resources\\dozer_config.xml");

		Person person = new Person();
		LivingAdress la = new LivingAdress();

		la.setCountry("MKD");
		la.setCity("Bitola");
		la.setAdress("adresa 123");

		person.setDob(new Date());
		person.setId(1);
		person.setName("Petko");
		person.setSurname("Test");
		person.setEmail("email@gmail.com");
		person.setLoc(la);

		PersonDTO persondto = mapper.map(person, PersonDTO.class);

		System.out.println(persondto);

	}

	static public void configureMapper(String mappingFileUrls) {
		mapper.setMappingFiles(Arrays.asList(mappingFileUrls));
	}
}