
public class Examp1 {

	int a=10;
	int b=20;
	int c;
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition of A and B is " + c);
	}
	
	public void sub()
	{
		c = b-a;
		System.out.println("Substraction from B to A is " + c);
		
		
	}
	
	public static void main(String[] args) {
		
	
		Examp1 obj=new Examp1();
	    System.out.println(obj.a);
	    System.out.println(obj.b);
	    System.out.println(obj.c);
	    obj.add();
	    System.out.println(obj.c);
	    obj.sub();
	    System.out.println(obj.c);
	    

	}

}
