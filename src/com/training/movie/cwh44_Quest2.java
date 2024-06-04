package com.training.movie;

//creating a cylinder & setting its  height & radius using constructor...
//calculate surface area & volume of the cylinder...
//writing setter & getter is tough for everything so we use constructor and everything else remains same..
class cylinder1{
	
    int radius;
	int height;


	
	cylinder1(int radius,int height){
		
		this.radius= radius;
		this.height=height;
		
	}
	
	cylinder1(int radius){
		height= 1;
		this.radius= radius;
	}
	
	public double calVolume() {
		
		double volume= Math.PI*radius*radius*height;
		return volume;
	}
	
	public double surfaceArea() {
		
		double area = 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
		return area;
	}
	
}



public class cwh44_Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cylinder1 c1= new cylinder1(5,10);
		System.out.println("The volume is \t" + c1.calVolume() + "\nThe surface area is \t" + c1.surfaceArea());

		cylinder1 c2= new cylinder1(1);
		System.out.println("The volume is \t" + c2.calVolume() + "\nThe surface area is \t" + c2.surfaceArea());

	}

}
