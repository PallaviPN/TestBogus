package com.training.movie;

import java.util.Random;
import java.util.Scanner;

public class Cwh50_RandomNo {
	double Rnumber;
	int inputnumber;
	int attemptno=0;
	
	
	public Cwh50_RandomNo() {
		
		Random randomno= new Random();
		this.Rnumber= randomno.nextInt(1,10);
		
		
	}
	
	public int takeNumber() {
		System.out.println("Enter any number between 1 to 9 that you would like to guess");
		Scanner sc= new Scanner(System.in);
		inputnumber=sc.nextInt();
		return inputnumber;
		
	}
	
	public boolean Iscorrect() {
		attemptno++;
		if (inputnumber==Rnumber) {
			System.out.println("The numbers are same!!, you guessed in attempt no" + attemptno);
			 return true;
		}
		else if(inputnumber<Rnumber){
			System.out.println("The number you entered is small");
		}
		else if(inputnumber>Rnumber){
			System.out.println("The number you entered is greater");
		}
	return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cwh50_RandomNo cr= new Cwh50_RandomNo();
		boolean j= false;
		while(!j) {
			
			System.out.println("The number you entered is" + cr.takeNumber());
			System.out.println("The number generated is" + cr.Rnumber );
			j=cr.Iscorrect();
		}
		

		
		
		
	}

}
