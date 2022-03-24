package com.example.dozerdemo.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LivingAdress {	
		private String adress;
		private String city;
		private String country;
		
		@Override
		public String toString() {
			return "LivingAdress [adress=" + adress + ", city=" + city + ", country=" + country + "]";
		}
}