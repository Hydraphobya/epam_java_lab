package com.epam.first.entity;

/**
 * @author Hanna.Hlushakova
 *
 */

import com.epam.first.observer.IObserver;
import com.epam.first.action.CubeAction;
import com.epam.first.entity.Cube;

public class CubeDimensions implements IObserver{
	private double volume;
	private double area;

	public CubeDimensions(Cube cube) {
		this.volume = CubeAction.cubeVolume(cube);
		this.area = CubeAction.cubeArea(cube);
	}
	
	public void objectModified(Cube cube){
		this.volume = CubeAction.cubeVolume(cube);
		this.area = CubeAction.cubeArea(cube);
	}
	
	public double getVolume(){
		return this.volume;
	}
	
	public double getArea(){
		return this.area;
	}
	
	@Override public String toString(){
		return String.format("Cube dimensions {volume: %f, area: %f}", this.getVolume(), this.getArea());
	}
}
