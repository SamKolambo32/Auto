import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;




//import com.epic.selenium.cms.ui.pageobjects.LoginPage;
public class LoginT  extends Base1Test{
	
	@Test(priority = 1)
	public void ValidLogin() throws FileNotFoundException, IOException, Exception {
		
 
		LoginP login = new LoginP(driver);
		
	//	By userName = By.name("username");
		//By password = By.name("password");
		
		//driver.get("http://192.168.1.29:9085/SPCS_QA_V1.28/login.htm");
		login.enterValidUserName();
	
		
	
	
	}
}
