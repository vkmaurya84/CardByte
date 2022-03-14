package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import common.Common;
import objectRepository.ContactPage;
import objectRepository.SettingsPage;

public class SettingsTC {
	
	@BeforeMethod
	public void Browser() throws IOException
	{
		Common.browserSetup();
		Common.login();
	}
	
	@AfterMethod
	public void browserClose()
	{
//		Common.driver.close();
		Common.driver.quit();
	}
	
	ContactPage contact;
	public void toastMsg()
	{
		contact = new ContactPage(Common.driver);
		contact.toast().click();
	}
	
	SettingsPage setting;
	public void settingSetup() throws IOException
	{

		setting = new SettingsPage(Common.driver);
		toastMsg();
		setting.user().click();
		setting.setting().click();
	}
	
	@Test(enabled = true , groups = {"LogOut"})
	public void logout() throws IOException
	{

		setting = new SettingsPage(Common.driver);
		toastMsg();
		setting.user().click();
		setting.logout().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(setting.logoutMsg().getText(), Common.message.getProperty("logoutMsg"));
	}
	
	@Test(enabled = true , groups = {"Settings"})
	public void profile() throws IOException
	{
		settingSetup();
		setting.profile().click();
		setting.firstName().clear();
		setting.firstName().sendKeys(Common.userData.getProperty("firstName"));
		setting.lastName().clear();
		setting.lastName().sendKeys(Common.userData.getProperty("lastName"));
//		setting.profileClose().click();
		setting.profileUpdate().click();
		Assert.assertEquals(setting.profileUpdateMsg().getText(), Common.message.getProperty("profileUpdateMsg"));
	}
	
	@Test(enabled = true , groups = {"Settings"})
	public void privacy() throws IOException
	{
		settingSetup();
		setting.privacyPage().click();
		setting.addMutual().click();
		setting.addNone().click();
		setting.addEvery().click();
		setting.introNone().click();
		setting.introContact().click();
//		setting.privacyCloseBtn().click();
		setting.privacyBackBtn().click();
		Assert.assertEquals(setting.privacyMsg().getText(), Common.message.getProperty("privacyMsg"));
	}
	
	@Test(enabled = true , groups = {"Settings"})
	public void notificationSettings() throws IOException
	{
		settingSetup();
		setting.notificationSetting().click();
		setting.notNotifyme().click();
		setting.notifyme().click();
		setting.notRecommended().click();
		setting.recommended().click();
		setting.notificationSettingCloseBtn().click();
//		setting.notificationSettingBackBtn().click();
		Assert.assertEquals(setting.notificationMsg().getText(), Common.message.getProperty("notificationMsg"));
	}
	
	@Test(enabled = true , groups = {"Settings"})
	public void myPlans() throws IOException
	{
		settingSetup();
		
		setting.planPage().click();
//		setting.planPageBack().click();
		setting.planPageClose().click();
		Assert.assertEquals(setting.planMsg().getText(), Common.message.getProperty("planMsg"));
	}
	
	
	@Test(enabled = true , groups = {"Settings"})
	public void referAndEarn() throws IOException
	{
		settingSetup();
		
		setting.RE().click();
		ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
		Common.driver.switchTo().window(tabs.get(1));
		String[] url = Common.driver.getCurrentUrl().split("\\?");
		Assert.assertEquals(url[0], Common.message.getProperty("R&E"));

	}
	
	@Test(enabled = true , groups = {"Settings"})
	public void help() throws IOException
	{
		settingSetup();

		setting.help().click();
		ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
		Common.driver.switchTo().window(tabs.get(1));
		String url = Common.driver.getCurrentUrl();
		Assert.assertEquals(url, Common.message.getProperty("faq"));
	}
	
	@Test(enabled = true , groups = {"Settings"})
	public void about() throws IOException
	{
		settingSetup();
		
		setting.about().click();
		ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
		Common.driver.switchTo().window(tabs.get(1));
		String url = Common.driver.getCurrentUrl();
		Assert.assertEquals(url, Common.message.getProperty("aboutUs"));
	}
	
	@Test(enabled = true , groups = {"Settings"})
	public void feedback() throws IOException
	{
		settingSetup();
		
		setting.feedback().click();
		setting.feedbackCategory().click();
		setting.feedbackSelect().click();
		setting.comments().sendKeys(Common.userData.getProperty("feedbackMsg"));
		setting.submit().click();
		setting.feedbackBackBtn().click();
//		setting.feedbackCloseBtn().click();
		Assert.assertEquals(setting.feedbackMsg().getText(), Common.message.getProperty("feedbackMsg"));
	}

}
