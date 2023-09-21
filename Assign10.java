package firstPackage;

public class Assign10 {
//Assignment 10:Constructor Overloading
	
	Assign10()
	{
		System.out.println("Hi, am constuctor");
	}
	Assign10(int a)
	{
		System.out.println("Hello am parameterized constructor");
	}
	Assign10(int a, int b)
	{
		System.out.println("Helloo");
	}
	Assign10(char a, boolean b)
	{
		System.out.println("Hiiiii");
	}
	
	
	public static void main(String[] args) 
	{
       new Assign10();
       new Assign10(20);
       new Assign10(20,20);
       new Assign10('a', true);
	}

}
