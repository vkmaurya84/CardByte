
package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Common;
import objectRepository.ContactPage;
import objectRepository.NotificationPage;

public class NotificationTC {
	
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
	
	NotificationPage notification;
	@Test(enabled = false)
	public void notification() throws IOException
	{

		notification = new NotificationPage(Common.driver);
		toastMsg();
		notification.notificationList().click();
		notification.notificationDetailsList().click();
		notification.closeCard().click();
		
	}

}
