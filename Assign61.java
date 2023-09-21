package firstPackage;
//"Assignment61: String=""MY NAME IS MKT""
//Output to be in the below format:
//My Name Is Mkt"
public class Assign61 {

	public static void main(String[] args) {

		 String m1="MY NAME IS MKT"; 
		 String m2=m1.substring(0, 1);
		 String m3=m1.substring(1, 2);
		String m4 = m3.toLowerCase();
		String m5 =m2.concat(m4);//My
		String m6=m1.substring(3, 4);
		String m7=m1.substring(4, 7);
		String m8 = m7.toLowerCase();
		String m9 = m6.concat(m8);//Name
		String m10=m1.substring(8, 9);
		String m11=m1.substring(9, 10);
		String m12 = m11.toLowerCase();
		String m13 = m10.concat(m12);//Is
		String m14=m1.substring(11, 12);
		String m15=m1.substring(12, 14);
		String m16 = m15.toLowerCase();
		String m17 = m14.concat(m16);//Mkt
		
		String m18 = m5.concat(" ").concat(m9).concat(" ").concat(m13).concat(" ").concat(m17);
		
		 System.out.println(m18);
		
		
		/*
	     String   m4=m1.substring(0, 10);
	      String m2 =  m1.substring(11);
	      String m5 = m1.substring(11, 12);
	     String m7 = m1.substring(12);
	    String m8 = m7.toLowerCase();
	      //System.out.println(m5);
	      String m6 = m5.toUpperCase();
	      //String m3 = m2.toLowerCase();
	      System.out.println(m4.concat(" ").concat(m6).concat(m8));
		*/
	}

}
