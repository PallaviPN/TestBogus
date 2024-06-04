package com.training.movie;

public class Exception_Haha_Hehe {
	
	
		
		 static int a=10;
		static int b=0;
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // prints haha during Arithmetic exception and Hehe during Illegal argument exception
	
		
		try 
			
		{
			int c= a/b;
		}
		
		catch(ArithmeticException e) {
			System.out.println("Haha");
		}
		
		
		catch(IllegalArgumentException e) {
		  System.out.println("Hehe");	
		}
			
		}

}
