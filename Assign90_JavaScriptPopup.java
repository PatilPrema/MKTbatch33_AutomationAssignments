package firstPackage;
//90-Write a program to handle Java script pop up.

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign90_JavaScriptPopup {

	public static void main(String[] args) 
	{
		ChromeDriver d = new ChromeDriver();
		d.get("file:///D:/ADVIT%20COMPUTERS/MY%20DATA/Downloads/learningHTML1%20(2).html");//here it is showing only 1 alert option, we have to accept it
		//d.findElement(By.id("1")).sendKeys("Hi");//when u get alert you have to 1st handle it, else we get UnhandledAlertException
		d.switchTo().alert().accept();
		
		
	}
}
