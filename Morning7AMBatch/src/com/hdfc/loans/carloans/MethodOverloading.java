package com.hdfc.loans.carloans;

public class MethodOverloading {

	
	public void add(int a)
	{
		System.out.println("This is gold customer function");
		
		
	}
	

	public void add(int a, float b)
	{

		System.out.println("This is Paltinum customer function");
		
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.add(100);
		obj.add(200, 312.23f);
		
	}

}
