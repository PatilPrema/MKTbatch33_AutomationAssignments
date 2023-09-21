package firstPackage;
//Assignment68: Write a program using thow and throws kyeword.
public class Assign_68_Throw_Throws {

	public static void main(String[] args) 
	{
		
		Assign_68_Throw_Throws t1=new Assign_68_Throw_Throws();
		t1.NewMethod();

		int age=18;
		if(age>18)
		{
			System.out.println("open www.youtube.com");
		}
		else
		{
			throw new NullPointerException("The User age is below 18 yeras");//it will throw this exception and also print the message you want to show 
			//throw new IllegalStateException("The User age is below 18 yeras"); --writing 2 exception not allowed
			
			//Exception in thread "main" java.lang.NullPointerException: The User age is below 18 yeras
			//at Throw_Throws_Keyword_Concept.main(Throw_Throws_Keyword_Concept.java:14)
		}
		
	}
	
	public void NewMethod() throws ArithmeticException
	{
		System.out.println("throws exception");
	}


}
