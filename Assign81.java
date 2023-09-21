package firstPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Assignment81: Write a Program to login to Flipkart.com and Right click on Mobiles 

public class Assign81
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement gmailLink = d1.findElement(By.linkText("Gmail"));
		Actions a = new Actions(d1);
		a.contextClick(gmailLink).perform();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(d1, Duration.ofSeconds(2));
		//wait.until(ExpectedConditions.)
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}
