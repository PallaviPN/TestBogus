package com.training.movie;

public class Apple {

	private int age;
	private String phone;

	public int setAge(int age)
	{
	 this.age= age;
	return age;
	}

	public String setphone(String phone)
	{
	 this.phone = phone;
	return phone;
	}
	
	public void getAge(){
	System.out.println("The age is" + age + "& the phone number is" +phone);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Apple a1= new Apple();
 a1.setAge(20);
 a1.setphone("9090909089");
 a1.getAge();
		
		
	}

}
