package com.training.movie;

import java.util.Scanner;

public  class ExceptionClass extends Exception  {
//	static double radius;

	public static double area(double radius) throws ExceptionClass {
    
		double area=Math.PI*radius*radius;
		
		if(radius<2) {
			throw new ExceptionClass();
		}
		
		return area;		
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try {
				System.out.println(area(1));
			} catch (ExceptionClass e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				System.out.println(e.getMessage());
				
			}
		 
 }
}
