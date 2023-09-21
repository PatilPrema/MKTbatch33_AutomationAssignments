package firstPackage;
//Assignment 38:Launch facebook.com and do login
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign38 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("premapatil225.com");
		driver.findElement(By.name("pass")).sendKeys("9945684228");
		driver.findElement(By.name("login")).click();
	}

}
