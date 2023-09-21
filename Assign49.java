package firstPackage;
//Assignment49: Store your weight in byte and later change the dataype to long to 
//store your weight and Vice versa

public class Assign49 {

	public static void main(String[] args) 
	{
		byte weight = 45;
		long wt = weight;
		System.out.println(wt);  //implictly  - it is wideing
		long wt1 = (byte)weight;  //explicitly
		System.out.println(wt1);
		
		long wt2= 55L;
		byte wt3 = (byte) wt2;  //It is narrowing, It can be done only explicitly
		System.out.println(wt3);
		
	}

}
