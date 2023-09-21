package firstPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args)
	{
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	
	Actions a1=new Actions(driver);
	
	
	}

}
