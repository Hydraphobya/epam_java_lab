package com.epam.second.entity;

enum CandyBase{
	MILKCHOCO, DARKCHOCO, WHITECHOCO, 
	COUVERTUREMILK, COUVERTUREDARK, COUVERTUREWHITE, 
	PEANUT, MARSHMALLOW, GUMMY;
	
	@Override
	public String toString(){
		return "candy base - " + this.toString();
	}
}

public class Candy extends Sweets{
	CandyBase candyBase;
	
	public Candy(String name, int sugarPercentage, double weight, double cost, CandyBase candyBase) {
		super(name, sugarPercentage, weight, cost);
		this.candyBase = candyBase;
	}
	
	@Override 
	public String toString(){
		return super.toString()
					+ ", "+ this.candyBase.toString();
	}
	
	@Override 
	public boolean equals(Object obj){
		if((true == super.equals(obj)) 
				&& (obj instanceof Candy)){
			return this.toString() == obj.toString();
		}
		return false;
	}

}
