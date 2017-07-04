package com.epam.first.entity;

public class Point { 
	private double x; 
	private double y; 
	private double z;	
	
	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;	
		this.z = z;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	@Override public String toString(){
		return String.format("(x = %f, y = %f, z = %f)", this.getX(), this.getY(), this.getZ());
	}	
	
	@Override public boolean equals(Object obj){
		boolean result = false;
		
		if(obj == this){
			result = true;
		}
		else if(null == obj){
			result = false;
		}
		else if(obj instanceof Point){
			Point point = (Point) obj;
			result = this.getX() == point.getX() 
					&& this.getY() == point.getY() 
					&& this.getZ() == point.getZ();
		}
		
		return result;
	}
	
	@Override public int hashCode(){
		
		return (int)(Math.rint(1000 * this.getX()) 
					- Math.rint(100 * this.getY()) 
					+ Math.rint(10 * this.getZ())) % (Integer.MAX_VALUE);
	}
}
