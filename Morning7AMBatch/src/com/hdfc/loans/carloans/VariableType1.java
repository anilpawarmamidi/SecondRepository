package com.hdfc.loans.carloans;

public class VariableType1 {
	
	int x=100;
	static String cname="vmware";
	
	
	public void add()
	{
		int z = 1000;
		System.out.println(z);
		System.out.println(x);
		System.out.println(cname);
		System.out.println(VariableType1.cname);
		
	}

	public static void main(String[] args) {
		
		VariableType1 obj=new VariableType1();
		obj.add();
		System.out.println(obj.x);
		System.out.println(cname);
		System.out.println(VariableType1.cname);
		
		
	}

}
