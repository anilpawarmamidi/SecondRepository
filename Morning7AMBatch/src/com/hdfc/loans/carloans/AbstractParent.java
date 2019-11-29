package com.hdfc.loans.carloans;

public abstract class AbstractParent {
	
	public void m1()
	{
		System.out.println("I am overridden Class m1 from Parent");
	}
	
	public abstract void m2();
	
	
	public static void main(String[] args) {
		
		AbstractParent obj=new AbstractChild1();
		obj.m1();
		obj.m2();
		
		
	}
	

}
