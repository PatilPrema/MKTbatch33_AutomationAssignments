package firstPackage;

public class Assign7 {
//Assignment 7:create 4 diff methods and call them inside main method
	
	void Add()
	{
		System.out.println("non static method-Add method");
	}
	
	static void Mul()
	{
		System.out.println("static mul method");
	}
	
	void sub()
	{
		System.out.println("non static sub method");
	}
	
	static void div()
	{
		System.out.println("static div method");
	}
	
	
	public static void main(String[] args) 
	{
		Assign7 a7=new Assign7();
		a7.Add();
		Mul();
		a7.sub();
		div();
	}

}
