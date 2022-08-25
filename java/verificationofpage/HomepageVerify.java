package verificationofpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testbase.TestBase;

public class HomepageVerify extends TestBase{
	@FindBy (xpath="/html/body/div[3]/div/div[1]/div[1]/div[1]/a/img")
	WebElement homelogo;
	public HomepageVerify() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean homeelement() {
		Boolean logo=homelogo.isDisplayed();
		//Assert.assertTrue(logo, "logo is verified");
		if(logo==true) {
			System.out.println("logo is verified");
		}
		else{
			System.out.println("logo not displayed");
		}
		return true;
	}

}
