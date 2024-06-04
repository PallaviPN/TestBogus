package com.training.movie;

 


 public class AccessSpecifiers {
	
	
	protected int proInt=10;
	int defInt=5;
	
	public static void main(String[] args) {
		
		
		System.out.println("This is main method of parent class");
	}
	
	
	class Candidate{
		
		void marks(int a,int b) {
			System.out.println("The sum of marks is "+ a+b);
		
	}
	 
	}
	
	
		
	
	
	

}
