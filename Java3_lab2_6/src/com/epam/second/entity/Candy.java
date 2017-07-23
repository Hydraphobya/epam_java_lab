package com.epam.second.entity;

import java.util.Optional;

import com.epam.second.entity.component.CandyBase;
import com.epam.second.entity.component.SweetsCover;
import com.epam.second.entity.component.SweetsFilling;
import com.epam.second.exception.SweetsCoverException;
import com.epam.second.exception.SweetsFillingException;



public class Candy extends Sweets{
	private Optional<CandyBase> candyBase;
	private Optional<SweetsFilling> filling;
	private Optional<SweetsCover> cover;
	
	public Candy(String name, int sugarPercentage, double weight, double cost, 
					CandyBase candyBase, SweetsFilling filling, SweetsCover cover) {
		super(name, sugarPercentage, weight, cost);
		this.candyBase = Optional.of(candyBase);
		this.filling = Optional.ofNullable(filling);
		this.cover = Optional.ofNullable(cover);
	}
	
	public Candy(String name, int sugarPercentage, double weight, double cost, 
			CandyBase candyBase) {
	super(name, sugarPercentage, weight, cost);
	this.candyBase = Optional.of(candyBase);
	}

	public void addSweetsCover(SweetsCover cover)  throws SweetsCoverException {
		if (this.cover.isPresent()){
			throw new SweetsCoverException("The sweets cann't be covered twice!"); 
		}		
		this.cover = Optional.ofNullable(cover);			
	}
	
	public void addSweetsFilling(SweetsFilling filling) throws SweetsFillingException {
		if (this.filling.isPresent()) { 
			throw new SweetsFillingException("The sweets cann't be filled twice!");
		}
		this.filling = Optional.ofNullable(filling);
	}

	@Override 
	public String toString(){
		StringBuilder result = new StringBuilder(super.toString());
		result.append(", " + this.candyBase.toString());
		this.filling.ifPresent(filling -> result.append(", " + filling.toString()));
		this.cover.ifPresent(cover -> result.append(", " + cover.toString()));		
		return result.toString();
	}
	
	@Override
	public int hashCode(){
		return 100 * super.hashCode()
				+ this.candyBase.get().hashCode()
				+ 31 * this.filling.hashCode()
				+ 15 * this.cover.hashCode();
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
