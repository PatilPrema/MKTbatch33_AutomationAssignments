package firstPackage;
//Assignment 46: Launch Amazon.com and  type shoes next write the XPath for autosuggestion.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign46 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement SearchOption = driver.findElement(By.id("twotabsearchtextbox"));
		SearchOption.sendKeys("Shoe"); //AutoSuggestion is conbination of both absolute and relative xpath
		Thread.sleep(4000);
		List<WebElement> Autosuggestions = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
        //if not write sleep, this it will not show count bcz it might be loading
		int Count = Autosuggestions.size();
		System.out.println(Count);
		
	}

}
