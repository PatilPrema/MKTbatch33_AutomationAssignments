package firstPackage;

import org.testng.annotations.Test;

//Assignment55:Annotations-Create single class and add 3 @Test annotations with 3- methods(add,mul,sub) and 
//check order of execution.

public class Assign55 {

	@Test
	public void add()
	{
		int a=10;
		int b=30;
		int c = a+b;
		System.out.println(c);
	}
	@Test
	public void sub()
	{
		int a=10;
		int b=30;
		int c = a-b;
		System.out.println(c);
	}
	
	@Test
	public void mul()
	{
		int a=10;
		int b=30;
		int c = a*b;
		System.out.println(c);
	}
	

}
