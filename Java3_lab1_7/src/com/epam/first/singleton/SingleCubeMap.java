package com.epam.first.singleton;

import java.util.HashMap;
import java.util.Map;

import com.epam.first.entity.Cube;
import com.epam.first.entity.CubeDimensions;

/**
 * @author Hanna.Hlushakova
 *
 */
public class SingleCubeMap {
	private  HashMap<Cube, CubeDimensions> cubes = new HashMap<Cube, CubeDimensions>(); 
	private static SingleCubeMap theCubeMap;
	private static boolean theCubeMapIsAvaliable = true;

	private SingleCubeMap() {
	}
	
	public static SingleCubeMap getTheCubeMap(){
		if(theCubeMapIsAvaliable){
			if(null == theCubeMap) {
				theCubeMap = new SingleCubeMap(); 
			}
			theCubeMapIsAvaliable = false;
			return theCubeMap;
		}
		else
		{
			return null;
			// Throw error 
		}
	}
	
	public void addCube(Cube cube, CubeDimensions cubeDimensions){
		this.cubes.put(cube, cubeDimensions); 
	}

	public String toString(){
		StringBuilder resultString = new StringBuilder();
		for (Map.Entry<Cube, CubeDimensions>  entry: cubes.entrySet()){
			resultString.append( entry.getKey() + " = " + entry.getValue() + "; ");
		}
		return resultString.toString();
	}
		
	public static void returnTheCubeMap(){
		theCubeMap.clearnCubeMap();
		theCubeMapIsAvaliable = true;
	}
	
	public void clearnCubeMap(){
		this.cubes.clear();
	}   
}
