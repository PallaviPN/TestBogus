package com.training.movie;

import java.util.Scanner;

public class Pgm3ErrorException_CWH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= new int[3];
		arr[1]=1;
		arr[2]=2;
		 
		boolean flag=true;
		int count=0;
		
		Scanner sc= new Scanner(System.in);
		
		while(flag==true && count<5){
			
			System.out.println("Enter the array index you want to enter");
		    int a= sc.nextInt();

		     try{
			       System.out.println("The array index you choose is" + a + "and the value at this index is \t" +arr[a]); 
		           // if this line is correctly printed then we can end the try block & no need to go to catch block.
		        	//Also we got valid index so we can exit the while loop.
                    flag=false;  			
		        }

		    catch(ArrayIndexOutOfBoundsException e){
			        count++;
			        System.out.println("The array could not be printed due to exception" +e);
			        System.out.println("This is try number" + count);
	        	}
		
	}
		  
		if(count >=5) {
			System.out.println("Error");
		}
		System.out.println("Thanks for using the pgm");
	}
		
		
		
		
	}


