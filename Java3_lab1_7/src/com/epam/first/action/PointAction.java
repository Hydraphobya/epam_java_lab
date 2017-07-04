/**
 * 
 */
package com.epam.first.action;

import com.epam.first.entity.Point;

/**
 * @author Hanna_Hlushakova
 *
 */
public class PointAction {
	public static double  length(Point point){
		
		return Math.hypot(Math.hypot(point.getX(), point.getY()), point.getZ()); 
	}

}
