package webpager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class AddTariffPlans extends TestBase{
@FindBy (xpath="//*[@id=\"rental1\"]")
WebElement entermonthlyrental;
@FindBy (xpath="//*[@id=\"local_minutes\"]")
WebElement FreeLocalMinutes;
@FindBy (xpath="//*[@id=\"inter_minutes\"]")
WebElement FreeInternationalMinutes;
@FindBy (xpath="//*[@id=\"sms_pack\"]")
WebElement FreeSMSPack;
@FindBy (xpath="//*[@id=\"minutes_charges\"]")
WebElement LocalPerMinutesCharges;
@FindBy (xpath="//*[@id=\"inter_charges\"]")
WebElement InternationalPerMinutesCharges;
@FindBy (xpath="//*[@id=\"sms_charges\"]")
WebElement SMSPerCharges;
@FindBy (xpath="//input[@value='submit']")
WebElement submit;
@FindBy (linkText = "HOME")
WebElement home;
public AddTariffPlans(){
	PageFactory.initElements(driver, this);
}

public void entertariffplan() {
	entermonthlyrental.sendKeys("1000");
	FreeLocalMinutes.sendKeys("100");
	FreeInternationalMinutes.sendKeys("100");
	FreeSMSPack.sendKeys("188");
	LocalPerMinutesCharges.sendKeys("1");
	InternationalPerMinutesCharges.sendKeys("2");
	SMSPerCharges.sendKeys("1");
	submit.click();
}
public void clickhome() {
	home.click();
}
}
