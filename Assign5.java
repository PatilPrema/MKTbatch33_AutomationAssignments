package firstPackage;

public class Assign5 {
	//Assignment 5: Call multiple non static method

     void Student()
     {
    	 System.out.println("It's first non static method");
     }
     
     void Student1()
     {
    	 System.out.println("It's second non static method");
     }
     
     void Student2()
     {
    	 System.out.println("It's third non static method");
     }
     
	public static void main(String[] args) 
	{
        Assign5 a5 = new Assign5();
		a5.Student();
		a5.Student1();
		a5.Student2();
	}

}
