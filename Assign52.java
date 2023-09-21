package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment52: Launch Jsam application, check if username isDisplayed(), if yes check if it isEnabled(). Type your name.
//Write this program using AND operator."

public class Assign52 {

	public static void main(String[] args)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///D:/ADVIT%20COMPUTERS/MY%20DATA/Downloads/learningHTML1%20(2).html");
	boolean username = driver.findElement(By.id("1")).isDisplayed();
	System.out.println(username);
	if(username==true)
	{
		boolean usernameEn = driver.findElement(By.id("1")).isEnabled();
		 if(usernameEn==true)
		 {
			 driver.findElement(By.id("1")).sendKeys("PremaPatil");
		 }
	}
	

	}

}
