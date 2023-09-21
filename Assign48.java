package firstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment48: Launch flipkart.com and type shoe select the 6th autosuggestion and then 
//click on the 1st option

//https://grotechminds.com/registration/
public class Assign48 
{
   public static void main(String[] args)
   {
	   ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div/div/div/button")).click();
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("shoe");
		List<WebElement> autosuggest = driver.findElements(By.xpath(""));//autosuggestion is combination of absolute and relative x-path
		
	   
}
}
