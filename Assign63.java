package firstPackage;

import java.util.Date;

//Assignment63: Write a Program to print server time.

public class Assign63 {

	public static void main(String[] args)
	{
		Date d=new Date();
		long d1=d.getTime();
		System.out.println(d1 + " = Epoch time");//It is only the server time is
		Date d2 = new Date(d1);
		Date d3 = new Date(d1+(1000*60*60*24*5));
		System.out.println(d2 + " = It is current Date and time");
	}

}
