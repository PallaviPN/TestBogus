package com.training.movie;

interface try1{

	int i=20;
	
	default int Printtry() {
		System.out.println("The valie of i is" + i);
		return i;
	}
	
	public void Printsomething();
	
	public void Printalphabets();
	
	}

interface try2{
	
	public void Happydays();
	
}

interface try3{
	
	default String [] NamesOfCounties() {
		String []s1= {"india", "america","germany"};
		return s1;
		
	}
}

public class InterfaceDefault implements try1,try2 {

	

	@Override
	public void Happydays() {
		// TODO Auto-generated method stub
		System.out.println("Print happy days");
		
	}

	@Override
	public void Printsomething() {
		// TODO Auto-generated method stub
		System.out.println("Print something");
		
	}
	
	String[] NamesOfCounties() {
			String s2[]= {"a","b","c"};
			return s2;
	}

	@Override
	public void Printalphabets() {
		
		System.out.println("This is Printalphabets method");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	
 InterfaceDefault id= new InterfaceDefault();
		
		String[] S1= id.NamesOfCounties();
		id.Printalphabets();
		id.Printsomething();
		
				
	}	

}