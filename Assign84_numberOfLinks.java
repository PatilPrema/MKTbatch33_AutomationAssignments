package firstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Assignment84: Write a Program to login to amazon.in and find out the number of links present in the webpage.

public class Assign84_numberOfLinks 
{

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		List<WebElement> totalLinks = d1.findElements(By.tagName("a"));
		int number = totalLinks.size(); //this size method will be present with only findelements meanse whenever we use List of webelements
		System.out.println(number);//25
		
		d1.get("https://www.amazon.in");
		d1.manage().window().maximize();
		List<WebElement> totalLinksAmazon = d1.findElements(By.tagName("a"));
		int number1 = totalLinksAmazon.size(); 
		System.out.println(number1);//143
		
	}
	
}
