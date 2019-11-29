package com.hdfc.loans.carloans;

public interface Rbi {
	
	public void withdrawal();
	public void deposit();
	
	public static void main(String[] args) {
		
	
		/* i is Reference Variable */
		
		Rbi i = new Hdfc();
		i.deposit();
		i.withdrawal();
		
		
	}

}
