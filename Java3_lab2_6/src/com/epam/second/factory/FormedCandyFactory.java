package com.epam.second.factory;

import com.epam.second.entity.FormedCandy;
import com.epam.second.entity.Sweets;
import com.epam.second.entity.component.CandyBase;
import com.epam.second.exception.IllegalSweetsTypeException;

public class FormedCandyFactory extends ConcreteSweetsFactory{

	public FormedCandyFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Sweets getSweets(String sweetsName) throws IllegalSweetsTypeException {
		switch(sweetsName){
		case "Jelley beans": return new FormedCandy(sweetsName, 10, 5.1, 0.05, CandyBase.GELATIN, "Beans");
		default: throw new IllegalSweetsTypeException("We are sincerely sorry, but we cannot add this candy to the present...");
		}
	}
}
