package com.training.movie;

import java.util.Scanner;

class StringLogics{
	int count=0;
	// Check if a given char is vowel or not 
	public boolean checkVowel(char input) {
		
		
		switch(input) { 
		
		case'a': 
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U': System.out.println("You entered a vowel");
		         return true;
		
		default: System.out.println("It is not a vowel");
			     return false;
		}
		
	}
		
		public void countVowelInString(String checkString) {
		   
			char[]stringarr= checkString.toCharArray();
		    int length=stringarr.length-1;
			
			for(int i=0; i<=length;i++) {
			 if((stringarr[i]=='a') || (stringarr[i]=='e')||(stringarr[i]=='i')||(stringarr[i]=='o')||(stringarr[i]=='u')) 
			 count++;
				 
			 }
					
		}
		
		public void removeWhiteSpaces(String inputstr)
		{
			String Outputstring= inputstr.replaceAll("\s", "");
			System.out.println(Outputstring);
		}
	
}



public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		//System.out.println("Enter the character to check if it a vowel or not");
		//Scanner sc= new Scanner(System.in);
		//char input= sc.nextLine().charAt(0);
		StringLogics sl= new StringLogics();
		//System.out.println(sl.checkVowel(input));
		//Enter the String to count occurrence of vowels
		//String checkString=sc.nextLine();
		sl.removeWhiteSpaces(" What  A Good Day");
		
		
		
		}
	}
	


