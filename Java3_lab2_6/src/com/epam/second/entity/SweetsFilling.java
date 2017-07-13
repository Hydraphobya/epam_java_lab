package com.epam.second.entity;

import java.util.ArrayList;

enum Filling {NONE, CHOCOLATE, PEANUT, JAM, YOGURT, MARZIPAN, WAFER, NOUGAT};

public class SweetsFilling{
	private ArrayList<Filling> fillings;
	public SweetsFilling(){
		fillings = new ArrayList<>();
		fillings.add(Filling.NONE);
	}
	public SweetsFilling(Filling...fillings) {
		this.fillings = new ArrayList<>();
		
		for(Filling filling : fillings){
			this.fillings.add(filling);
		}
		if(this.fillings.isEmpty()){
			this.fillings.add(Filling.NONE);
		}
	}
	
	public String getFilling(){
		StringBuilder fillingStr = new StringBuilder();
		for(Filling filling : this.fillings){
			fillingStr.append(filling.toString());
			fillingStr.append('-');
		}
		fillingStr.delete(fillingStr.length() - 1, fillingStr.length());
		return fillingStr.toString();
	}
	
	public boolean addFilling(Filling filling){
		if(!this.fillings.contains(filling)){
			this.fillings.remove(Filling.NONE);
			this.fillings.add(filling);
			return true;
		}
		return false;
	}
	
	@Override 
	public String toString(){		
		return "filling - "	+ this.getFilling();
	}
}
