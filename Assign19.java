package firstPackage;

public class Assign19 {
//Asignment 19:what is the order of execution if SIB,IIB,Constructor,mainmethod  present in single program
	
	static 
	{
		System.out.println("Hi, am SIB block - static initialization block, I will be 1st execute all the time");
	}
	
	{
		System.out.println("Hi, am IIB block- Instance Initialization block, before constructor i will get execute whenev u create object ");
	}
	
	Assign19()
	{
		System.out.println("Hi, Am constructor");
	}
    
	
	public static void main(String[] args) 
	{
       System.out.println("HI, Am main method");
       new  Assign19();
	}

}
