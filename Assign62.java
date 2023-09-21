package firstPackage;

import java.util.Date;
//Assignment62: Write a Program to find the Past,present,future time
public class Assign62 {

	public static void main(String[] args) {
		Date d=new Date();
		long d1=d.getTime();
		System.out.println(d1 + " = Epoch time");//it will give epoch time, it is not human understanable time we can convert it 
		Date d2 = new Date(d1);
		Date d3 = new Date(d1+(1000*60*60*24*5));//adding + if you want future time if u want past time u can add -.
		System.out.println(d2 + " : It is current Date");
		Date d4 = new Date(d1+(1000*60*60*24*5));
		System.out.println(d4 + " : It is Future Date next five days from today");
		Date d5 = new Date(d1-(1000*60*60*24*5));
		System.out.println(d5 + " : It is Past Date before five days from today");
		
		String currentDate = d2.toString();
		String Cdate = currentDate.substring(8, 10); //it will give us currect date
		String Cmonth =currentDate.substring(4, 7); //it will give us currect month
		String CDay =currentDate.substring(0, 3);  //it will give us currect day
		String Cyear =currentDate.substring(24, 28);  //it will give us currect year
		System.out.println(Cdate);
		System.out.println(Cmonth);
		System.out.println(CDay);
		System.out.println(Cyear);//year is at last so we can write it with substring with 1 param
		//write in currect format DD/MMM/YYYY
		String Correctdate = Cdate.concat("/").concat(Cmonth).concat("/").concat(Cyear);
		System.out.println(Correctdate);

	}

}
