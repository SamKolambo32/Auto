import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserMgtPage extends BasePa {
	
	
public WebDriver driver;
	
	public UserMgtPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By UserLink = By.cssSelector("#section13.dropmenu");
	By UserLink2 = By.id("user");
	By BtnAddNew = By.xpath("//*[@class=\"cmd-btn cmd-btn-default addNew addUser\"]");
	
	public void SelectUserNewApplicants() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(UserLink).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : UserLink " + e.getLocalizedMessage());
		}	
		}
	
	
	public void SelectUserMgt() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(UserLink2).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : UserLink2 " + e.getLocalizedMessage());
		}	
		}
	
	
	public void ClickAddNewButton() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(BtnAddNew).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : BtnAddNew " + e.getLocalizedMessage());
		}	
		}
	
	
	
	

}
