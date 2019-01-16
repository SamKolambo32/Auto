package spcs.automation.tests;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import spcs.automation.pageobjects.LoginP;
import spcs.automation.pageobjects.NewApplicantPage;



public class NewApplicantsTest extends Base1Test {

	@Test(priority = 1)
	public void ValidLogin() throws FileNotFoundException, IOException, Exception {
		
 
		LoginP login = new LoginP(driver);
		NewApplicantPage NwAp = new NewApplicantPage(driver);

		
		//driver.get("http://192.168.1.29:9085/SPCS_QA_V1.28/login.htm");
		
		//login to app
		login.enterValidUserName();
		
		//Member Management selcetion.
		NwAp.SelectMemberNewApplicants();
		NwAp.SelectMemberNewApplicantsPage();
		NwAp.SelectIdentificationDropdown();
		NwAp.EnterIdentificationName();
		NwAp.ClickSearchButton();
		NwAp.ClickNewMemberButton();
		
		//Applicant Details 
		NwAp.SelectMemberTypeDropdown();
		NwAp.SelectDoB();
		NwAp.SelectSalautaitionDropdown();
		NwAp.EnterName();
		NwAp.SelectGenderDropdown();
		NwAp.SelectRaceDropdown();
		NwAp.SelectMaritalStatusDropdown();
		NwAp.SelectTelNoDropdown();
		NwAp.EnterTelNo();
		NwAp.SelectEmailDropdown();
		NwAp.EnterEmailtxt();
		NwAp.ClickApplicantDetailsNext();
		
		//Address details
		NwAp.SelectRadioPrimary();
		NwAp.SelectAddressTypeDropdown();
		NwAp.EnterAddress_Line_1();
		NwAp.EnterAddress_Line_2();
		NwAp.EnterZipCode();
		NwAp.ClickAddressDetailsNext();

		//Empolyee details
		NwAp.SelectNameofEmployeDropdown();
		NwAp.SelectEmpDate();
		NwAp.SelectDivisionUnitDropdown();
		NwAp.EnterRankNo();
		NwAp.SelectEmploymentTypetDropdown();
		NwAp.EnterDesignation();
		NwAp.EnterGrossSalary();
		NwAp.ClickEmployerDetailsNext();
		
		//Bank details
		NwAp.SelectBankRadioPrimary();
		NwAp.SelectBankNameDropdown();
		NwAp.EnterBankACNo();
		NwAp.ClickbankDetailsNext();
		
		//Deduction Details
		NwAp.EnterSubscription();
		NwAp.EnterSpecificDeposits();
		NwAp.EntershareAmount();
		NwAp.SelectsubscriptionDeductSourceDropdown();
		NwAp.SelectspecificDepositDeductSourceDropdown();
		NwAp.SelectshareDeductSourceDropdown();
		NwAp.deductionDetailsNext();
		
		//Fee Details
		NwAp.SelectSourceDropdown();
		NwAp.FeeDetailsNext();
		
		//TIN Details
		NwAp.SelectTINAvailabilityDropdown();
		NwAp.SelectTINNumberDropdown();
		NwAp.EnterIdOfTIN();
		NwAp.tinDetailsNext();
		
		//Skip Nominee
		NwAp.nomineeDetailsSkip();
		
		//Proposer
		NwAp.SelectProposerIdDropdown();
		NwAp.EnterPropserID();
		NwAp.ClickSearchProposerButton();
		NwAp.SelectProposerPaymentDropdown();
		NwAp.proposerDetailsNext();
		
		//Final Confirmation
		NwAp.EnterRemark();
		NwAp.ClickUploadDocumentsButton();
		NwAp.ClickUploadFileButton();
		NwAp.EnterImage();
		NwAp.ClickSendForApprovalButton();
		NwAp.ClickOKButton();
		
		
		
		
	
	
	}
	
	//@Test(priority = 1)
	
		
	
	
	
}
