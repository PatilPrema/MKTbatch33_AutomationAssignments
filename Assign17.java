package firstPackage;

public class Assign17 {
//Assignment 17: LOgicalOperator
	
	public static void main(String[] args) 
	{
      int a=100;
      int b=200;
      if(a<=b && a!=b)
      {
    	System.out.println("its true");  
      }
      if(a<=b || a!=b)
      {
    	  System.out.println("it is also true");
      }
      if(!(a<=b && a!=b))
      {
    	  System.out.println("This is also true");
      }
	}

}
