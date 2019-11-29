package com.hdfc.loans.carloans;

public abstract class FirstAbstract {
	
	public void m1()
	{
		
		System.out.println("I am m1 concreate method in class FirstAbstract");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) {
		
		FirstAbstract f = new ChildClass();
		f.m1();
		f.m2();
		
	}
	

}
