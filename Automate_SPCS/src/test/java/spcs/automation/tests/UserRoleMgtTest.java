package spcs.automation.tests;
import org.testng.annotations.Test;

import spcs.automation.pageobjects.LoginP;
import spcs.automation.pageobjects.NewApplicantPage;
import spcs.automation.pageobjects.UserMgtPage;
import spcs.automation.pageobjects.UserRoleMgtPage;

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
		
		//UserRoleSearchFromCode
	//	@Test(priority = 3)
		public void UserRoleSearchFromCode() throws Exception {
			
			LoginP login = new LoginP(driver);
			NewApplicantPage NwAp = new NewApplicantPage(driver);
			UserMgtPage UserPage = new UserMgtPage(driver);
			UserRoleMgtPage UserRolePage =new UserRoleMgtPage(driver);
			
			//login to app
			login.enterValidUserName();
			//Select User Management  Page
			UserPage.SelectUserNewApplicants();
			UserRolePage.SelectUserRoleMgt();
			UserRolePage.SearchUserRole();
			UserRolePage.ClickSearchUserRoleButton();
			
						
		}
		
		//UserRoleSearchFromLevel
	//@Test(priority = 4)
		public void UserRoleSearchFromLevel() throws Exception {
			
			LoginP login = new LoginP(driver);
			NewApplicantPage NwAp = new NewApplicantPage(driver);
			UserMgtPage UserPage = new UserMgtPage(driver);
			UserRoleMgtPage UserRolePage =new UserRoleMgtPage(driver);
			
			//login to app
			login.enterValidUserName();
			//Select User Management  Page
			UserPage.SelectUserNewApplicants();
			UserRolePage.SelectUserRoleMgt();
			UserRolePage.SearchUserRoleFromlevel();
			UserRolePage.ClickSearchUserRoleButton();
						
		}
		
				
	//	@Test(priority = 5)
		public void AssignPagesToUserRole() throws Exception {
			
			LoginP login = new LoginP(driver);
			NewApplicantPage NwAp = new NewApplicantPage(driver);
			UserMgtPage UserPage = new UserMgtPage(driver);
			UserRoleMgtPage UserRolePage =new UserRoleMgtPage(driver);
			
			
			//login to app
			login.enterValidUserName();
			//Select User Management  Page
			UserPage.SelectUserNewApplicants();
			UserRolePage.SelectUserRoleMgt();
			UserRolePage.SearchUserRole();
			UserRolePage.ClickSearchUserRoleButton();
			UserRolePage.ClickAssignPagesToUserRoleButton();
			UserRolePage.SelectSectionDropdown();
			UserRolePage.SelectSectionOptionsDropdown();
			UserRolePage.ClickMoveSectionRightButton();
			UserRolePage.ClickRolePageAssignSaveButton();
			
					
		}
		
		@Test(priority = 6)
		public void AssignTasksToUserRole() throws Exception {
			
			
			LoginP login = new LoginP(driver);
			NewApplicantPage NwAp = new NewApplicantPage(driver);
			UserMgtPage UserPage = new UserMgtPage(driver);
			UserRoleMgtPage UserRolePage =new UserRoleMgtPage(driver);
			
			
			//login to app
			login.enterValidUserName();
			//Select User Management  Page
			UserPage.SelectUserNewApplicants();
			UserRolePage.SelectUserRoleMgt();
			UserRolePage.SearchUserRole();
			UserRolePage.ClickSearchUserRoleButton();
			UserRolePage.ClickAssignTasksToUserRoleButton();
			UserRolePage.SelectSectionDropdown();
			UserRolePage.SelectPagesDropdown();
			UserRolePage.SelectSectionOptionsDropdown();
			UserRolePage.ClickMoveSectionRightButton();
			UserRolePage.ClickRoleTasksAssignSaveButton();
		}
		
		
		
		
		
		

}
