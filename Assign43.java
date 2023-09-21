package firstPackage;
//Assignment 43: Automate the provided HTML file (learningHTML1.html)
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign43 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/ADVIT%20COMPUTERS/MY%20DATA/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.id("1"));
		Username.sendKeys("Prema");
		WebElement Hintname = driver.findElement(By.name("say hello"));
		Hintname.sendKeys("Hi");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("1234");
		WebElement FirstName = driver.findElement(By.name("fname"));
		FirstName.sendKeys("Prema");
		//driver.findElement(By.name("lname")).sendKeys("Patil");
		WebElement FirstRadioButton = driver.findElement(By.name("name1"));
		FirstRadioButton.click();
		WebElement SecondRadioButton = driver.findElement(By.name("name2"));
		SecondRadioButton.click();
		WebElement ThirdRadioButton = driver.findElement(By.name("name3"));
		ThirdRadioButton.click();
		WebElement FourthRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		FourthRadioButton.click();
		WebElement FifthRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		FifthRadioButton.click();
		WebElement CheckBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		CheckBox.click();
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='Relegion']"));
		
		Select S1 = new Select(DropDown);
		DropDown.click();
		S1.selectByValue("4");
	}

}
