package com.training.movie;

public class Test {
	
	Test(){
		System.out.println("in const");
	}
	
	static {
		System.out.println("from static 1");
	}
	
	static int i=test();
	
	
	static int test() {
		System.out.println("hi");
		return 10;
	}
	static {
		System.out.println("from static 2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        Test t1= new Test();
		System.out.println("from main");

		
		
	}

}
