package com.epam.first.entity;

/**
 * @author Hanna.Hlushakova
 *
 */

import java.util.ArrayList;

import com.epam.first.observer.IObservableSubject;

public class Cube implements IObservableSubject{	
	private Point center;
	private double sideLength;
	private ArrayList<CubeDimensions> cubeDimensionsList = new ArrayList<>();	
		
	public Cube(Point center, double sideLength){
		this.center = center;
		this.sideLength = sideLength;
		//possibly this should be remove to other place 
		//this.notifyObservers();
	}
	
	public Point getCenter(){
		return this.center;
	}
	
	public double getSideLength(){
		return this.sideLength;
	}
	
	@Override public boolean equals(Object obj){
		boolean result = false;
		
		if(obj == this){
			result = true;
		}
		else if(null == obj){
			result = false;
		}
		else if(obj instanceof Cube){
			Cube cube = (Cube)obj;
			result = this.getCenter().equals(cube.getCenter()) 
			&& this.getSideLength() == cube.getSideLength();
		}		
		
		return  result;
	}
	
	@Override public int hashCode(){
		return (int)(this.getCenter().hashCode() 
						+ Math.rint(31 * (this.getSideLength()))) % (Integer.MAX_VALUE);
	}
	
	@Override public String toString(){
		return String.format("Cube {center point: %f, side length: %f}", this.getCenter().toString(), this.getSideLength());
	}
	public void attachObserver(CubeDimensions cubeDimensions){
		cubeDimensionsList.add(cubeDimensions);	
		cubeDimensions.objectModified(this);
	}
	
	public void detachObserver(CubeDimensions cubeDimensions){
		cubeDimensionsList.remove(cubeDimensions);		
	}
	
	public void notifyObservers(){
		for (CubeDimensions cubeDimension : cubeDimensionsList){
			cubeDimension.objectModified(this);
		}
	}
	
}
