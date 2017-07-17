package com.epam.second.entity;

import java.util.Optional;

import com.epam.second.exceptions.SweetsCostException;

public class Sweets{
	private Optional<String> name;
	private int sugarPercentage;
	private double weight;
	private double cost;
	
	public Sweets(String name, int sugarPercentage, double weight, double cost){
		this.name = Optional.of(name);
		this.sugarPercentage = sugarPercentage;
		this.weight = weight;
		this.cost = cost;
	}
	
	public String getName(){
		return this.name.get();
	}
	
	public int getSugarPercentage(){
		return this.sugarPercentage;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public double getCost(){
		return this.cost;
	}
	
	public void setCost(double cost) throws SweetsCostException{
		if(cost > 0) {
			this.cost = cost;
		}
		else{
			throw new SweetsCostException("Sweets cost should be higer than 0!");
		}
	}
	@Override public String toString(){
		return "Sweets name - " + this.getName()
				+ ", weight - " + this.getWeight()
				+ ", sugar percentage - " + this.getSugarPercentage() + " %"
				+ ", cost - " + this.getCost();
	}
	
	@Override public boolean equals(Object obj){
		boolean result = false;
		
		if(obj == this){
			result = true;
		}
		else if(null == obj){
			result = false;
		}
		else if(obj instanceof Sweets){
			Sweets sweets = (Sweets)obj;
			result =  this.getName().equals(sweets.getName())
						&& this.getSugarPercentage() == sweets.getSugarPercentage()
						&& this.getWeight() == sweets.getWeight();
		}		
		return  result;
	}
	
	@Override public int hashCode(){
		return this.getName().hashCode() 
					+ 31 * this.getSugarPercentage()
					+ 15 * (int)(100 * this.getCost()) % 100
					+ (int)(100 * this.getWeight()) % 100;
	}
	
}
