

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class BasePa {

	WebDriver driver;
	public static FileInputStream fis;
	public static String testdatafilepath = "C:\\Users\\samitha_k\\git\\Auto\\Automate_SPCS\\src\\test\\resources\\testdata.properties";
	
	
	public static String getTestData(String key) throws IOException, FileNotFoundException {
		fis = new FileInputStream(testdatafilepath);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}




}
