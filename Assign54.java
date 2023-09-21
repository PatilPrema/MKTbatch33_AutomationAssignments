package firstPackage;
//Assignment54:Launch JSAM application,check if the last name isDisplayed,if yes then check isEnable,if yes then type name.
//(Do with if block)

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign54 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/ADVIT%20COMPUTERS/MY%20DATA/Downloads/learningHTML1%20(2).html");
		boolean username = driver.findElement(By.name("lname")).isDisplayed();
		System.out.println(username);
		if (username==true)
		{
			Boolean lastname = driver.findElement(By.name("lname")).isEnabled();
			System.out.println(lastname);

			if(lastname==true)
			{
				driver.findElement(By.name("lname")).sendKeys("Patil");
			}
		}
	}

}
