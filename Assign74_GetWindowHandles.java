package firstPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 74: Write a program using gethandlewindows to take over the control on child window.
//Scenario : Launch amazon.in select book from dropdown, and type book name of your choice and press enter. Now Click on the book. Click on Add to cart button. Click on Proceed to buy button. Choose the address and click on Use this Address button. Select a payment method."

public class Assign74_GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement SearchOption = driver.findElement(By.id("twotabsearchtextbox"));
		SearchOption.sendKeys("Shoe");
		Thread.sleep(3000);
		SearchOption.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		String Pid = driver.getWindowHandle();
		Set<String> pid_cid = driver.getWindowHandles();
		System.out.println(Pid);
		System.out.println(pid_cid);
		Iterator<String> p1= pid_cid.iterator();
		String Parenetid = p1.next();
		String Childid = p1.next();
		driver.switchTo().window(Childid);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8095378203");
	}

}
