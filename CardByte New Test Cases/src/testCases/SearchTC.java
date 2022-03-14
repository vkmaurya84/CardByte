package testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Common;

import objectRepository.ContactPage;
import objectRepository.SearchPage;

public class SearchTC {
	
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
	
	SearchPage search;
	public void searchSetup() throws IOException
	{

		search = new SearchPage(Common.driver);
		toastMsg();
		search.searchHome().click();
	}
	
	@Test(enabled = true , groups = {"Search"})
	public void globalSearch() throws IOException
	{
		searchSetup();
		search.searchSelect().click();
		search.searchData().sendKeys(Common.userData.getProperty("global"), Keys.ENTER);
		search.globalCategory().click();
		search.addCard().click();
		search.addCardAfterTags().click();
		Assert.assertEquals(search.cardSaveMsg().getText(), Common.message.getProperty("cardSaveMsg"));
	}
	
	@Test(enabled = true , groups = {"Search"})
	public void companySearch() throws IOException
	{
		searchSetup();
		search.companySearch().click();
		search.searchData().sendKeys(Common.userData.getProperty("company") , Keys.ENTER);
		search.companySelect().click();
		search.globalCategory().click();
		search.addCard().click();
		search.companySearchedCardAdd().click();
		Assert.assertEquals(search.cardSaveMsg().getText(), Common.message.getProperty("cardSaveMsg"));
		
	}

}
