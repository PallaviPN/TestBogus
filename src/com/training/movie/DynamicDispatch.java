package com.training.movie;

class A {
	
	//int a;
	
     public	void callme() {
	  System.out.println("Call super class");
		 }
	
     public int add(int c) {
	 return c;
         }
}

class B extends A{
	
	@Override
	public void callme() {
		System.out.println("call first sub class");
		}
}
	class C extends B{
		
		public void callme() {
			System.out.println("call second sub class");
		}
		
	}
	
	



public class DynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    A a= new B();
    a.callme();
    
    B b= new C();
    b.callme();

    
	}

}
