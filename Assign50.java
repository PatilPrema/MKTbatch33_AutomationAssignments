package firstPackage;
//assign:50//upcasting in multilevel - upcasting from parent to grandparent and also downcatsing
class GrandParent
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

class Parent extends GrandParent
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

public class Assign50 extends GrandParent{

	public static void main(String[] args) 
	{
         GrandParent p1 = new Assign50();//upcasting -implicit way
      //  GrandParent p2 = (GrandParent)p1;  //upcasting -implicit way
         p1.method1();
         p1.method2();
         Assign50 a1=(Assign50)p1;//downcasting - explicitly
         a1.method1();
         a1.method2();
	}

}
