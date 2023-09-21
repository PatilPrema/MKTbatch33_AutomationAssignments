package firstPackage;
//Assignment 41: Launch amazon.in type book search out of all select the first book.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign41 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4aixbc67ji_e&adgrpid=57687748743&hvpone=&hvptwo=&hvadid=617721285511&hvpos=&hvnetw=g&hvrand=7955057441932280027&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-381707600357&hydadcr=5844_2362049");
		driver.manage().window().maximize();
		//driver.findElement(By.id("twotabsearchtextbox")).click(); //no need to do this step clicking
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.className("s-image")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
