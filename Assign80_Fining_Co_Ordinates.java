package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Assignment80: Write a Program to launch Amazon.in and find the co-ordinates of Brazil link
public class Assign80_Fining_Co_Ordinates {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement bottomElemnt = driver.findElement(By.xpath("//h2[.='Baby and Kids']"));
		Point XandY = bottomElemnt.getLocation();
		int xaxis = XandY.getX();
		int yaxis = XandY.getY();
		System.out.println(xaxis);
		System.out.println(yaxis);
		Actions a=new Actions(driver);
		a.moveByOffset(xaxis, yaxis).build().perform();
		
	}

}
