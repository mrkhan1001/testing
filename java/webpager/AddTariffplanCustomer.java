package webpager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import testbase.TestBase;

public class AddTariffplanCustomer extends TestBase{
@FindBy (xpath="//*[@id=\"customer_id\"]")
WebElement enteruserid;

@FindBy (xpath="//input[@name='submit']")
WebElement clicksubmit;
@FindBy (xpath="//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[1]/label[@for='sele']")
WebElement radioclick;
@FindBy (xpath="//input[@value='Add Tariff Plan to Customer']")
WebElement clicktariffplan;
@FindBy (xpath="//h2[text()='Congratulation Tariff Plan assigned']")
WebElement verifytariffplanisadded;
@FindBy (linkText = "HOME")
WebElement gotohome;

public AddTariffplanCustomer() {
	PageFactory.initElements(driver, this);
}
public void enteruseridandclicksubmit(String userid) {
	enteruserid.sendKeys(userid);
	clicksubmit.click();
}
public String clickradioandaddtariffplan() {
	//wait.until(ExpectedConditions.visibilityOf(radioclick));
	//Thread.sleep(5000);
	//radioclick.click();
	clicktariffplan.click();
	
	return verifytariffplanisadded.getText();
}
public void gotohome() {
	gotohome.click();
}

}
