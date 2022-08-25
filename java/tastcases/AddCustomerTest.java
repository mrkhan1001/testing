package tastcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.TestBase;
import util.Frames;
import verificationofpage.HomepageVerify;
import webpager.AddCustomer;
import webpager.AddTariffPlans;
import webpager.AddTariffplanCustomer;
import webpager.Homepage;

public class AddCustomerTest extends TestBase
{
	Homepage homepage;
	AddCustomer addcustomer;
	AddTariffplanCustomer addtariffplan;
	HomepageVerify verify;
	String window;
	String newuserid;
	AddTariffPlans tariffplan;
	
	public AddCustomerTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() {
		initialization();
		
		homepage=new Homepage();
		addcustomer=new AddCustomer();
		addtariffplan=new AddTariffplanCustomer();
		verify = new HomepageVerify();
		tariffplan=new AddTariffPlans(); 
	}
	//just verify homepage
	@Test(priority=1)
	public void verification() {
		verify.homeelement();
		
	}
	@Test(priority=2)
	public void addcustomertest()  {
		homepage.ClickAddCustomer();
		Frames.frame1();
		
		 window=driver.getWindowHandle();
		driver.switchTo().window(window);
	
		addcustomer.addcustomerdetails();
		newuserid=addcustomer.getuserid();
		addcustomer.clickhomebtn();
		
	}
	@Test(priority=3)
	public void addtariffplan()  {
		//addcustomertest();
		
		homepage.ClickAddtariffPlanToCustomer();
		Frames.frame1();
		
		 window=driver.getWindowHandle();
		driver.switchTo().window(window);
		
		addtariffplan.enteruseridandclicksubmit(prop.getProperty("userid"));
		String verifytext=addtariffplan.clickradioandaddtariffplan();
		
		Assert.assertEquals(verifytext, "Congratulation Tariff Plan assigned");
		addtariffplan.gotohome();
	}   
	@Test
	public void testaddtariffplan() {
		homepage.ClickAddTariffPlan();
		Frames.frame1();
		window=driver.getWindowHandle();
		driver.switchTo().window(window);
		tariffplan.entertariffplan();
	}
}
