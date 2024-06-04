package com.training.movie;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int x;
 
		System.out.println(" welcome to the game, below are the options\n Bronze level \n Silver level \n Gold level \n Platinum level");

	do{
		           System.out.println("Choose 1 for Bronze,2 for Silver, 3 for Gold & 4 for Platinum" + "Please exercise your choice");
				   Scanner sc= new Scanner(System.in);
				   int ch= sc.nextInt();

				if(ch==1){
				System.out.println("You chose 1.Bronze");
				}

				else if(ch==2){
					System.out.println("You chose 2.Silver");
				}

				else if(ch==3){
					System.out.println("You chose 3.Gold");
				}

				else if(ch==4){
					System.out.println("You chose 4.Platinum");
				}

				else 
				{
					System.out.println(" Incorrect choice, choose nos b/w 1-4");
				}

				System.out.println("Do you want to choose again, press 1 for Yes and 2 for No");
				x= sc.nextInt();
				}
	
	while(x==1);

				}

	}


