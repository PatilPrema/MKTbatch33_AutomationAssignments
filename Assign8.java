package firstPackage;

public class Assign8 {
//Assignment 8:Method overloading
	
	void Dog()
	{
		System.out.println("its non static Zero param, I called it in main method with creting object n reference variable");
	}
	
	void Dog(int a, int b, double c)
	{
		System.out.println("It is non static with param method called it with object reference variable ");
	}
	
	static void Dog(char a, String b)
	{
		System.out.println("It is static method with the same name having parameters");
	}
	
	static void Dog(String name)
	{
		System.out.println("It is also static with 1 param present we can call it just by it's name");
	}
	
	public static void main(String[] args) 
	{
		Assign8 a8 = new Assign8();
		a8.Dog();
		a8.Dog(10, 20, 30);
		Dog('a', "Banglore");
		Dog("Prema");
	}
	

}
