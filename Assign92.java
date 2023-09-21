package firstPackage;
//Assign 92-Write a program to launch amazon.in and scroll down untill Canadian amazon is visible.
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign92
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	    WebElement locaton = driver.findElement(By.linkText("Canada"));
	   Point l =  locaton.getLocation();                            //getlocation return type is point
		int xaxis = l.getX();
		int yaxis = l.getY();
		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy("+xaxis+", "+yaxis+")", " ");
		Thread.sleep(2000);
		locaton.click();
	}
}
