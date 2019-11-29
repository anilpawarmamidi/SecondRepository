package Package2;

import Package1.Class1;

public class Class3 extends Class1{

	public Class3(int a, int b) {
		super(a, b);
		
	}

	public static void main(String[] args) {
		
		Class3 obj=new Class3(200,100);
		obj.add();
		obj.sub();
		
	}

}
