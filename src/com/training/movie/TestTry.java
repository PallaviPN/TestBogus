package com.training.movie;

import java.util.Scanner;

public class TestTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int[]marks= {1,2,3,4,5};
		Scanner sc= new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			
		
		System.out.println("Enter the array index whose value you want to  be displayed");
		
		int user_val= sc.nextInt();
		
		
	try{

	System.out.println("Welcome, enter the the index");

		  try{
               System.out.println("the value you have entered is"+ marks[user_val]);
               flag=false;
              }
		   catch(ArrayIndexOutOfBoundsException e)
		     {
		      System.out.println("Array could not be accessed due to reason \t" +e);
		     }
		
	}
		
		catch (Exception e){
		 System.out.println(" you have entered the outer catch block");
		}

	}
		System.out.println("Thanks for using the pgm");
		
		*/
		
		int [] marks= new int[3];
		marks[0]=0;
		marks[1]=1;
		marks[2]=2;
		
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		while(flag) {
		       System.out.println("Enter the index whose value you would like to print");
		      int y= sc.nextInt();
		

		try{

			System.out.println("The array index that you choose to print is "+y + "and the value there is " +marks[y]);
		flag=false;
		    }
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("The array could not be printed & the reason is" +e);
		 }
		
		}
	
		System.out.println("Thanks for using this program");
          
	            }
	
}


