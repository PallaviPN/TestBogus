package com.training.movie;

/*
*** WRITE THIS CODE IN NOTEPAD ***
 You have to create a package named com.codewithharry.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheritance to properly manage the code!
 Include methods like volume, surface area and getters/setters for dimensions
 */

class Rectangle{
	double len,bred,area;
	
	void setRectDim(double len, double bred) {
		System.out.println("Enter the length & breadth of the rectangle");
		this.len=len;
		this.bred=bred;
		System.out.println("The length you have set is \t" + len +bred +"& The breadth you have set is \t");
	}
	
	double getArea() {
		area= len*bred;
		System.out.println("The area of the rectangle is \t" + (len*bred));
		return area;
	}
	
	
	class Square{
		
		double side,sqarea;
		
		void setSquareDim(double side) {
			System.out.println("Enter the length of the side of a square");
			this.side=side;
			
			System.out.println("The length you have set is \t" + side );
		}
		
		double getArea() {
			sqarea= side*side;
			System.out.println("The area of the square is \t" + (side*side));
			return sqarea;
		}
	}
}



public class CustomPackage {
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		r1.setRectDim(5, 10);
	}

}
