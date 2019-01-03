import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserMgtPage extends BasePa {
	
	
public WebDriver driver;
	
	public UserMgtPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//User Creation Page Objects
	By UserLink = By.cssSelector("#section13.dropmenu");
	By UserLink2 = By.id("user");
	By BtnAddNew = By.xpath("//*[@class=\"cmd-btn cmd-btn-default addNew addUser\"]");
	By UserName = By.id("userName");
	By pwd = By.id("password");
	By TiltleType=By.id("title");
	By Oid=By.id("officerId");
	By NRIC=By.id("idNo");
	By mobile=By.id("mobile");
	By email=By.id("email");
	By status=By.id("status");
	By userRole=By.id("userRole");
	By Save=By.id("save");
	By name=By.id("name");
	
	//User Role Creation Page Objects
	By userRoleView=By.id("userRoleView");
	By BtnAddNewUserRole = By.xpath("//*[@class='cmd-btn cmd-btn-default addNew addUserRole']");
	By UserRole=By.id("code");
	By UserRoleName=By.id("description");
	By userLevel=By.id("userLevel");
	By UserRoleCode=By.id("s_code");
	By BtnSearchNewUserRole = By.xpath("//*[@class='cmd-btn cmd-btn-default searchUserRole']");
	////*[@id="mainGrid"]/tbody/tr/td[@class=' dt-center']/a[1]
	By BtnAssignPages = By.xpath("//*[@id='mainGrid']/tbody/tr/td[@class=' dt-center']/a[1]");
	
	
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
	
	
	public void EnterUserName() throws Exception {

		try {
			
			Thread.sleep(2000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(UserName).sendKeys(getTestData("NameOfUser"));
		} catch (Exception e) {
			throw new Exception("Failed : UserName " + e.getLocalizedMessage());
		}

	}
	
	public void EnterPassword() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(pwd).sendKeys("1");

		} catch (Exception e) {
			throw new Exception("Failed : idNumber " + e.getLocalizedMessage());
		}

	}
	
	public void EnterName() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(name).sendKeys("Sam Kolambo");

		} catch (Exception e) {
			throw new Exception("Failed : Oid " + e.getLocalizedMessage());
		}

	}
	
	public void SelectTitleDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement tiltleType = driver.findElement(TiltleType);
			Select tiltleTypeList = new Select(tiltleType);
			tiltleTypeList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterOfficerID() throws Exception {

		try {
			
			Thread.sleep(2000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(Oid).sendKeys("123456");

		} catch (Exception e) {
			throw new Exception("Failed : Oid " + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterUserNRIC() throws Exception {

		try {
			
			Thread.sleep(2000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(NRIC).sendKeys(getTestData("NRICOfUser"));
		} catch (Exception e) {
			throw new Exception("Failed : UserName " + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterTelNo() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(mobile).sendKeys("12345678");

		} catch (Exception e) {
			throw new Exception("Failed : Oid " + e.getLocalizedMessage());
		}

	}
	

	
	public void EnterEmail() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(email).sendKeys("SamithaKolambage32@gmail.com");

		} catch (Exception e) {
			throw new Exception("Failed : Oid " + e.getLocalizedMessage());
		}

	}
	
	
	
	public void SelectStatusDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement Status = driver.findElement(status);
			Select statusList = new Select(Status);
			statusList.selectByIndex(1);
			
		} catch (Exception e) {
			throw new Exception("Failed : SelectStatusDropdown " + e.getLocalizedMessage());
		}

	}
	
	
	
	
  public void SelectEffectiveDate()throws Exception {
		
		try {
			//Click On Datepicker
			Thread.sleep(2000);
			driver.findElement(By.id("effectiveSysTime")).click();
			
			//Select Today
			Thread.sleep(2000);
			//driver.findElement(By.cssSelector("body > div:nth-child(38) > div.datepicker-days > table > tfoot > tr:nth-child(1) > th")).click();
			driver.findElement(By.cssSelector("th.today")).click();
			
			
		} catch (InterruptedException e) {
			
			throw new Exception("Failed : Empdate " + e.getLocalizedMessage());
		}
		
		
	}
  
  
  public void SelectUserRoleDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement UserRole = driver.findElement(userRole);
			Select UserRoleList = new Select(UserRole);
			UserRoleList.selectByIndex(1);
			
		} catch (Exception e) {
			throw new Exception("Failed : SelectStatusDropdown " + e.getLocalizedMessage());
		}

	}
  
	
  public void SelectRadioGender() throws Exception {

		
		try {
			Thread.sleep(2000);
			//3.radioBtn
			driver.findElement(By.id("gender_1")).click();;
			//WebElement radioBtn = driver.findElement(By.id("radio_4[]"));
			
			
		} catch (Exception e) {
			
			throw new Exception("Failed : SelectRadioGender " + e.getLocalizedMessage());
		}
	

  }
  
  
  public void ClickSaveButton() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(Save).click();
			//Assert.assertTrue(driver.findElement(SearchBtnPropser).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : sendToApproval " + e.getLocalizedMessage());
		}

	}
  
  
 /// User Role Mgt 
  public void SelectUserRoleMgt() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(userRoleView).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : SelectUserRoleMgt " + e.getLocalizedMessage());
		}	
		}
  
  
  public void ClickAddNewUserRoleButton() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(BtnAddNewUserRole).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : BtnAddNewUserRole " + e.getLocalizedMessage());
		}	
		}
  
  
  public void EnterUserRole() throws Exception {

		try {
			
			Thread.sleep(2000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(UserRole).sendKeys(getTestData("NameOfUserRole"));
		} catch (Exception e) {
			throw new Exception("Failed : UserName " + e.getLocalizedMessage());
		}

	}
  
  public void EnterUserRoleName() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(UserRoleName).sendKeys("1");

		} catch (Exception e) {
			throw new Exception("Failed : UserRoleName " + e.getLocalizedMessage());
		}

	}
  
  public void SelectUserLevelDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement UserLevel = driver.findElement(userLevel);
			Select UserLevelList = new Select(UserLevel);
			UserLevelList.selectByIndex(1);
			
		} catch (Exception e) {
			throw new Exception("Failed : SelectStatusDropdown " + e.getLocalizedMessage());
		}

	}
	
  public void SerchUserRole() throws Exception {

		try {
			
			Thread.sleep(2000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(UserRoleCode).sendKeys(getTestData("NameOfUserRole"));
		} catch (Exception e) {
			throw new Exception("Failed : UserName " + e.getLocalizedMessage());
		}

	}
  
  public void ClickSearchUserRoleButton() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(BtnSearchNewUserRole).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : BtnSearchNewUserRole " + e.getLocalizedMessage());
		}	
		}
  
  public void ClickAssignPagesToUserRoleButton() throws Exception {

		try {
			Thread.sleep(4000);
			driver.findElement(BtnAssignPages).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : ClickAssignPagesToUserRoleButton " + e.getLocalizedMessage());
		}	
		}
  
  
  
}

