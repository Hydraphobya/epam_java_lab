package com.epam.second.entity;

import java.util.Optional;

import com.epam.second.entity.component.SweetsBase;
import com.epam.second.entity.component.SweetsCover;
import com.epam.second.exception.SweetsCoverException;


public class OtherSweets extends Sweets {
	private Optional<SweetsBase> base; 
	private Optional<SweetsCover> cover;
	
	public OtherSweets(String name, int sugarPercentage, double weight, double cost, 
			SweetsBase base, SweetsCover cover) {
		super(name, sugarPercentage, weight, cost);
		this.base = Optional.of(base);	
		this.cover = Optional.ofNullable(cover);
	}
	
	public OtherSweets(String name, int sugarPercentage, double weight, double cost, SweetsBase base) {
	super(name, sugarPercentage, weight, cost);
	this.base = Optional.of(base);	
	}
	
	public void addSweetsCover(SweetsCover cover)  throws SweetsCoverException {
		if(this.cover.isPresent()){
			throw new SweetsCoverException("The sweets cann't be covered twice!"); 
		}		
		this.cover = Optional.ofNullable(cover);			
	}
	
	@Override 
	public String toString(){		
		StringBuilder result = new StringBuilder(super.toString());
		result.append(", " + this.base.toString());
		this.cover.ifPresent(cover -> result.append(", " + cover.toString()));
		return result.toString();
	}
	
	@Override
	public boolean equals(Object obj){
		if((true == super.equals(obj)) 
				&& (obj instanceof OtherSweets)){
			return this.toString() == obj.toString();
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return 100 * super.hashCode()
				+ base.hashCode()
				+ 31 * cover.hashCode();
	}
}
