package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.Common;

public class SearchPage {
WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By searchFrom = By.xpath("//div[@id='mui-component-select-search']");
	By data = By.xpath("//li[@data-value='GLOBAL']");
	By searchBar = By.xpath("//input[@aria-label='search user']");
	By searchBtn = By.xpath("//button[@aria-label='search']");
	By contact = By.xpath("//div[@aria-label='global-search']/button[1]");
	By global = By.xpath("//div[@aria-label='global-search']/button[2]");
	By addCard = By.id("0");
	By update = By.xpath("//span[contains(text(),'Add')]");
	
	By company = By.xpath("//li[@data-value='COMPANY']");
	By companySelect = By.xpath("//div[@id='companyL']/div[3]/div[1]");
	By companyUpdate = By.xpath("//span[contains(text(),'Add')]");
	
	By cardSaveMsg = By.xpath("//div[contains(text(),'Card saved successfully')]");
	
	
	public WebElement cardSaveMsg()
	{
		Common.explicitWait(cardSaveMsg);
		return driver.findElement(cardSaveMsg);
	}
	
	public WebElement searchHome()
	{
		Common.explicitWait(searchFrom);
		return driver.findElement(searchFrom);
	}
	
	public WebElement searchSelect()
	{
		Common.explicitWait(data);
		return driver.findElement(data);
	}
	
	public WebElement searchData()
	{
		Common.explicitWait(searchBar);
		return driver.findElement(searchBar);
	}
	
	public WebElement contactCategory()
	{
		Common.explicitWait(contact);
		return driver.findElement(contact);
	}
	
	public WebElement globalCategory()
	{
		Common.explicitWait(global);
		return driver.findElement(global);
	}
	
	public WebElement addCard()
	{
		Common.explicitWait(addCard);
		return driver.findElement(addCard);
	}
	
	public WebElement addCardAfterTags()
	{
		Common.explicitWait(update);
		return driver.findElement(update);
	}
	
	public WebElement companySearch()
	{
		Common.explicitWait(company);
		return driver.findElement(company);
	}
	
	public WebElement companySelect()
	{
		Common.explicitWait(companySelect);
		return driver.findElement(companySelect);
	}
	
	public WebElement companySearchedCardAdd()
	{
		Common.explicitWait(companyUpdate);
		return driver.findElement(companyUpdate);
	}

}
