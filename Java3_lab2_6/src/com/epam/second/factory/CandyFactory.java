package com.epam.second.factory;

import com.epam.second.entity.Candy;
import com.epam.second.entity.Sweets;
import com.epam.second.enums.CandyBase;
import com.epam.second.enums.SweetsCover;
import com.epam.second.enums.SweetsFilling;
import com.epam.second.exceptions.IllegalSweetsTypeException;

public class CandyFactory extends ConcreteSweetsFactory {

	public CandyFactory() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Sweets getSweets(String sweetsName) throws IllegalSweetsTypeException{
		switch(sweetsName){
		case "Raffaelo": return new Candy(sweetsName, 40, 10.7, 0.1, CandyBase.WAFER, SweetsFilling.COCONUT_BUTTER, SweetsCover.COCONUT_CHIPS);
		default: throw new IllegalSweetsTypeException("We are sincerely sorry, but we cannot add this candy to the present...");
		}			
	}

}
