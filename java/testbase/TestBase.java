package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Timeutil;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public static WebDriverWait wait;
public TestBase()  {
	
	
	 
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\configuration\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void initialization() {
	
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if(browsername.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	
	}
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Timeutil.Pageload_Timeout));
	wait=new WebDriverWait(driver, Duration.ofSeconds(Timeutil.Explicit_Wait));

	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Timeutil.Implicit_Wait));

}
}
