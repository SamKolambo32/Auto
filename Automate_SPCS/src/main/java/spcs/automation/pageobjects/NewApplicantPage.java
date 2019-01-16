package spcs.automation.pageobjects;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class NewApplicantPage  extends BasePa{

	public WebDriver driver;
	
	public NewApplicantPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By MemberLink = By.cssSelector("#section7.dropmenu");
	//WebElement MemberLink = driver.findElement(By.xpath("//a[text()='Member Management']"));
	
	By NewApplicantss = By.cssSelector("#viewMemberCreateList");
	By Identification = By.cssSelector("#identificationType");
	By idNumber = By.id("idNumber");
	By SearchBtn = By.id("searchMember");
	By NewMemBtn = By.id("newMember");
	By memberType = By.cssSelector("#memberType");
	By SalType = By.cssSelector("#title");
	By Name = By.id("name");
	By DoBCld = By.cssSelector("#dob");
	By Gender = By.cssSelector("#gender");
	By Race = By.cssSelector("#race");
	By TelNoType = By.cssSelector("#telNoType_0");
	By MaritalStatus = By.cssSelector("#maritalStatus");
	By TelephoneNo = By.id("telNo_0");
	By Email = By.cssSelector("#emailType_0");
	By Emailtxt = By.id("email_0");
	By ApplicantDetailsNext = By.id("applicantDetailsNext");
	By AddressType = By.cssSelector("#addressType_0");
	By AddressLine1 = By.name("addressOne");
	By AddressLine2 = By.name("addressTwo");
	By PostalCode = By.id("zipCode_0");
	By addressDetailsNext = By.id("addressDetailsNext");
	By Employer = By.cssSelector("#employer");
	By Division = By.cssSelector("#division");
	By RankNo = By.id("rankNo");
	By Designation = By.id("designation");
	By GrossSalary = By.id("salary");
	By employerDetailsNext = By.id("employerDetailsNext");
	By employmentType = By.cssSelector("#employmentType");
	By BankName = By.cssSelector("#bankName_0");
	By AccountNo = By.id("accountNo_0");
	By bankDetailsNext = By.id("bankDetailsNext");
	By subscriptionAmount=By.id("subscriptionAmount");
	By specificDepositAmount=By.id("specificDepositAmount");
	By shareAmount=By.id("shareAmount");
	By SubscriptionDeductSource = By.id("subscriptionDeductSource");
	By SpecificDepositDeductSource = By.id("specificDepositDeductSource");
	By ShareDeductSource = By.id("shareDeductSource");
	By deductionDetailsNext = By.id("deductionDetailsNext");
	By SourceInFee = By.id("paymethod_M_0");
	By feeDetailsNext = By.id("feeDetailsNext");
	By TinAvailable = By.id("tinAvailable_0");
	By TINIdentificationType = By.id("identificationType_0");
	By IdNumberTin=By.id("idNumber_0");
	By tinDetailsNext = By.id("tinDetailsNext");
	By skipBtn = By.id("skipBtn");
	By ProposerIdentificationType = By.id("identificationType");
	By IdNumberPro=By.id("idNumber");
	By SearchBtnPropser = By.id("memberSearch");
	By ProposerpaymentType = By.id("paymentType");
	By proposerDetailsNext = By.id("proposerDetailsNext");
	By UploadDocumentsLnk = By.id("uploadDoc");
	By UploadFile = By.id("upfile-1_23");
	By link1=By.id("upfile-1_23");
	By remarkValue = By.id("remarkValue");
	By sendToApproval = By.id("sendToApproval");
	By UploadFileBtn = By.id("uploadDocuments");
	By Ok = By.cssSelector("#modal-content > button");
	//#modal-content > button
	
	public void SelectMemberNewApplicants() throws Exception {

		try {
			Thread.sleep(5000);
			driver.findElement(MemberLink).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : MemberLink " + e.getLocalizedMessage());
		}	
		}

	
	public void SelectMemberNewApplicantsPage() throws Exception {

		try {
			Thread.sleep(3000);
			driver.findElement(NewApplicantss).click();
			//MemberLink.click();
			
		} catch (Exception e) {
			throw new Exception("Failed : NewApplicantss " + e.getLocalizedMessage());
		}	
		}
	
	
	public void SelectIdentificationDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement identification = driver.findElement(Identification);
			Select IdList = new Select(identification);
			IdList.selectByValue("PASSPORT");

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	

	public void EnterIdentificationName() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			//driver.findElement(idNumber).sendKeys("N3");
			driver.findElement(idNumber).sendKeys(getTestData("NameOfMember"));
			
		} catch (Exception e) {
			throw new Exception("Failed : idNumber " + e.getLocalizedMessage());
		}

	}
	
	
	
	
	public void ClickSearchButton() throws Exception {

		try {
			Thread.sleep(1000);
			driver.findElement(SearchBtn).click();
			Assert.assertTrue(driver.findElement(SearchBtn).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : ClickSearchButton " + e.getLocalizedMessage());
		}

	}
	
	
	public void ClickNewMemberButton() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(NewMemBtn).click();
			Assert.assertTrue(driver.findElement(NewMemBtn).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : ClickSearchButton " + e.getLocalizedMessage());
		}

	}
	
	public void SelectMemberTypeDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement identification = driver.findElement(memberType);
			Select IdList = new Select(identification);
			IdList.selectByValue("ORDINARY");

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	

	public void SelectSalautaitionDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement sal = driver.findElement(SalType);
			Select SalList = new Select(sal);
			SalList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterName() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(Name).sendKeys("SAMITHA KOLAMBAGE");

		} catch (Exception e) {
			throw new Exception("Failed : idNumber " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectDoB() throws Exception {

		/*driver.findElement(By.name("dob")).click();
		Thread.sleep(2000);
		WebElement mnthArrow = driver.findElement(By.xpath("//tr/th[@class='next']"));
		
		for(int i = 0; i<=mnthArrow.getSize();i++) {}
		
		Select mnthArrowList = new Select(mnthArrow);
		List<WebElement> mtData = mnthArrowList.getOptions();
		for (WebElement ele : mtData) {
			String mtValue = ele.getText();
			
			if (mtValue.contentEquals("July 1999")) {
				ele.click();
				break;
			}
		
	}*/
		
		
				//Click On Datepicker
				driver.findElement(By.id("dob")).click();
				Thread.sleep(2000);
				
				//Date Picker header 1st Click
				driver.findElement(By.cssSelector("th.datepicker-switch")).click();
				Thread.sleep(2000);
			
				//Date Picker Header 2nd Click
				driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-months > table > thead > tr > th.datepicker-switch")).click();
				Thread.sleep(2000);
				
				//Year Range Click //Back in Year Range
				driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-years > table > thead > tr > th.prev")).click();
				Thread.sleep(2000);
				
				
				//Select The Year
				driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-years > table > tbody > tr > td > span.year.old")).click();
				Thread.sleep(2000);
				
				//Select The Month
				driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-months > table > tbody > tr > td > span:nth-child(1)")).click();
				Thread.sleep(2000);
			
				//Select The Date
				driver.findElement(By.cssSelector("body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(1) > td:nth-child(6)")).click();
	
	
	}
	
	
	
	
	public void SelectGenderDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement gender = driver.findElement(Gender);
			Select GenderList = new Select(gender);
			GenderList.selectByIndex(1);
			
		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	
	public void SelectRaceDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement race = driver.findElement(Race);
			Select RaceList = new Select(race);
			RaceList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	
	public void SelectTelNoDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement telNoType = driver.findElement(TelNoType);
			Select TelNoTypeList = new Select(telNoType);
			TelNoTypeList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectMaritalStatusDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement maritalStatus = driver.findElement(MaritalStatus);
			Select maritalStatusList = new Select(maritalStatus);
			maritalStatusList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	
	
	
	public void EnterTelNo() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(TelephoneNo).sendKeys("01234567890");

		} catch (Exception e) {
			throw new Exception("Failed : TelephoneNo " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectEmailDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement email = driver.findElement(Email);
			Select emailList = new Select(email);
			emailList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	
	
	
	public void EnterEmailtxt() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(Emailtxt).sendKeys("SamithaKolambage@gmail.com");

		} catch (Exception e) {
			throw new Exception("Failed : Emailtxt " + e.getLocalizedMessage());
		}

	}
	
	public void ClickApplicantDetailsNext() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(ApplicantDetailsNext).click();
			Assert.assertTrue(driver.findElement(ApplicantDetailsNext).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : ApplicantDetailsNext " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectRadioPrimary() throws Exception {

		
	try {
		Thread.sleep(2000);
		//3.radioBtn
		driver.findElement(By.cssSelector("#mailing_0")).click();;
		//WebElement radioBtn = driver.findElement(By.id("radio_4[]"));
		
		
	} catch (Exception e) {
		
		throw new Exception("Failed : PrimaryRadio " + e.getLocalizedMessage());
	}
	
		}
	
	
	public void SelectAddressTypeDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement addressType = driver.findElement(AddressType);
			Select addressTypeList = new Select(addressType);
			addressTypeList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : addressTypeList " + e.getLocalizedMessage());
		}

	}
	
	public void EnterAddress_Line_1() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(AddressLine1).sendKeys("250, New Island Senthosa");

		} catch (Exception e) {
			throw new Exception("Failed : AddressLine1 " + e.getLocalizedMessage());
		}

	}
	
	public void EnterAddress_Line_2() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(AddressLine2).sendKeys("Slims Avenue ");

		} catch (Exception e) {
			throw new Exception("Failed : AddressLine2 " + e.getLocalizedMessage());
		}

	}
	
	public void EnterZipCode() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(PostalCode).sendKeys("123456");

		} catch (Exception e) {
			throw new Exception("Failed : AddressLine2 " + e.getLocalizedMessage());
		}

	}
	
	public void ClickAddressDetailsNext() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(addressDetailsNext).click();
			Assert.assertTrue(driver.findElement(addressDetailsNext).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : addressDetailsNext " + e.getLocalizedMessage());
		}

	}
	
	public void SelectEmpDate()throws Exception {
		
		try {
			//Click On Datepicker
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#dateOfEmployment")).click();
			
			//Select Today
			Thread.sleep(2000);
			//driver.findElement(By.cssSelector("body > div:nth-child(38) > div.datepicker-days > table > tfoot > tr:nth-child(1) > th")).click();
			driver.findElement(By.cssSelector("th.today")).click();
			
			
		} catch (InterruptedException e) {
			
			throw new Exception("Failed : Empdate " + e.getLocalizedMessage());
		}
		
		
	}
	
	
	public void SelectNameofEmployeDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement employer = driver.findElement(Employer);
			Select emailList = new Select(employer);
			emailList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SelectTitileDropdown " + e.getLocalizedMessage());
		}

	}
	

	
	public void SelectEmploymentTypetDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement EmploymentType = driver.findElement(employmentType);
			Select EmploymentTypeList = new Select(EmploymentType);
			EmploymentTypeList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : divisionList " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectDivisionUnitDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement division = driver.findElement(Division);
			Select divisionList = new Select(division);
			divisionList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : divisionList " + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterRankNo() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(RankNo).sendKeys(" Rank 123456");

		} catch (Exception e) {
			throw new Exception("Failed : RankNo" + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterDesignation() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(Designation).sendKeys(" Designation_Captain");

		} catch (Exception e) {
			throw new Exception("Failed : RankNo" + e.getLocalizedMessage());
		}

	}

	public void EnterGrossSalary() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(GrossSalary).sendKeys("50000.00");

		} catch (Exception e) {
			throw new Exception("Failed : RankNo" + e.getLocalizedMessage());
		}

	}
	
	
	
	public void ClickEmployerDetailsNext() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(employerDetailsNext).click();
			Assert.assertTrue(driver.findElement(employerDetailsNext).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : addressDetailsNext " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectBankRadioPrimary() throws Exception {

		
		try {
			Thread.sleep(2000);
			//3.radioBtn
			driver.findElement(By.cssSelector("#primary_0")).click();;
			//WebElement radioBtn = driver.findElement(By.id("radio_4[]"));
			
			
		} catch (Exception e) {
			
			throw new Exception("Failed : PrimaryRadio " + e.getLocalizedMessage());
		}
		
			}
	
	
	public void SelectBankNameDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement bankName = driver.findElement(BankName);
			Select BankNameList = new Select(bankName);
			BankNameList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : BankName " + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterBankACNo() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(AccountNo).sendKeys("9876543210");

		} catch (Exception e) {
			throw new Exception("Failed : RankNo" + e.getLocalizedMessage());
		}

	}
	
	public void ClickbankDetailsNext() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(bankDetailsNext).click();
			Assert.assertTrue(driver.findElement(bankDetailsNext).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : addressDetailsNext " + e.getLocalizedMessage());
		}

	}
	
	//Deduction Details
	
	public void EnterSubscription() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(subscriptionAmount).sendKeys("100.00");

		} catch (Exception e) {
			throw new Exception("Failed : subscriptionAmount" + e.getLocalizedMessage());
		}

	}
	
	public void EnterSpecificDeposits () throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(specificDepositAmount).sendKeys("100.00");

		} catch (Exception e) {
			throw new Exception("Failed : specificDepositAmount" + e.getLocalizedMessage());
		}

	}
	
	public void EntershareAmount() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(shareAmount).sendKeys("100.00");

		} catch (Exception e) {
			throw new Exception("Failed : shareAmount" + e.getLocalizedMessage());
		}

	}
	
	//subscriptionDeductSource
	
	public void SelectsubscriptionDeductSourceDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement subscriptionDeductSource = driver.findElement(SubscriptionDeductSource);
			Select subscriptionDeductSourceList = new Select(subscriptionDeductSource);
			subscriptionDeductSourceList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SubscriptionDeductSource " + e.getLocalizedMessage());
		}

	}
	
	public void SelectspecificDepositDeductSourceDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement specificDepositDeductSource = driver.findElement(SpecificDepositDeductSource);
			Select specificDepositDeductSourceList = new Select(specificDepositDeductSource);
			specificDepositDeductSourceList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : SpecificDepositDeductSource " + e.getLocalizedMessage());
		}

	}
	
	public void SelectshareDeductSourceDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement shareDeductSource = driver.findElement(ShareDeductSource);
			Select shareDeductSourceList = new Select(shareDeductSource);
			shareDeductSourceList.selectByIndex(3);

		} catch (Exception e) {
			throw new Exception("Failed : ShareDeductSource " + e.getLocalizedMessage());
		}

	}
	
	
	public void deductionDetailsNext() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(deductionDetailsNext).click();
			Assert.assertTrue(driver.findElement(deductionDetailsNext).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : deductionDetailsNext " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectSourceDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement sourceInFee = driver.findElement(SourceInFee);
			Select SourceList = new Select(sourceInFee);
			SourceList.selectByIndex(3);

		} catch (Exception e) {
			throw new Exception("Failed : SourceInFee " + e.getLocalizedMessage());
		}

	}
	
	
	public void FeeDetailsNext() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(feeDetailsNext).click();
			Assert.assertTrue(driver.findElement(feeDetailsNext).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : feeDetailsNext " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectTINAvailabilityDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement tinAvailable = driver.findElement(TinAvailable);
			Select tinAvailableList = new Select(tinAvailable);
			tinAvailableList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : tinAvailableList " + e.getLocalizedMessage());
		}

	}
	
	public void SelectTINNumberDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement tINIdentificationType = driver.findElement(TINIdentificationType);
			Select tINIdentificationTypeList = new Select(tINIdentificationType);
			tINIdentificationTypeList.selectByIndex(2);

		} catch (Exception e) {
			throw new Exception("Failed : tINIdentificationType " + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterIdOfTIN() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(IdNumberTin).sendKeys("1122334455");

		} catch (Exception e) {
			throw new Exception("Failed : shareAmount" + e.getLocalizedMessage());
		}

	}
	
	
	public void tinDetailsNext() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(tinDetailsNext).click();
			Assert.assertTrue(driver.findElement(tinDetailsNext).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : tinDetailsNext " + e.getLocalizedMessage());
		}

	}
	
	public void nomineeDetailsSkip() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(skipBtn).click();
			Assert.assertTrue(driver.findElement(skipBtn).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : skipBtn " + e.getLocalizedMessage());
		}

	}
	
	
	public void SelectProposerIdDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement proposerIdentificationType = driver.findElement(ProposerIdentificationType);
			Select proposerIdentificationTypeList = new Select(proposerIdentificationType);
			proposerIdentificationTypeList.selectByIndex(2);

		} catch (Exception e) {
			throw new Exception("Failed : tINIdentificationType " + e.getLocalizedMessage());
		}

	}
	
	public void EnterPropserID() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(IdNumberPro).sendKeys("Passport11");

		} catch (Exception e) {
			throw new Exception("Failed : IdNumberPro" + e.getLocalizedMessage());
		}

	}
	
	public void ClickSearchProposerButton() throws Exception {

		try {
			Thread.sleep(1000);
			driver.findElement(SearchBtnPropser).click();
			//Assert.assertTrue(driver.findElement(SearchBtnPropser).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : SearchBtnPropser " + e.getLocalizedMessage());
		}

	}
	
	public void SelectProposerPaymentDropdown() throws Exception {

		try {
			Thread.sleep(2000);
			WebElement proposerpaymentType = driver.findElement(ProposerpaymentType);
			Select proposerpaymentTypeList = new Select(proposerpaymentType);
			proposerpaymentTypeList.selectByIndex(1);

		} catch (Exception e) {
			throw new Exception("Failed : ProposerpaymentType " + e.getLocalizedMessage());
		}

	}
	
	public void proposerDetailsNext() throws Exception {

		try {
			Thread.sleep(4000);
			driver.findElement(proposerDetailsNext).click();
			Assert.assertTrue(driver.findElement(proposerDetailsNext).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : proposerDetailsNext " + e.getLocalizedMessage());
		}

	}
	
	public void ClickUploadDocumentsButton() throws Exception {

		try {
			Thread.sleep(1000);
			driver.findElement(UploadDocumentsLnk).click();
			Assert.assertTrue(driver.findElement(UploadDocumentsLnk).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : UploadDocumentsLnk " + e.getLocalizedMessage());
		}

	}
	
	public void ClickUploadFileButton() throws Exception {
		Robot robot= new Robot();
		try {
			Thread.sleep(1000);
			driver.findElement(UploadFile).click();
			//Assert.assertTrue(driver.findElement(UploadFile).isEnabled());
			//driver.findElement(UploadFile).sendKeys("F:\\Samitha\\Img\\NewImg\\Placement\\png_birth.png");
			
			
		//	WebElement frame =driver.switchTo().activeElement();
		//	 frame.sendKeys("F:/Samitha/Img/NewImg/Placement/png_birth.png");
			
			
			
			robot.setAutoDelay(2000);
			StringSelection stringSelection = new StringSelection("C:\\Users\\samitha_k\\Desktop\\png_birth.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception e) {
			throw new Exception("Failed : UploadFile " + e.getLocalizedMessage());
		}

	}
	
	
	/////File Uploader
	//driver.findElement(By.id("profile_pic_10")).sendKeys("F:\\Other\\Software\\aa.jpg");
	//WebElement frame =driver.switchTo().activeElement();
	//  frame.sendKeys("d:\5.jpg");
	
			
	
	public void EnterImage() throws Exception {
		


		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			//driver.findElement(idNumber).sendKeys("N3");
			//driver.findElement(link1).sendKeys("F:\\Samitha\\Img\\NewImg\\Placement\\png_birth.png");
			
			/*
			WebElement frame =driver.switchTo().activeElement();
			 frame.sendKeys("C:\\Users\\samitha_k\\Desktop\\png_birth.png");*/
			
			
			driver.findElement(UploadFileBtn).click();
			
			
		} catch (Exception e) {
			throw new Exception("Failed : idNumber " + e.getLocalizedMessage());
		}

	}
	
	
	public void EnterRemark() throws Exception {

		try {
			
			Thread.sleep(1000);
			//driver.findElement(NameOnCardTxt).sendKeys(getTestData("NameOnCard"));
			driver.findElement(remarkValue).sendKeys("SFA1");

		} catch (Exception e) {
			throw new Exception("Failed : remarkValue" + e.getLocalizedMessage());
		}

	}
	
	public void ClickSendForApprovalButton() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(sendToApproval).click();
			//Assert.assertTrue(driver.findElement(SearchBtnPropser).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : sendToApproval " + e.getLocalizedMessage());
		}

	}
	
	
	public void ClickOKButton() throws Exception {

		try {
			Thread.sleep(2000);
			driver.findElement(Ok).click();
			//Assert.assertTrue(driver.findElement(SearchBtnPropser).isEnabled());
		} catch (Exception e) {
			throw new Exception("Failed : Ok " + e.getLocalizedMessage());
		}

	}
	
}

