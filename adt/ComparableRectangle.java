package com.ava.adt;
//Ye Cong 1306248
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
	private String area;
	public ComparableRectangle(double length, double width) {
		super(length, width);
	}
	public int compareTo(ComparableRectangle o) {
		if (area() > o.area())
			return 1;
		else if (area() < o.area())
			return -1;
		else
			return 0;
	}

	private int area() {
		// TODO Auto-generated method stub
		return 0;
	}
	private String getLength() {
		// TODO Auto-generated method stub
		return null;
	}	
	public String toString() {
		return "length: " + getLength() + " width: " + area;
	}
	
}
