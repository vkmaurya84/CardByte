package common;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.LoginPage;


public class Common {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Properties message;
	public static Properties userData;
	
	public static void browserSetup() throws IOException
	{
//		 Browser Data 
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\common\\commonBrowserData.properties");
		prop.load(fis);
		
//		Message data
		message = new Properties();
		FileInputStream msgInput = new FileInputStream(System.getProperty("user.dir")+"\\src\\common\\ExpectedMsg.properties");
		message.load(msgInput);
		
//		User General Data
		userData = new Properties();
		FileInputStream generalData = new FileInputStream(System.getProperty("user.dir")+"\\src\\common\\UserDataFile.properties");
		userData.load(generalData);
		
		switch(prop.getProperty("browserName"))
		{
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromePath"));
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 1);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
//			options.addArguments("--headless");
			
			driver = new ChromeDriver(options);
			break;
			
		case "mozilla":
			
			System.setProperty("webdriver.gecko.driver", prop.getProperty("mozillaPath"));
			
			FirefoxOptions opt = new FirefoxOptions();
			opt.addPreference("dom.webnotifications.enabled", true);
			
			driver = new FirefoxDriver(opt);
			break;
			
		case "edge":
			
			System.setProperty("webdriver.edge.driver", prop.getProperty("edgePath"));
			EdgeOptions edgeOptions =new EdgeOptions();
//			  edgeOptions.addArguments("headless");
			driver = new EdgeDriver(edgeOptions);
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://web.cardbyte.ai/login");
		driver.get(prop.getProperty("cardByteStagingURL"));
	}
	
	public static LoginPage log;
	public static void login() throws IOException
	{
		log = new LoginPage(driver);
		log.email().sendKeys(userData.getProperty("userName"));
		log.submit().click();
		log.password().sendKeys(userData.getProperty("password"));
		log.submit().click();
	}
	
	public static void explicitWait(By element)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		 w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static String getScreenshotPath(String testcaseName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
	


}
