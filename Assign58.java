package firstPackage;
//"Assignment58: Write a program for String function 
//1) length();2) charAt(index);3) indexOf(char);4) subString(origin);5) subString(origin,destination);6) trim();7) isEmpty();
//8) concat(""String value"");

public class Assign58 {

	public static void main(String[] args) 
	{
		String s = "Bangalore";
		System.out.println(s.length());
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf('a'));
		System.out.println(s.substring(1));
		System.out.println(s.substring(3, 5));
		System.out.println(s.trim());
		System.out.println(s.isEmpty());
		System.out.println(s.concat(" Karnataka "));
	
		
	}

}
