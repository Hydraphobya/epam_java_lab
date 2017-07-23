package com.epam.second.entity.component;

public enum CandyBase{
	MILKCHOCO, DARKCHOCO, WHITECHOCO, 
	COUVERTUREMILK, COUVERTUREDARK, COUVERTUREWHITE, 
	PEANUT, MARSHMALLOW, GUMMY, WAFER, GELATIN;
	
	@Override
	public String toString(){
		return "candy base - " + this.toString();
	}
}
