package com.epam.second.entity;

import java.util.Optional;

import com.epam.second.enums.CandyBase;
import com.epam.second.enums.SweetsCover;
import com.epam.second.enums.SweetsFilling;

public class FormedCandy extends Candy {
	private Optional<String> form;
	
	public FormedCandy(String name, int sugarPercentage, double weight, double cost, 
			CandyBase candyBase, SweetsFilling filling, SweetsCover cover, String form)
	{
		super(name, sugarPercentage, weight, cost, candyBase, filling, cover);
		this.form = Optional.of(form);
	}
	
	public FormedCandy(String name, int sugarPercentage, double weight, double cost, 
			CandyBase candyBase, String form)
	{
		super(name, sugarPercentage, weight, cost, candyBase);
		this.form = Optional.of(form);
	}
	@Override 
	public String toString(){
		return super.toString()
					+ ", form - " + this.form.get();
	}
	
	@Override
	public int hashCode(){
		return 100 * super.hashCode()
					+ form.hashCode();
	}
	
	@Override 
	public boolean equals(Object obj){
		if((true == super.equals(obj)) 
				&& (obj instanceof FormedCandy)){
			return this.toString() == obj.toString();
		}
		return false;
	}

}
