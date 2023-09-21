package firstPackage;
//95-Write a program to launch amazon.in and scroll down but without "JavaScriptExecutor".
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign95 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement f = driver.findElement(By.linkText("Facebook"));
		f.sendKeys(Keys.DOWN);//we are not clicking anything here, just scrolling down with keys funtion down
		f.sendKeys(Keys.DOWN);
		//f.sendKeys(Keys.DOWN);
	}
}
