package firstPackage;
//"Assignment60: String=""MKT""
//Output to be in the below format:
//m
//k
//t"
public class Assign60 {

	public static void main(String[] args)
	{
        String m = "MKT";  //o/p=mkt line by line
      String s1=  m.toLowerCase();
      
        for(int i=0; i<s1.length();i++)
        {
        	System.out.println(s1.charAt(i));
        }
	}

}
