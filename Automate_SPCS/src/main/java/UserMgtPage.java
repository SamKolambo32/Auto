import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserMgtPage extends BasePa {
	
	
public WebDriver driver;
	
	public UserMgtPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By MemberLink = By.cssSelector("#section13.dropmenu");
	
	
	
	public void SelectUserNewApplicants() throws Exception {

		try {
			Thread.sleep(5000);
			driver.findElement(MemberLink).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : MemberLink " + e.getLocalizedMessage());
		}	
		}

	

}
