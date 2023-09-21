package firstPackage;
//Assignment86: Write the Program to count number of options in Dropdown of amazon.in
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign86_count_OptionsIn_Dropdown {

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&useRedirectOnSuccess=1&signIn=1&action=sign-out&ref_=nav_AccountFlyout_signout");
		d1.manage().window().maximize();
		WebElement dropdown = d1.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dropdown);
		 s1.selectByVisibleText("Books");
		List<WebElement> alloptions = s1.getOptions();
		int totalOptions = alloptions.size();
		System.out.println(totalOptions);
		
		for(int i =0; i<totalOptions;i++)
		{
			WebElement op = alloptions.get(i);
			
			
		    System.out.println(op);
		}
	}
}
