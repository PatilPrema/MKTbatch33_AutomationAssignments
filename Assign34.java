package firstPackage;
//Assignment_34: this calling statement with parameterized and non parameterized constructor

public class Assign34 {
	Assign34()
	{
		this(2);
		System.out.println("it non param this calling statment");
	}
	Assign34(int a)
	{
		//this(); //for this calling statement we always need to write it explixitly, it is not present implicitly
		System.out.println("it's parameterised this calling statement");
	}
	public static void main(String[] args) 
	{
       new Assign34();
	}

}
