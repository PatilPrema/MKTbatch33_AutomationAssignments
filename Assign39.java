package firstPackage;
//Assignment 39:Launch amazon.in and click on mobile section using linkText

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign39 {

		public static void main(String[] args) 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4aixbc67ji_e&adgrpid=57687748743&hvpone=&hvptwo=&hvadid=617721285511&hvpos=&hvnetw=g&hvrand=7955057441932280027&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-381707600357&hydadcr=5844_2362049");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Mobiles")).click();

			
		}

}
