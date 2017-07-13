package com.epam.second.entity;

import java.util.ArrayList;

enum Glaze {NONE, BLUE, RED, BLACK, YELLOW, PINK, PLUM, YELLOWGRIN, CRIMSON, ORCHID, MINT, CYAN, ORANGE};

public class GlazeCandy extends Candy {
	Glaze glaze; 
	
	public GlazeCandy(String name, int sugarPercentage, double weight, double cost, Glaze glaze) {
		super(name, sugarPercentage, weight, cost);
		this.glaze = glaze;	
	}
	
	public Glaze getGlaze(){
		return this.glaze;
	}
	
	@Override 
	public String toString(){		
		return super.toString() 
				+ ", glaze - "
				+ this.getGlaze().toString();
	}
	
	@Override
	public boolean equals(Object obj){
		if((true == super.equals(obj)) 
				&& (obj instanceof GlazeSweets)){
			return this.toString() == obj.toString();
		}
		return false;
	}
}
