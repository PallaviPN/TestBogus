package com.training.movie;

import java.util.Scanner;

class Functioncollections{
	
	public void display() {
		System.out.println("From display");
	}
	
	public int numberTesting() {
		System.out.println("From numberTesting");
		return 5;
	}
	
	public String printString() {
		String s="Hello";
		System.out.println(" khud kar le saale");
		return s;
	}
}

public class SwitchWithFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String ch;
		int y;
		
		
		Functioncollections f1= new Functioncollections();
		
		do {
			
		
		System.out.println("Choose any one option- display, numberTesting,printString");
		Scanner sc= new Scanner(System.in);
		ch=sc.nextLine();
		
	{	
		switch(ch) {
		
		case "display"-> f1.display();
	         // break;
	          
	          
		case"numberTesting"-> System.out.println(f1.numberTesting()+10);
		     //break;
		     
		case"printString"-> System.out.println(f1.printString());
		 //break;
		
		 default-> System.out.println("You did not make a choice");
		
		}
		
	}
	System.out.println("Do you want to continue making choice, press 1 for Yes & 2 for No");
	y= sc.nextInt();
	
		
	} while (y==1); 
		System.out.println("Thanks for using the pgm");
}
	

}
