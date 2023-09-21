package firstPackage;
import java.util.Scanner;
//Assignment69: Write a program on Switch, using Scanner class to accept the input.

public class Assign69 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a = s1.nextInt();
		int b=s1.nextInt();
		
		switch(a)
		{
		case 1:System.out.println("It is switch case 1");
		//break; if we won't give break then case 1 will leak to case 2
		
		case 2:System.out.println("It is switch case 2");
		break;
		
		case 3:System.out.println("It is switch case 3");
		break;
		}
		
		switch(b)//if we give which no is not in case then defalut will execute for ex if giving switch(100)
		{
			case 7 :System.out.println("It is switch case 7");
			break;
			
			case 8:System.out.println("It is switch case 8");
			break;
			
			default:System.out.println("It is switch case default");
			
		}
	}

}
