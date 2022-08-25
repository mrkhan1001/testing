package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testbase.TestBase;

public class Frames extends TestBase{
	
	public static void frame1(){
		
		try {
			WebElement advertisement=driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
			driver.switchTo().frame(advertisement);
			driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}

}
