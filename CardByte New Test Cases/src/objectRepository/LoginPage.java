package objectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.Common;


public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By userName = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@placeholder='Enter your password ']");
	By proceed = By.xpath("//span[contains(text(),'Continue')]");
	
	By ForgetPass = By.xpath("//h6[contains(text(),'Forgot password ?')]");
	By restBtn = By.xpath("//span[contains(text(),'Reset password')]");
	
	
	By loginSuccess = By.xpath("//div[contains(text(),'Logged in  successfully')]");
	By resetPassword = By.xpath("//div[contains(text(),'Reset Password link has been sent')]");
	
	
	public WebElement success()
	{
		Common.explicitWait(loginSuccess);
		return driver.findElement(loginSuccess);
	}
	
	public WebElement resetPassword()
	{
		Common.explicitWait(resetPassword);
		return driver.findElement(resetPassword);
	}
	
	
	public WebElement email()
	{
		Common.explicitWait(userName);
		return driver.findElement(userName);
	}
	
	public WebElement password() 
	{
		Common.explicitWait(password);
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		Common.explicitWait(proceed);
		return driver.findElement(proceed);
	}
	
	public WebElement ForgetPass()
	{
		return driver.findElement(ForgetPass);
	}
	
	public WebElement restBtn()
	{
		return driver.findElement(restBtn);
	}

}
