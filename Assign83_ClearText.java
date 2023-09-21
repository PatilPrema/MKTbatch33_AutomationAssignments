package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//"Assignment 83: Write a Program to launch Google.com and type India, and clear the text field by below two ways,
//1) .clear();
//2) using KEYS functionality"

public class Assign83_ClearText
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d1 = new ChromeDriver();
		d1.get("file:///C:/Users/Admin/Downloads/learningHTML1.html");
	    WebElement Usaername = 	d1.findElement(By.id("1"));
	    Usaername.sendKeys("Prema");
	    WebElement Passwd = 	d1.findElement(By.id("3"));
	    Passwd.sendKeys("1234");
		Thread.sleep(2000);
		//Usaername.clear();
		
		Usaername.sendKeys(Keys.CONTROL+"a");
		Usaername.sendKeys(Keys.BACK_SPACE);
		d1.navigate().refresh();//also we can done on refreshing the page, evething will remove
		
	}
}
