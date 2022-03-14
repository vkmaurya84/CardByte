package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import common.Common;
import objectRepository.ContactPage;

public class ContactTC {
	
	@BeforeMethod
	public void Browser() throws IOException
	{
		Common.browserSetup();
		
		Common.login();
		contact = new ContactPage(Common.driver);
	}
	
	@AfterMethod
	public void browserClose()
	{
		Common.driver.close();
//		Common.driver.quit();
	}
	
	ContactPage contact;
	public void contactSetup() throws IOException
	{
		contact.toast().click();
		contact.list().click();
		contact.contact().click();
	}
	
	
	@Test(enabled = true , groups = {"Contact"})
	public void contactMail() throws IOException
	{
		contactSetup();
		contact.mail().click();

	}
	
	@Test(enabled = true , groups = {"Contact"})
	public void contactMap() throws IOException
	{
		contactSetup();
		contact.map().click();
		ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
		Common.driver.switchTo().window(tabs.get(1));
		String[] url = Common.driver.getCurrentUrl().split("\\?");
		Assert.assertEquals(url[0], Common.message.getProperty("Map"));
	}
	
	@Test(enabled = true , groups = {"Contact"})
	public void contactBlock() throws IOException
	{
		contactSetup();
		contact.C_block().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.blockMsg().getText(), Common.message.getProperty("block"));
		
	}
	
	@Test(enabled = true , groups = {"Contact"}, dependsOnMethods = { "contactBlock" })
	public void contactUnblock() throws IOException
	{
		contactSetup();
		contact.C_block().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.unblockMsg().getText(), Common.message.getProperty("unblock"));
	}
	
	@Test(enabled = true , groups = {"Contact"})
	public void contactFavourite() throws IOException
	{
		contactSetup();
//		contact.C_report().click();
		contact.C_favourite().click();
		Assert.assertEquals(contact.favouriteMsg().getText(), Common.message.getProperty("favourite"));
		
	}
	
	@Test(enabled = true , groups = {"Contact"}, dependsOnMethods = { "contactFavourite" })
	public void contactUnfavourite() throws IOException
	{
		contactSetup();
//		contact.C_report().click();
		contact.C_favourite().click();
		Assert.assertEquals(contact.unfavouriteMsg().getText(), Common.message.getProperty("unfavourite"));
	}
	
	@Test(enabled = true , groups = {"Contact"})
	public void contactTags() throws IOException
	{
		contactSetup();
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		Assert.assertEquals(contact.tagMsg().getText(), Common.message.getProperty("tagMsg"));
	}
	
	@Test(enabled = true , groups = {"Contact"})
	public void shareCards() throws IOException
	{
		contactSetup();
		
		contact.sendCard().click();
//		when we have two or more cards
		contact.shareCard().click();
		String msg = contact.cardShareMsg().getText();
		if(msg.equals(Common.message.getProperty("cardShareMsg1")))
		{
			Assert.assertEquals(msg , Common.message.getProperty("cardShareMsg1"));
		}	
		else 
		{
			Assert.assertEquals(msg , Common.message.getProperty("cardShareMsg2"));
		}
	}
	
//	@Test(enabled = true , groups = {"Contact"}, dependsOnMethods = { "shareCards" })
//	public void shareCards2() throws IOException
//	{
//		contactSetup();
//		
//		contact.sendCard().click();
////		when we have two or more cards
//		contact.shareCard().click();
//		Assert.assertEquals(contact.cardShareMsg().getText(), Common.message.getProperty("cardShareMsg2"));
//	}
	
	@Test(enabled = true , groups = {"Contact"})
	public void cardRemove() throws IOException
	{
		contactSetup();
		contact.menu().click();
		contact.c_remove().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.cardRemoveMsg().getText(), Common.message.getProperty("cardRemove"));

	}
	
	@Test(enabled = true , groups = {"Contact"})
	public void contactMenuClose() throws IOException
	{
		contactSetup();	
		contact.menu().click();
		contact.c_close().click();


	}

}
