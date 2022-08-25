package webpager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import testbase.TestBase;

public class AddCustomer extends TestBase {
	
	@FindBy (xpath="//*[@id=\"main\"]/div/form/div/div[1]/label[@for='done']")
	WebElement  Clickdone;
	@FindBy (xpath="//*[@id=\"fname\"]")
	WebElement firstname;
	@FindBy (xpath="//*[@id=\"lname\"]")
	WebElement lastname;
	@FindBy (xpath="//*[@id=\"email\"]")
	WebElement emailenter;
	
	@FindBy (xpath="//*[@name='addr']")
	WebElement address;
	@FindBy (xpath="//*[@id=\"telephoneno\"]")
	WebElement mobileno;
	@FindBy (xpath="//div/ul/li[1]/input[@value='Submit']")
	WebElement submitbtn;
	@FindBy (xpath="/html/body/section/div/div/table/tbody/tr[1]//td[2]/h3")
	WebElement useridtext;
	
	@FindBy (linkText = "HOME")
	WebElement clickhomebtn;
   public AddCustomer() {
	   PageFactory.initElements(driver, this);
   }
   public void addcustomerdetails() {
	   wait.until(ExpectedConditions.elementToBeClickable(Clickdone));
	   Clickdone.click();
	   firstname.sendKeys("sameer");
	   lastname.sendKeys("aluwala");
	   emailenter.sendKeys("sam123@gmail.com");
	   address.sendKeys("Maharashtra");
	   mobileno.sendKeys("1234567890");
	   submitbtn.click();	   
   }
   public String getuserid() {
	  String userid= useridtext.getText();
	  System.out.println(userid);
	  
	  return userid;
   }
   public void clickhomebtn() {
	   clickhomebtn.click();
   }

}
