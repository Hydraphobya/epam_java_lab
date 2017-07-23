package com.epam.second.entity.component;

public enum SweetsFilling {CHOCOLATE, PEANUT, JAM, YOGURT, MARZIPAN, NOUGAT, COCONUT_BUTTER;
	
	@Override 
	public String toString(){
		return "filling - " + this.toString();
	}
}
