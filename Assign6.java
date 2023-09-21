package firstPackage;

public class Assign6 {
//Assignment 6: Create a program,write 4 static methods&call them inside main method
	
	static void Add()
	{
		System.out.println("Calling multiple static methods");
	}
	
	static void Add1()
	{
		System.out.println("To call multiple we can just use its name");
	}
	
	static void Add2()
	{
		System.out.println("no need to create object to call multiple method, we have to call add method in main method to get output");
	}
	
	public static void main(String[] args) 
	{
        Add();
        Add1();
        Add2();
	}
	
}
