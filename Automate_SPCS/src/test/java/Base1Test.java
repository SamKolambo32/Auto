import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class Base1Test {

	static WebDriver driver;
	
	@BeforeMethod
	public void LoadBrowser() throws FileNotFoundException, IOException {
		Reporter.log("=====Browser Started=====", true);
		System.setProperty("webdriver.chrome.driver", "F:\\EPIC_Backup\\Sam\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get(getProperty("TESTpage"));
		//driver.get("http://192.168.1.230:8080/DFCC_CMS_V1.38.37");

	}

	//@AfterMethod
	public void CloseBrowser() {

		driver.quit();
		Reporter.log("=====Browser Closed=====", true);
	}
	
}
