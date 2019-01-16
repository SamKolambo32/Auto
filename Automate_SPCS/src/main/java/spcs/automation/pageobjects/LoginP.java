package spcs.automation.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginP extends BasePa{
	
	public WebDriver driver;
	
	public LoginP(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	By userName = By.id("userName");
	By password = By.id("password");
	
	
	public void enterValidUserName() throws Exception {

	//	driver.findElement(userName).sendKeys("Kolambo");
	//	driver.findElement(password).sendKeys("1234");
		//driver.findElement(idNumber).sendKeys(getTestData("NameOnCard"));
		
		//driver.get("http://192.168.1.29:9085/SPCS_QA_V1.31-SNAPSHOT/");
		
		//driver.findElement(By.id("userName")).sendKeys("Kolambo");
		//driver.findElement(By.id("password")).sendKeys("12");
		Thread.sleep(1000);
		driver.get(getTestData("url"));
		driver.findElement(userName).sendKeys(getTestData("un"));
		driver.findElement(password).sendKeys(getTestData("pwd"));
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/div[2]/button")).click();
	}
}
