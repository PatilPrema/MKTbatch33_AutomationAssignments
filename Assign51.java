package firstPackage;

class GrandParent1
{
	void method1()
	{
		System.out.println("grandparent method1");
	}
	void method2()
	{
		System.out.println("grandparent method2");
	}
}

class Parent1 extends GrandParent1
{
	void method3()
	{
		System.out.println("parent method3");
	}
	void method4()
	{
		System.out.println("parent method4");
	}
}

public class Assign51 extends Parent1{

	public static void main(String[] args) 
	{
		GrandParent1 g1 =  new Parent1(); //upcasting - implicitly
		g1.method1();
		g1.method2();//only parent class property we aare able to access in upcasting
		//GrandParent1 g1 =  (GrandParent1)p1;  //upcasting explicilty??
		Parent1 g2 = 	new Assign51(); //upcasting implicilty
		g2.method1();
		g2.method2();
		g2.method3();
		g2.method4();
		Assign51 a51 = (Assign51) g2 ; //downcasting, to do downcasting we need to perform upasting first then only we can able to do downcasting
		a51.method1();
		a51.method2();
		a51.method3();
		a51.method4();
		
	
	}
}
