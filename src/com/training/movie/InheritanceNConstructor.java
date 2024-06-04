package com.training.movie;


class Aha{
	
	Aha(){
		
		System.out.println("Default const of A");
	}
	
	Aha(int i){
		i=6;
		System.out.println("Value of i is"+i);
	}
	
	Aha(int i,int j)
	{
		
		
		System.out.println("A two parameter, value of i & j is" +i+ "\t" +j);
	}		


Aha (int i, int j, int k){
	
	i=10;
	j=20;
	k=30;
	
System.out.println("Three parameters are" +i+"\t" +j+"\t"+k);
	
}

 }

class Baha extends Aha{
	
	
	
	 Baha(int i){
		 
		 super(8,9,10);
		 i=25;
		  System.out.println("Validating single parameter const did not get excecuted when parameter mismatch exists" +i);
	 }	
}


public class InheritanceNConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    
		Aha a1= new Aha();
		Aha a2=new Aha(1,2);
	   	
		Baha b1= new Baha(9);
		
		
		
	}

}
