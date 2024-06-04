package com.training.movie;

class circle{
	
	double radius;
	
	circle(double rad){
		this.radius=rad;
		}
	
	double circleArea() {
		return Math.PI*this.radius*this.radius;
	}
		
}

class cylinder extends circle{
	
	double height;

	cylinder(double rad, double high){
		super(rad);   // due to inheritance the variable r is available here as well.
		this.height= high;
	}
	
	double cylinderArea() {
		return Math.PI*this.radius*this.radius*this.height;
	}
	
	
}


public class InheritancePracticeSetCwh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle c= new circle(5);
		System.out.println(c.circleArea());
		cylinder c1=new cylinder(2,3);
		System.out.println(c1.cylinderArea());
		

	}

}
