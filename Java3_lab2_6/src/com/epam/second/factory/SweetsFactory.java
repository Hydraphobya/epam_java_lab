package com.epam.second.factory;

import java.util.Optional;

import com.epam.second.entity.Sweets;
import com.epam.second.exceptions.IllegalSweetsTypeException;

public class SweetsFactory {

	private SweetsFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Sweets getSweets(String sweetsType, String sweetsName) throws IllegalSweetsTypeException{
		Optional<ConcreteSweetsFactory> sweetsFactory;
		switch (sweetsType) {
		case "Candy": sweetsFactory = Optional.ofNullable(new CandyFactory());
						break;
		case "Formed candy": sweetsFactory =  Optional.ofNullable(new FormedCandyFactory());
						break;
		case "Other": sweetsFactory =  Optional.ofNullable(new OtherSweetsFactory()); 
						break;
		default: sweetsFactory = Optional.empty();
						break;
		}

		return sweetsFactory.orElseThrow(IllegalSweetsTypeException::new).getSweets(sweetsName);
	}

}
