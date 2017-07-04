/**
 * 
 */
package com.epam.first.action;

import com.epam.first.entity.Cube;
import com.epam.first.entity.Point;
import com.epam.first.entity.Ratio;

//import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.LogManager;

/**
 * @author Hanna_Hlushakova
 *
 */
public class CubeAction{	
	
	//private static final Logger LOG = Logger.getLogger(CubeAction.class);
	
		//new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	
	public static boolean isCube(Point point, double sideLength){
		return (sideLength > 0);
	}

	public static double cubeArea(Cube cube){
		double area = 6 * Math.pow(cube.getSideLength(), 2); 
		return area;
	}
	
	public static double cubeVolume(Cube cube){
		double volume = Math.pow(cube.getSideLength(), 3);
		return volume;
	}
	
	public static Ratio volumeRatioByCoordinatePlane(double centerProjection, double sideLength){

		double pos = centerProjection + sideLength / 2; 
		double neg = centerProjection - sideLength / 2; 
		
		Ratio ratio;
		
		if(neg >= 0){
			ratio = new Ratio(1, 0);
		}
		else if (pos <= 0){
			ratio = new Ratio(0, 1);
		}
		else{
			ratio = new Ratio(pos / sideLength, (neg * -1) / sideLength);
		}	
		
		return ratio;
	}
	
	public static boolean isBaseOnCoordinatePlan(Cube cube){
		double halfLength = cube.getSideLength() / 2;
		return (Math.abs(cube.getCenter().getX()) == halfLength)
					|| (Math.abs(cube.getCenter().getY()) == halfLength)
					|| (Math.abs(cube.getCenter().getZ()) == halfLength);
	}

}
