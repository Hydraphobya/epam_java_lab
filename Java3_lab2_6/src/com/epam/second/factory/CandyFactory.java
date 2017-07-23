package com.epam.second.factory;

import com.epam.second.entity.Candy;
import com.epam.second.entity.Sweets;
import com.epam.second.entity.component.CandyBase;
import com.epam.second.entity.component.SweetsCover;
import com.epam.second.entity.component.SweetsFilling;
import com.epam.second.exception.IllegalSweetsTypeException;

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
