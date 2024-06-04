package com.training.movie;

import java.util.Scanner;

public class PgmIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= new int[3];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array index you want to enter");
		int a= sc.nextInt();

		if(arr[a]<=arr.length-1)
		{

			System.out.println("The array index you chose is" + a + "and the value at this index is" +arr[a]);
		 }

		else {
			System.out.println("Choose index 3 or lesser");  // the pgm fails to address the exception which can lead to obstruction to the flow of the pgm.

		}

	}

}
