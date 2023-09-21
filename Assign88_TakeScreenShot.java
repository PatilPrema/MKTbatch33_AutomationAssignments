package firstPackage;
//Assignment88: Write a Program to Take screenshot of google home page
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign88_TakeScreenShot {

	 WebDriver driver;
		public static void main(String[] args) throws IOException {
			 WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\Screenshot\\Prema"+ Math.random()   +".png");
			FileUtils.copyFile(source, destination);
		}
}
