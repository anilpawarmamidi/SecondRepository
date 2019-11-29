package com.hdfc.loans.carloans;

public interface RbiInter1 {
	
	public void deposit();
	public void withdrawal();
	
	public static void main(String[] args) {
		
		RbiInter1 obj=new BankClass1();
		obj.deposit();
		obj.withdrawal();
		RbiInter1 obj1 = new BankClass2();
		obj1.deposit();
		obj1.withdrawal();
		
	}

}
