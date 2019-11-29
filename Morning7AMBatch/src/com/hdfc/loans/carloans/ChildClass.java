package com.hdfc.loans.carloans;

public class ChildClass extends FirstAbstract {

	public static void main(String[] args) {
	
		ChildClass Obj = new ChildClass();
		Obj.m1();
		Obj.m2();
		
		
	}
	

	@Override
	public void m1() {
		
		System.out.println("Implementation of m1 from ChildClass");
	}
	

	@Override
	public void m2() {
		
		System.out.println("Implementation of m2 from ChildClass");
	}

}
