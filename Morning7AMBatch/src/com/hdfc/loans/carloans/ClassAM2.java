package com.hdfc.loans.carloans;

public class ClassAM2 extends ClassAM1{

	public void m1()
	{
		System.out.println("I am method m1 from ClassAM2");
	}
	
	
	public void m2()
	{
		System.out.println("I am method m2 from ClassAM2");
	}
	
	public static void main(String[] args) {
		
		ClassAM2 obj=new ClassAM2();
		obj.m2();
		obj.m1();

		ClassAM1 obj1=new ClassAM1();
		obj1.m1();

		
		ClassAM1 obj2=new ClassAM2();
		obj2.m1();

		
		
	}

}
