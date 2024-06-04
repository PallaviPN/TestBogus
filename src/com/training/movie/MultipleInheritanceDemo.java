package com.training.movie;


interface Circle1{
	
	void area();
	void parameter();
}


interface Square{
	
	void area();
	void parameter();
	
}
public class MultipleInheritanceDemo implements Circle1,Square{
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Finds area");
		
	}
	

	@Override
	public void parameter() {
		// TODO Auto-generated method stub

		 System.out.println("Finds parameter");
	}	

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub




	}

}
