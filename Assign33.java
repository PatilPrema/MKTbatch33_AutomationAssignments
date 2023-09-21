package firstPackage;
//Assignment_33: Explicit Super calling statement


class SuperParent
{
	SuperParent(int a, String b)
	{
		System.out.println("Hi, I'm Explicit super calling parent class constructor");
	}
	SuperParent()
	{
		System.out.println("Hi, I'm Implicit super calling parent class constructor");
	}
	
}

public class Assign33 extends SuperParent
{
	Assign33()
	{
		super(12, "Prema");
		System.out.println("Hi, I'm Explicit super calling child class constructor");
	}
	
	public static void main(String[] args) 
	
	{
		new SuperParent();
		new Assign33();
	}

}
