package Package1;

public class Class1 {

int a,b,result;
	
	public Class1(int a, int b)
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
	
		Class1 obj = new Class1(10,20);
		obj.add();
		obj.sub();
	}

}
