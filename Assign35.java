package firstPackage;
//"Assignment_35: Arrays.
//O/P to be in below fashion.
//Name         Age            Salary
//Ram            51              143.25
//Vishnu         93              265.63
//Bhim           11               11.70"

public class Assign35 {

	public static void main(String[] args) 
	{
		   String name[] = new String[3];
		   name[0] = "Ram";
		   name[1] = "Vishnu";
		   name[2] = "Bhim";
		   
		   int age[] = new int[3];
		   age[0] = 51;
		   age[1] = 93;
		   age[2] = 11;
		   
		   double salary[] = new double[3];
		   salary[0] = 143.25;
		   salary[1] = 265.63;
		   salary[2] = 11.70;
		   
		   for(int i=0; i<=2; i++)
		   {
			   System.out.println(name[i]+ "     "+age[i] + "     " +salary[i]);
		   }
	}

}
