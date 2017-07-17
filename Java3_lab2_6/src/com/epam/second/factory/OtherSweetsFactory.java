package com.epam.second.factory;

import com.epam.second.entity.OtherSweets;
import com.epam.second.entity.Sweets;
import com.epam.second.enums.SweetsBase;
import com.epam.second.enums.SweetsCover;
import com.epam.second.exceptions.IllegalSweetsTypeException;

public class OtherSweetsFactory extends ConcreteSweetsFactory{

	public OtherSweetsFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Sweets getSweets(String sweetsName) throws IllegalSweetsTypeException {
		switch(sweetsName){
		case "Choco nuts": return new OtherSweets(sweetsName, 10, 5.1, 0.05, SweetsBase.NUT, SweetsCover.CHOCOLATE_GLAZE);
		default: throw new IllegalSweetsTypeException("We are sincerely sorry, but we cannot add this candy to the present...");
		}
	}

}
