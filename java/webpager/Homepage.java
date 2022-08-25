package webpager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class Homepage extends TestBase {
	
@FindBy (xpath="//h3/a[@href=\"addcustomer.php\"]")
WebElement AddCustomer;
@FindBy (xpath="//h3/a[@href=\"addtariffplans.php\"]")
WebElement AddTariffPlans;
@FindBy (xpath="//h3/a[@href=\"assigntariffplantocustomer.php\"]")
WebElement AddTariffplanCustomer;
@FindBy (xpath="//h3/a[@href=\"billing.php\"]")
WebElement PayBilling;

public Homepage() {
	PageFactory.initElements(driver, this);	
}

public void ClickAddCustomer() {
	AddCustomer.click();
}

public void ClickAddTariffPlan() {
	
	AddTariffPlans.click();
	
} 
public void ClickAddtariffPlanToCustomer() {
	AddTariffplanCustomer.click();
	
}

public void ClickPayBilling() {
PayBilling.click();	

}
}
