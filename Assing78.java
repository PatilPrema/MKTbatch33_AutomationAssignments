package firstPackage;
//Assignment78: Write a Program for Timeout In TestNG
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assing78 {

	@Test(timeOut=18000)
	public void checkingTimeout()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}


}
