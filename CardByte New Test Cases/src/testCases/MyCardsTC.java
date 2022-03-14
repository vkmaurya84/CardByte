package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Common;
import objectRepository.ContactPage;
import objectRepository.MyCardsPage;


public class MyCardsTC {
	
	@BeforeMethod
	public void Browser() throws IOException
	{
		Common.browserSetup();
		Common.login();
		cards = new MyCardsPage(Common.driver);
		toastMsg();
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
	
	MyCardsPage cards;
	@Test(enabled = true , groups = {"MyCards"})
	public void myCard() throws IOException
	{
		
		cards.cardsPage().click();
//		cards.share().click();
		cards.editBtn().click();
		cards.nextBtn().click();
		cards.theme2().click();
		cards.theme1().click();
		cards.nextBtn().click();
		cards.goodBtn().click();
		Assert.assertEquals(cards.cardUpdateMsg().getText(), Common.message.getProperty("updateCardMsg"));
		
	}
	
	@Test(enabled = true , groups = {"MyCards"})
	public void viewCard() throws IOException
	{

		cards.cardsPage().click();
		cards.viewPage().click();
		cards.closeBtn().click();
		Assert.assertEquals(cards.viewCard().getText(), Common.message.getProperty("viewCard"));
	}
	
	@Test(enabled = true , groups = {"MyCards"}, dependsOnMethods = { "setupNewCard" })
	public void deleteCard() throws IOException
	{

		cards.cardsPage().click();
		cards.delete().click();
		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		Assert.assertEquals(cards.deleteCardMsg().getText(), Common.message.getProperty("cardDeleteMsg"));
	}
	
	@Test(enabled = true , groups = {"MyCards"})
	public void setupNewCard() throws IOException
	{

		cards.cardsPage().click();
		cards.newCard().click();
		cards.prefix().click();
		cards.prefixValue().click();
		cards.firstName().clear();
		cards.firstName().sendKeys(Common.userData.getProperty("firstName"));
		cards.lastName().clear();
		cards.lastName().sendKeys(Common.userData.getProperty("lastName"));
		cards.business().click();
		cards.businessValue().click();
		cards.designation().click();
		cards.designationValue().click();
		cards.address().sendKeys(Common.userData.getProperty("address"));
		cards.pincode().sendKeys(Common.userData.getProperty("pincode"));
		cards.mobileno().sendKeys(Common.userData.getProperty("mobile"));
		cards.emailid().clear();
		cards.emailid().sendKeys(Common.userData.getProperty("email"));
		cards.industries().click();
		cards.industryValue().click();
		cards.nextBtn().click();
		cards.theme1().click();
		cards.theme2().click();
		cards.theme1().click();
		cards.nextBtn().click();
		cards.goodBtn().click();
		Assert.assertEquals(cards.createCardMsg().getText(), Common.message.getProperty("cardCreateMsg"));
	}

}
