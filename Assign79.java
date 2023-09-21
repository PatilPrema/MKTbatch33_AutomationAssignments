package firstPackage;
//Assignment79: Write a Program to login to Google.com and double click on images link

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign79 {

		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement googleTextField = driver.findElement(By.id("APjFqb"));
			Actions a=new Actions(driver);
			a.doubleClick(googleTextField).perform();
	}

}
