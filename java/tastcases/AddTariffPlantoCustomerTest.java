package tastcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.TestBase;
import util.Frames;
import webpager.Homepage;

public class AddTariffPlantoCustomerTest extends TestBase {
	Homepage homepage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new Homepage();
//		 
	}
	@Test
	public void addtariffplantocustomer() {
		homepage.ClickAddtariffPlanToCustomer();
		Frames.frame1();
		
	}
}
