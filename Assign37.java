package firstPackage;
//Assignment_37:Launch google.com and type india

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign37 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}

}
