package com.training.movie;

class CylinderXyz{

	//creating a cylinder & setting its  height & radius using setters and getters...
	//calculate surface area & volume of the cylinder...
	
	
			private int height;
			private int radius;
			
			
			public void setHeight(int height) {
				this.height=height;
					
			}
			
			public int getHeight() {
				return height;
				
			}
			
			public void setRadius(int radius) {
				this.radius= radius;
			}
			
			public int getRadius() {
				return radius;
			}
			
			public double getVolume() {
				return Math.PI*radius*radius*height;
			}
			
			public double getSurfaceArea() {
				return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
			}
}

public class cwh44_setgetQuest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		CylinderXyz ce= new CylinderXyz();
		ce.setHeight(10);
		ce.setRadius(12);
		int h1=ce.getHeight();
		System.out.println(h1);
		int h2=ce.getRadius();
		System.out.println(h2);
		double volume=ce.getVolume();
		System.out.println(volume);
		double surfacearea=ce.getSurfaceArea();
		System.out.println(surfacearea);

	}

}
