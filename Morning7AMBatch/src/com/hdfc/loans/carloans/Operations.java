package com.hdfc.loans.carloans;

public class Operations {

	int a,b,result;
	
	public Operations(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		
	}
	
	public void add()
	{
		result=a+b;
		System.out.println("The result of a and b addition is " + result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("The result of a and b substraction is " + result);
	}
	
	
	public static void main(String[] args) {
	
		Operations obj=new Operations(200, 150);
		obj.add();
		obj.sub();
		
	}

}
