package com.hdfc.loans.carloans;

public class AbstractChild1 extends AbstractParent{

	public static void main(String[] args) {

		AbstractChild1 obj = new AbstractChild1();
		obj.m2();
		obj.m1();
	}

	@Override
	public void m2() {
		
		System.out.println("I am overridden m2 method from AbstractChild1");
		
	}

}
