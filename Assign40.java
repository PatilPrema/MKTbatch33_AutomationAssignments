package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 40:Launch google.com and click on image with help of link text after selecting image then type india and search it.

public class Assign40 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}

}
