package com.training.movie;

interface cycle{
	void noGears();
	void nofuel();
}

interface scooter extends cycle{
	
	void horn();
	void petrol();	
}


public class InterfaceTestPolymorph implements cycle,scooter {

	

	@Override
	public void horn() {
		// TODO Auto-generated method stub
	System.out.println("cycle bell");	
	}

	@Override
	public void petrol() {
		// TODO Auto-generated method stub
		System.out.println("scooter petrol");
	}

	@Override
	public void noGears() {
		// TODO Auto-generated method stub
		System.out.println("cycle gears");	
	}

	@Override
	public void nofuel() {
		// TODO Auto-generated method stub
		System.out.println("cycle no fuel");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	cycle c= new InterfaceTestPolymorph();
	c.noGears();
	c.nofuel();
	
	scooter sc= new InterfaceTestPolymorph();
	sc.noGears();
	sc.nofuel();
	
	InterfaceTestPolymorph ip= new InterfaceTestPolymorph();
	ip.nofuel();
	ip.noGears();
	ip.petrol();
	ip.horn();
}

}