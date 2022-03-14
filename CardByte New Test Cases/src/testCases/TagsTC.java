package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Common;
import objectRepository.ContactPage;
import objectRepository.TagsPage;

public class TagsTC {
	
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
	
	TagsPage tag;
	
	public void tagSetup() throws IOException
	{

		tag = new TagsPage(Common.driver);
		toastMsg();
		tag.tagList().click();
		tag.tagContact().click();
		tag.tagCardPreview().click();

	}
	
	@Test(enabled = true , groups = {"Tags"})
	public void tagUpdate() throws IOException
	{

		tag = new TagsPage(Common.driver);
		toastMsg();
		tag.tagList().click();
		tag.tagEditBtn().click();
		tag.tagUpdate().clear();
		tag.tagUpdate().sendKeys(Common.userData.getProperty("tagName"));
		tag.tagUpdateAccept().click();
//		tag.tagUpdateDeleteReject().click();
		Assert.assertEquals(tag.tagUpdateMsg().getText(), Common.message.getProperty("tagsUpdate"));
	}
	
	@Test(enabled = true , groups = {"Tags"})
	public  void tagDelete() throws IOException
	{

		tag = new TagsPage(Common.driver);
		toastMsg();
		tag.tagList().click();
		tag.tagDelete().click();
		tag.tagDeleteAccept().click();
//		tag.tagUpdateDeleteReject().click();
		Assert.assertEquals(tag.tagDeleteMsg().getText(), Common.message.getProperty("tagDelete"));
	}
	
	@Test(enabled = true , groups = {"Tags"})
	public void tagContactMail() throws IOException
	{
		tagSetup();		
		contact.mail().click();
		
	}
	
	@Test(enabled = true , groups = {"Tags"})
	public void tagContactMap() throws IOException
	{
		tagSetup();
		contact.map().click();
		ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
		Common.driver.switchTo().window(tabs.get(1));
		String[] url = Common.driver.getCurrentUrl().split("\\?");
		Assert.assertEquals(url[0], Common.message.getProperty("Map"));
	}
	
	@Test(enabled = true , groups = {"Tags"})
	public void tagContactBlock() throws IOException
	{
		tagSetup();
		contact.C_block().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.blockMsg().getText(), Common.message.getProperty("block"));
	}
	
	@Test(enabled = true , groups = {"Tags"}, dependsOnMethods = { "tagContactBlock" })
	public void tagContactUnblock() throws IOException
	{
		tagSetup();
		contact.C_block().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.unblockMsg().getText(), Common.message.getProperty("unblock"));
	}
	
	@Test(enabled = true , groups = {"Tags"})
	public void tagContactFavourite() throws IOException
	{
		tagSetup();
//		contact.C_report().click();
		contact.C_favourite().click();
		Assert.assertEquals(contact.favouriteMsg().getText(), Common.message.getProperty("favourite"));
	}
	
	@Test(enabled = true , groups = {"Tags"}, dependsOnMethods = { "tagContactFavourite" })
	public void tagContactUnfavourite() throws IOException
	{
		tagSetup();
//		contact.C_report().click();
		contact.C_favourite().click();
		Assert.assertEquals(contact.unfavouriteMsg().getText(), Common.message.getProperty("unfavourite"));
	}
	
	@Test(enabled = true , groups = {"Tags"})
	public void tagContactTags() throws IOException
	{
		tagSetup();		
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		Assert.assertEquals(contact.tagMsg().getText(), Common.message.getProperty("tagMsg"));
	}
	
	@Test(enabled = true , groups = {"Tags"})
	public void tagCardShare() throws IOException
	{
		tagSetup();
		
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
	
	@Test(enabled = false , groups = {"Tags"})
	public void tagCardRemove() throws IOException
	{
		tagSetup();

		contact.menu().click();
		contact.c_remove().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.cardRemoveMsg().getText(), Common.message.getProperty("cardRemove"));
	}
	
	@Test(enabled = true , groups = {"Tags"})
	public void tagCardRemoveMenuClose() throws IOException
	{
		tagSetup();		
		contact.menu().click();
		contact.c_close().click();

	}

}
