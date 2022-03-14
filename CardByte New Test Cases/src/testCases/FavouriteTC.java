package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Common;
import objectRepository.ContactPage;
import objectRepository.FavouritePage;


public class FavouriteTC {
	
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
	
	FavouritePage fav;
	public void favouriteSetup() throws IOException
	{

		fav = new FavouritePage(Common.driver);
		toastMsg();
		fav.favouriteList().click();
		fav.favouriteCard().click();
		
	}
	
	@Test(enabled = true , groups = {"Favourite"})
	public void favouriteContactCardMail() throws IOException
	{
		favouriteSetup();
		contact.mail().click();
		
	}
	
	@Test(enabled = true , groups = {"Favourite"})
	public void favouriteContactCardMap() throws IOException
	{
		favouriteSetup();
		contact.map().click();
		ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
		Common.driver.switchTo().window(tabs.get(1));
		String[] url = Common.driver.getCurrentUrl().split("\\?");
		Assert.assertEquals(url[0], Common.message.getProperty("Map"));
	}
	
	@Test(enabled = true , groups = {"Favourite"})
	public void favouriteContactCardBlock() throws IOException
	{
		favouriteSetup();
		contact.C_block().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.blockMsg().getText(), Common.message.getProperty("block"));
	}
	
	@Test(enabled = true , groups = {"Favourite"}, dependsOnMethods = { "favouriteContactCardBlock" })
	public void favouriteContactCardUnblock() throws IOException
	{
		favouriteSetup();
		contact.C_block().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.unblockMsg().getText(), Common.message.getProperty("unblock"));
	}
	
	@Test(enabled = true , groups = {"Favourite"})
	public void favouriteContactCardUnfavourite() throws IOException
	{
		favouriteSetup();
//		contact.C_report().click();
		contact.C_favourite().click();
		Assert.assertEquals(contact.unfavouriteMsg().getText(), Common.message.getProperty("unfavourite"));
	}
	
	@Test(enabled = true , groups = {"Favourite"})
	public void favouriteTags() throws IOException
	{
		favouriteSetup();
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		Assert.assertEquals(contact.tagMsg().getText(), Common.message.getProperty("tagMsg"));
	}
	
	@Test(enabled = true , groups = {"Favourite"})
	public void cardsShareToFavourite() throws IOException
	{
		favouriteSetup();
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
	
	@Test(enabled = false , groups = {"Favourite"})
	public void favouiteCardRemove() throws IOException
	{
		favouriteSetup();
		contact.menu().click();
		contact.c_remove().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(contact.cardRemoveMsg().getText(), Common.message.getProperty("cardRemove"));
	}
	
	@Test(enabled = true , groups = {"Favourite"})
	public void favouiteCardMenuClose() throws IOException
	{
		favouriteSetup();
		contact.menu().click();
		contact.c_close().click();

	}

}
