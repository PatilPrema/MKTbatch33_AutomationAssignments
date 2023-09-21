package firstPackage;
//Assignment 73: Write a Program using all the Navigate methods.
import org.openqa.selenium.chrome.ChromeDriver;

public class Assing73_NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.in");//it will navigate to other url, one more method to open url
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();//it will refresh the page
	}

}
