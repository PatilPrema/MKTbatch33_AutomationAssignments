package firstPackage;
//Assignment81: Write a Program to login to Flipkart.com and Right click on Mobiles
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Assignment81: Write a Program to login to Flipkart.com and Right click on Mobiles
public class Assign81_RightClickOnElement {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement Mobiles = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		Actions a =new Actions(driver);
		a.contextClick(Mobiles).perform();
	}

}
