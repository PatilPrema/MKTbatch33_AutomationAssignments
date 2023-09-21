package firstPackage;
//Assignment53: Launch https://grotechminds.com/registration/ and check if Are you ready to relocate to bangalore? 
//checkbox is selected or not using isSelected().

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign53 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/ADVIT%20COMPUTERS/MY%20DATA/Downloads/learningHTML1%20(2).html");
		Boolean Checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected();
		System.out.println(Checkbox);
		if (Checkbox==false)
		{
			driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		}
	}

}
