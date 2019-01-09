import org.testng.annotations.Test;

public class UserRoleMgtTest extends Base1Test{
	
	
	
	//User Role Creation
		//@Test(priority = 2)
		public void UserRoleCreate() throws Exception {
			
			LoginP login = new LoginP(driver);
			NewApplicantPage NwAp = new NewApplicantPage(driver);
			UserMgtPage UserPage = new UserMgtPage(driver);
			UserRoleMgtPage UserRolePage =new UserRoleMgtPage(driver);
			
			//login to app
			login.enterValidUserName();
			//Select User Management  Page
			UserPage.SelectUserNewApplicants();
			UserRolePage.SelectUserRoleMgt();
			UserRolePage.ClickAddNewUserRoleButton();
			UserRolePage.EnterUserRole();
			UserRolePage.EnterUserRoleName();
			UserPage.SelectStatusDropdown();
			UserRolePage.SelectUserLevelDropdown();
			UserPage.ClickSaveButton();
			
					
		}
		
		@Test(priority = 3)
		public void UserRoleSearch() throws Exception {
			
			LoginP login = new LoginP(driver);
			NewApplicantPage NwAp = new NewApplicantPage(driver);
			UserMgtPage UserPage = new UserMgtPage(driver);
			UserRoleMgtPage UserRolePage =new UserRoleMgtPage(driver);
			
			//login to app
			login.enterValidUserName();
			//Select User Management  Page
			UserPage.SelectUserNewApplicants();
			UserRolePage.SelectUserRoleMgt();
			UserRolePage.SerchUserRole();
			UserRolePage.ClickSearchUserRoleButton();
			UserRolePage.ClickAssignPagesToUserRoleButton();
			UserRolePage.SelectSectionDropdown();
			UserRolePage.SelectSectionOptionsDropdown();
			UserRolePage.ClickMoveSectionRightButton();
			UserRolePage.ClickRolePageAssignSaveButton();
			
			
		}
		
		
		

}
