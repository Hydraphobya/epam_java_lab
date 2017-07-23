package com.epam.second.factory;

import com.epam.second.entity.Sweets;
import com.epam.second.exception.IllegalSweetsTypeException;

public abstract class ConcreteSweetsFactory {

	public ConcreteSweetsFactory() {
		// TODO Auto-generated constructor stub
	}		
	
	public abstract Sweets getSweets(String sweetsName) throws IllegalSweetsTypeException;



}
