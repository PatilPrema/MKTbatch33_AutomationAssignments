package firstPackage;
//Assignment_57: Write a Program for Exception handling. Use finally block in the program.

public class Assign57 {
public static void main(String[] args) {

	try
	{
		int a=1/0;
		System.out.println("I am Try block, I will only execute when there is no exeception");
	}
	
	catch(ArithmeticException a1)
	{
		System.out.println("Handled Exception here, I will only execute when there is exeception");
	}
	
	catch(NullPointerException a1)
	{
		System.out.println("Handled one more Exception here, we can write more then 1 cath block");
	}
	
	finally
	{
		System.out.println("Thank you for visiting");
	}
	
	
}
}
