package firstPackage;
//Assignment47: Launch google.com type india from autosuggestion select last option

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Assignment47: Launch google.com type india from autosuggestion select last option

public class Assign47 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> Autosugge = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
		int count = Autosugge.size();
		System.out.println(count);
		Autosugge.get(count-1).click();
		//driver.close();
		
	}

}
