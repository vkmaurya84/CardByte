package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import common.Common;
import objectRepository.LoginPage;

public class LoginTC {
	
	
	@BeforeMethod
	public void Browser() throws IOException
	{
		Common.browserSetup();
		log = new LoginPage(Common.driver);
	}
	
	@AfterMethod
	public void browserClose()
	{
//		Common.driver.close();
		Common.driver.quit();
	}
	
	LoginPage log;
	
	@Test(enabled = true)
	public void login() throws IOException
	{
		
		Common.login();
		Assert.assertEquals(log.success().getText(), Common.message.getProperty("LoginSuccess"));
		
	}
	
	
	@Test(enabled = true)
	public void forgotPassword() throws IOException
	{
		
		log.ForgetPass().click();
		log.email().sendKeys(Common.userData.getProperty("userName"));
		log.restBtn().click();
		Assert.assertEquals(log.resetPassword().getText(), Common.message.getProperty("forgotMsg"));
		
	}

}
