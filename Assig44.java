package firstPackage;
//Assignment44: Launch google.com and the search bar by using xpath(absolute XPath)

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig44 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement SearchButton =  driver.findElement(By.xpath("html/body/div/div/form/div/div/div/div/div/textarea"));//It is absolute xpath
		SearchButton.sendKeys("India");
	}
	

}
