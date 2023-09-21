package firstPackage;
//Assignment 42: Launch amazon.in select book from dropdown, and type book name of your choice and press enter. Now Click on the book.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign42 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4aixbc67ji_e&adgrpid=57687748743&hvpone=&hvptwo=&hvadid=617721285511&hvpos=&hvnetw=g&hvrand=7955057441932280027&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-381707600357&hydadcr=5844_2362049");
		driver.manage().window().maximize();
		WebElement Dropdown = driver.findElement(By.id("searchDropdownBox"));
		Dropdown.click();
		Select s2 = new Select (Dropdown);
		//s2.selectByIndex(10);
		//s2.selectByVisibleText("Books");
		s2.selectByValue("search-alias=stripbooks");
		WebElement BookName = driver.findElement(By.id("twotabsearchtextbox"));
		BookName.sendKeys("Mindfullness");
		BookName.sendKeys(Keys.ENTER);
		driver.findElement(By.className("s-image")).click();
		driver.close();
		driver.quit();
		
		
		
		
	}

}
