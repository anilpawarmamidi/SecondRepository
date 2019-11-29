package com.hdfc.loans.educationloans;

import com.hdfc.loans.carloans.ClassAM1;

public class ClassAM3 extends ClassAM1{
	
	public void m3()
	{
		System.out.println("I am method m3 from ClassAM3");
	}

	public static void main(String[] args) {

		ClassAM3 obj=new ClassAM3();
		obj.m3();
		obj.m1();

	}

}
