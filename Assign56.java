package firstPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment56a: Login to Facebook using DDT concept.
//Assignment56b: Login to amazon using DDT concept.
//Assignment56c: Login to  flipkart using DDT concept."
public class Assign56 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{
	FileInputStream f2 = new FileInputStream("D:\\Users\\Prema\\eclipse-workspace\\AutomationMKT\\Prema's sheet\\Excel_Sheet.xlsx");
	Workbook w1 =WorkbookFactory.create(f2);
	Sheet s1 = w1.getSheet("FaceBook_Login");
	Sheet s2 = w1.getSheet("Flipkart_Login");
	Row r1 = s1.getRow(1);
	Cell c1 = r1.getCell(0);
	String username = c1.getStringCellValue();
	String password = NumberToTextConverter.toText(s1.getRow(1).getCell(1).getNumericCellValue());
	String username1 = s2.getRow(1).getCell(0).getStringCellValue();
	String password1 = NumberToTextConverter.toText(s2.getRow(1).getCell(1).getNumericCellValue());
	
	
	//login to facebook using DDT-data deiven testing
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	
	/*driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);*/
	
	//login to flipkart
	driver.get("https://www.Flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[.='\u2715']")).click();
	driver.findElement(By.xpath("//a[.='Login']")).click();
	WebElement UN = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	UN.sendKeys(username1);
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//input[@maxlength='10'])")).sendKeys(password1);
	
	
	

	
	
	
	
	}
}
