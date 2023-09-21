
package firstPackage;

public class Assign12 {
//Assignment 12:Does constructor overloading and method overloading possible?  --yes
	
	Assign12()
	{
		System.out.println("its just constructor");
	}
	
	Assign12(int a)
	{
		System.out.println("it is parametrized constructor");
	}
	
	static void MethodOverload()
	{
		System.out.println("it static methodOverloading");
	}
	
	void MethodOverload(double b)
	{
		System.out.println("it non static methodOverloading");
	}
	
	public static void main(String[] args) 
	{
       new Assign12();
       new Assign12(55);
       MethodOverload();
       Assign12 a12 = new Assign12();  //by creting object here again for reference variable again constructor got called
       a12.MethodOverload(1.2);
	}

}
