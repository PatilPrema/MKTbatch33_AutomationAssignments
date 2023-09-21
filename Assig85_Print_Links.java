package firstPackage;
//Assignment85: Write a Program to login to amazon.in and find out the number of links present in the webpage and print the same.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig85_Print_Links {

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		List<WebElement> totalLinks = d1.findElements(By.tagName("a"));
		int number = totalLinks.size();
		System.out.println(number);
		
		for(int i=0; i<number;i++)
		{
			WebElement a1 = totalLinks.get(i);
			String names = a1.getText();
			System.out.println(names);
		}
		
		//amazon
		d1.get("https://www.amazon.in");
		d1.manage().window().maximize();
		List<WebElement> totalLinksAmazon = d1.findElements(By.tagName("a"));
		int number1 = totalLinksAmazon.size(); 
		System.out.println(number1);
		
		for(int i=0; i<number1;i++)
		{
			WebElement a2 = totalLinksAmazon.get(i);
			String namesAmazon = a2.getText();
			System.out.println(namesAmazon);
		}
	}
}
