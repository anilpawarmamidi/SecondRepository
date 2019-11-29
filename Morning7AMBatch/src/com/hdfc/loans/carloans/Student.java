package com.hdfc.loans.carloans;

public class Student {

	int sno;
	String sname;
	
	public Student(int sno, String sname)
	{
		this.sno=sno;
		this.sname=sname;
		
	}
	
	public void StudentDetails()
	{
		System.out.println(sno);
		System.out.println(sname);
	}
	
	public static void main(String[] args) {

		Student obj=new Student(100,"Student Name");
		obj.StudentDetails();
		
		
	}

}
