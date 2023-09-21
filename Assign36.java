package firstPackage;
//"Assignment_36: Arrays.
//O/P to be in below fashion.
//Ram
//Vishnu         
//Bhim           
//51
//93
//11
//143.25
//265.63
//11.70

public class Assign36 {

	public static void main(String[] args)
	{
		String name[]=new String[3];
		   name[0] = "Ram";
		   name[1] = "Vishnu";
		   name[2] = "Bhim";
		   for(int i=0; i<=2; i++)
		   {
			   System.out.println(name[i]);
		   }
		   int age[]=new int[3];
		   age[0] = 51;
		   age[1] = 93;
		   age[2] = 11;
		   for(int j=0; j<=2; j++)
		   {
			   System.out.println(age[j]);
		   }
		   double salary[] = new double[3];
		   salary[0] = 143.25;
		   salary[1] = 265.63;
		   salary[2] = 11.70;
		   for(int k=0; k<=2; k++)
		   {
			   System.out.println(salary[k]);
		   }

	}

}
