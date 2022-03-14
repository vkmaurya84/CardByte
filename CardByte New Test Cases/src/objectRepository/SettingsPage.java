package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Common;

public class SettingsPage {
	
WebDriver driver;
	
	public SettingsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By currentUser = By.xpath("//button[@aria-label='account of current user']");
	By settings = By.xpath("//nav[@aria-label='list']/div[1]");
	By logout = By.xpath("//nav[@aria-label='list']/div[2]");
	
	By profile = By.xpath("//div[@id='setting-sidebar']/ul/li[1]");
	By fName = By.name("firstName");
	By lName = By.name("lastName");
	By Continue = By.xpath("//span[contains(text(),'Continue')]");
	By profileCloseBtn = By.xpath("//div[@class='m-2']/div/button");
	
	By profileUpdateMsg = By.xpath("//div[contains(text(),'Updated successfully')]");
	By privacyMsg = By.xpath("//span[contains(text(),'Privacy')]");
	By notificationMsg = By.xpath("//span[contains(text(),'Notifications')]");
	By planMsg = By.xpath("//span[contains(text(),'My Plan')]");
	By feedbackMsg = By.xpath("//div[contains(text(),'Thank you for your feedback!')]");
	By logoutMsg = By.xpath("//div[contains(text(),'Logged out  successfully')]");
	
	
	public WebElement logoutMsg()
	{
		Common.explicitWait(logoutMsg);
		return driver.findElement(logoutMsg);
	}
	
	public WebElement feedbackMsg()
	{
		Common.explicitWait(feedbackMsg);
		return driver.findElement(feedbackMsg);
	}
	
	public WebElement planMsg()
	{
		Common.explicitWait(planMsg);
		return driver.findElement(planMsg);
	}
	
	public WebElement notificationMsg()
	{
		Common.explicitWait(notificationMsg);
		return driver.findElement(notificationMsg);
	}
	
	public WebElement privacyMsg()
	{
		Common.explicitWait(privacyMsg);
		return driver.findElement(privacyMsg);
	}
	
	public WebElement profileUpdateMsg()
	{
		Common.explicitWait(profileUpdateMsg);
		return driver.findElement(profileUpdateMsg);
	}
	
	public WebElement user()
	{
		Common.explicitWait(currentUser);
		return driver.findElement(currentUser);
	}
	
	public WebElement logout()
	{
		Common.explicitWait(logout);
		return driver.findElement(logout);
	}
	
	public WebElement setting()
	{
		Common.explicitWait(settings);
		return driver.findElement(settings);
	}
	
	public WebElement profile()
	{
		Common.explicitWait(profile);
		return driver.findElement(profile);
	}
	
	public WebElement profileClose()
	{
		Common.explicitWait(profileCloseBtn);
		return driver.findElement(profileCloseBtn);
	}
	
	public WebElement firstName()
	{
		Common.explicitWait(fName);
		return driver.findElement(fName);
	}
	
	public WebElement lastName()
	{
		Common.explicitWait(lName);
		return driver.findElement(lName);
	}
	
	public WebElement profileUpdate()
	{
		Common.explicitWait(Continue);
		return driver.findElement(Continue);
	}
	
	
	By privacy = By.xpath("//div[@id='setting-sidebar']/ul/li[2]");
	By privacyClose = By.xpath("//div[@id='privacy-sidebar']/div[1]/span[3]/button");
	By privacyBack = By.xpath("//div[@id='privacy-sidebar']/div[1]/span[1]/button");
//	who can add you ? 
	By everyone = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[2]/div[1]/div[2]/span[1]");
	By mutualone = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[3]/div[1]/div[2]/span[1]");
	By none = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[4]/div[1]/div[2]/span[1]");
//	who can Introduce you ?
	By contact = By.xpath("//div[@id='privacy-sidebar']/div[3]/div[2]/div[2]/span[1]");
	By noone = By.xpath("//div[@id='privacy-sidebar']/div[3]/div[4]/div[2]/span[1]");
	
	
	
	public WebElement privacyPage()
	{
		Common.explicitWait(privacy);
		return driver.findElement(privacy);
	}
	
	public WebElement addEvery()
	{
		Common.explicitWait(everyone);
		return driver.findElement(everyone);
	}
	
	public WebElement addMutual()
	{
		Common.explicitWait(mutualone);
		return driver.findElement(mutualone);
	}
	
	public WebElement addNone()
	{
		Common.explicitWait(none);
		return driver.findElement(none);
	}
	
	public WebElement introContact()
	{
		Common.explicitWait(contact);
		return driver.findElement(contact);
	}
	
	public WebElement introNone()
	{
		Common.explicitWait(noone);
		return driver.findElement(noone);
	}
	
	public WebElement privacyCloseBtn()
	{
		Common.explicitWait(privacyClose);
		return driver.findElement(privacyClose);
	}
	
	public WebElement privacyBackBtn()
	{
		Common.explicitWait(privacyBack);
		return driver.findElement(privacyBack);
	}
	
	
	
	By notificationSeting = By.xpath("//div[@id='setting-sidebar']/ul/li[3]");
	By notificationClose = By.xpath("//div[@id='notofication']/span[3]/button[1]");
	By notificationBack = By.xpath("//div[@id='notofication']/span[1]/button[1]");
//	Get Latest Updates
	By notify = By.xpath("//div[@id='privacy-sidebar']/div[1]/div[2]/div[1]/div[2]/span");
	By noNotify = By.xpath("//div[@id='privacy-sidebar']/div[1]/div[3]/div[1]/div[2]/span");
//	Your network - Recommend contacts?
	By recommend = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[2]/div[2]/span[1]");
	By noRecommend = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[4]/div[2]/span[1]");

	
	public WebElement notificationSetting()
	{
		Common.explicitWait(notificationSeting);
		return driver.findElement(notificationSeting);
	}
	
	public WebElement notifyme()
	{
		Common.explicitWait(notify);
		return driver.findElement(notify);
	}
	
	public WebElement notNotifyme()
	{
		Common.explicitWait(noNotify);
		return driver.findElement(noNotify);
	}
	
	public WebElement recommended()
	{
		Common.explicitWait(recommend);
		return driver.findElement(recommend);
	}
	
	public WebElement notRecommended()
	{
		Common.explicitWait(noRecommend);
		return driver.findElement(noRecommend);
	}
	
	public WebElement notificationSettingCloseBtn()
	{
		Common.explicitWait(notificationClose);
		return driver.findElement(notificationClose);
	}
	
	public WebElement notificationSettingBackBtn()
	{
		Common.explicitWait(notificationBack);
		return driver.findElement(notificationBack);
	}
	
	By plan = By.xpath("//div[@id='setting-sidebar']/ul/li[4]");
	By standard = By.xpath("//p[contains(text(),'Standard')]");
	By pay = By.xpath("//button[contains(text(),'Pay & Subscribe')]");
	By checkouBack = By.xpath("//button[@aria-label='back']");
	By myPlanBack = By.xpath("//div[@id='plan-container']/div[1]/span[1]/button[1]");
	By myPlanClose = By.xpath("//div[@id='plan-container']/div[1]/span[3]/button[1]");
	
	
	public WebElement planPage()
	{
		return driver.findElement(plan);
	}
	
	public WebElement planPageBack()
	{
		return driver.findElement(myPlanBack);
	}
	
	public WebElement planPageClose()
	{
		return driver.findElement(myPlanClose);
	}
	
	By refer = By.xpath("//div[@id='setting-sidebar']/ul/a[1]/li");
	By help = By.xpath("//div[@id='setting-sidebar']/ul/li[5]");
	By about = By.xpath("//div[@id='setting-sidebar']/ul/a[2]/li");
	
	public WebElement RE()
	{
		return driver.findElement(refer);
	}
	
	public WebElement help()
	{
		return driver.findElement(help);
	}
	
	public WebElement about()
	{
		return driver.findElement(about);
	}
	
	By feed = By.xpath("//div[@id='setting-sidebar']/ul/li[6]");
	By feedCategory = By.xpath("//div[@id='comment-box']/form/div[1]/div[1]/div[2]/div[2]");
	By feedSelect = By.cssSelector("#react-select-3-option-1");
	By comment = By.id("comments");
	By submit = By.xpath("//span[contains(text(),'Submit')]");
	By feedbackBack = By.xpath("//div[@id='CommentBox']/div[1]/span[1]/button[1]");
	By feedbackClose = By.xpath("//div[@id='CommentBox']/div[1]/span[3]/button[1]");
	
	public WebElement feedback()
	{
		return driver.findElement(feed);
	}
	
	public WebElement feedbackCategory()
	{
		return driver.findElement(feedCategory);
	}
	
	public WebElement feedbackSelect()
	{
		return driver.findElement(feedSelect);
	}
	
	public WebElement comments()
	{
		return driver.findElement(comment);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement feedbackBackBtn()
	{
		return driver.findElement(feedbackBack);
	}
	
	public WebElement feedbackCloseBtn()
	{
		return driver.findElement(feedbackClose);
	}

}
