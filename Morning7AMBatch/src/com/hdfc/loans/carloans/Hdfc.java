package com.hdfc.loans.carloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		
		Hdfc Obj = new Hdfc();
		Obj.withdrawal();
		Obj.deposit();
		
	}

	@Override
	public void withdrawal() {
		
		System.out.println("I am overridden withdrawal from HDFC");
	}

	@Override
	public void deposit() {
		
		System.out.println("I am overridden deposit from HDFC");
		
	}

}
