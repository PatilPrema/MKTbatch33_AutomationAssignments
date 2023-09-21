package firstPackage;

public class Assign18 {
//Assignment 18:Localglobal program
	
	 static int a=100;  //it is declaring n initializing, for GV we can do it declaring here n initializing in any methods, but can't declare n initialise in 2 lines
	public static void main(String[] args) 
	{
		int b=200; // it is local variable, we should intialize evry time bcz it does't hv default value
		System.out.println(a);
		System.out.println(b);
		if( a<100)
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println(b);
		}
	}

}

//note:blue color variable is global and brown is local variable