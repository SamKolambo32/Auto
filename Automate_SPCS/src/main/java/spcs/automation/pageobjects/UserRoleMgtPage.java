package spcs.automation.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserRoleMgtPage extends BasePa {
	
	
		
		
public WebDriver driver;
			
	public UserRoleMgtPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	
	//User Role Creation Page Objects
		By userRoleView=By.id("userRoleView");
		By BtnAddNewUserRole = By.xpath("//*[@class='cmd-btn cmd-btn-default addNew addUserRole']");
		By UserRole=By.id("code");
		By UserRoleName=By.id("description");
		By userLevel=By.id("userLevel");
		By UserRoleCode=By.id("s_code");
		By BtnSearchNewUserRole = By.xpath("//*[@class='cmd-btn cmd-btn-default searchUserRole']");
		
		////*[@id="mainGrid"]/tbody/tr/td[@class=' dt-center']/a[1]
		//By BtnAssignPages = By.xpath("//*[@id='mainGrid']/tbody/tr/td[@class=' dt-center']/a[@class='grid-actions grid-btnassignpage viewPageSectionUserRole']");
		
		By BtnAssignPages = By.xpath("//td[@data-dt-row='0']//a[@title='Assign Pages']");
		By section=By.id("sectionId");
		By options=By.id("lstBox1");
		By btnRight=By.id("btnRight");
		By RoleSave=By.id("btnAssignPageSectionUserRole");
		By userLevelSearch=By.id("s_level");
		By BtnTaskPages = By.xpath("//td[@data-dt-row='0']//a[@title='Assign Task']");
		By Pages=By.id("pageCode");
		By TaskSave=By.id("btnAssignPageTaskUserRole");
		
		
		
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
			
		  public void SearchUserRole() throws Exception {

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
		  
		  public void SelectSectionDropdown() throws Exception {

				try {
					Thread.sleep(2000);
					WebElement Section = driver.findElement(section);
					Select SectionList = new Select(Section);
					SectionList.selectByIndex(1);
					
				} catch (Exception e) {
					throw new Exception("Failed : SelectStatusDropdown " + e.getLocalizedMessage());
				}

			}
		  
		  public void SelectSectionOptionsDropdown() throws Exception {

				try {
					Thread.sleep(2000);
					WebElement Options = driver.findElement(options);
					Select OptionsList = new Select(Options);
					OptionsList.selectByIndex(1);
					OptionsList.selectByIndex(2);
					OptionsList.selectByIndex(3);
					
				} catch (Exception e) {
					throw new Exception("Failed : SelectStatusDropdown " + e.getLocalizedMessage());
				}

			}
		  
		  public void ClickMoveSectionRightButton() throws Exception {

				try {
					Thread.sleep(2000);
					driver.findElement(btnRight).click();
					//Assert.assertTrue(driver.findElement(SearchBtnPropser).isEnabled());
				} catch (Exception e) {
					throw new Exception("Failed : sendToApproval " + e.getLocalizedMessage());
				}

			}
		  
		  
		  public void ClickRolePageAssignSaveButton() throws Exception {

				try {
					Thread.sleep(2000);
					driver.findElement(RoleSave).click();
					//Assert.assertTrue(driver.findElement(SearchBtnPropser).isEnabled());
				} catch (Exception e) {
					throw new Exception("Failed : sendToApproval " + e.getLocalizedMessage());
				}

			}

			
		  public void SearchUserRoleFromlevel() throws Exception {

				try {
					Thread.sleep(3000);
					WebElement UserLevel = driver.findElement(userLevelSearch);
					Select UserLevelList = new Select(UserLevel);
					UserLevelList.selectByIndex(1);
					
				} catch (Exception e) {
					throw new Exception("Failed : SelectStatusDropdown " + e.getLocalizedMessage());
				}

			}
		  
		  public void ClickAssignTasksToUserRoleButton() throws Exception {

				try {
					Thread.sleep(4000);
					driver.findElement(BtnTaskPages).click();
					//MemberLink.click();
					
				} catch (Exception e) {
					throw new Exception("Failed : ClickAssignTasksToUserRoleButton " + e.getLocalizedMessage());
				}	
				}
		  
		  
		  
		  public void SelectPagesDropdown() throws Exception {

				try {
					Thread.sleep(2000);
					WebElement Section = driver.findElement(Pages);
					Select SectionList = new Select(Section);
					SectionList.selectByIndex(1);
					
				} catch (Exception e) {
					throw new Exception("Failed : SelectPagesDropdown " + e.getLocalizedMessage());
				}

			}
		  
		  
		  public void ClickRoleTasksAssignSaveButton() throws Exception {

				try {
					Thread.sleep(2000);
					driver.findElement(TaskSave).click();
					//Assert.assertTrue(driver.findElement(SearchBtnPropser).isEnabled());
				} catch (Exception e) {
					throw new Exception("Failed : sendToApproval " + e.getLocalizedMessage());
				}

			}
			

}
