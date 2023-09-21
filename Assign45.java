package firstPackage;
//Assignment 45: Launch http://flipkart.com/ 
//next Hover over Fashions next click on T-shirt next click on Men T-shirt
//next click on first T-shirt next click on Buy now.
//you will see excepition 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign45 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div/div/div/button")).click();
		WebElement Fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(Fashion).perform();
		driver.findElement(By.linkText("Men's T-Shirts")).click();
		Thread.sleep(2000);
		WebElement FirstProduct = driver.findElement(By.xpath("//img[@class='_2r_T1I'][1]"));
		FirstProduct.click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
	}

}
