package com.epam.first.entity;

public class Ratio {
	
	private double devident;
	private double divider;
	
	public Ratio (double devident, double divider){
		this.devident = devident;
		this.divider = divider;
	}
	
	public double getDevident(){
		return this.devident;
	}
	
	public double getDivider(){
		return this.divider;
	}

	@Override public String toString(){
		return String.format("Ratio is %f to %f", this.devident, this.divider);
	}
	
	@Override public boolean equals(Object obj){
		boolean result = false;
		
		if(obj == this){
			result = true;
		}
		else if(null == obj){
			result = false;
		}
		else if(obj instanceof Ratio){
			Ratio ratio = (Ratio)obj;
			result = this.devident == ratio.getDevident()
			&& this.divider == ratio.getDivider();
		}		
		
		return  result;
	}
	
	@Override public int hashCode(){
		return (int) (31 * this.devident + this.divider) % (Integer.MAX_VALUE);
	}

}
