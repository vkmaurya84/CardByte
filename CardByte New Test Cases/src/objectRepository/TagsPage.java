package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Common;

public class TagsPage {
	
WebDriver driver;
	
	public TagsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By tagsPage = By.xpath("//a[@href='/tags']");
	
	By edit = By.xpath("//div[@id='tagsA']/div[2]//span[@class='update-delete-tag']/button[1]");
	By tagname = By.name("firstName");
	By close = By.xpath("//span[contains(text(),'Close')]");
	By update = By.xpath("//span[contains(text(),'Update')]");
	By delete = By.xpath("//div[@id='tagsD']/div[2]//span[@class='update-delete-tag']/button[2]");
	By tagDelete = By.xpath("//span[contains(text(),'Delete')]");
	
	By tagsContact = By.xpath("//div[@id='tagsA']/div[2]/div/span/button");
	By tagsCard = By.xpath("//div[@data-id='1']");
	
	By tagUpdateMsg = By.xpath("//div[contains(text(),'Tag updated successfully')]"); 
	By tagDeleteMsg = By.xpath("//div[contains(text(),'Tag deleted successfully')]");
	
	
	
	public WebElement tagDeleteMsg()
	{
		Common.explicitWait(tagDeleteMsg);
		return driver.findElement(tagDeleteMsg);
	}
	
	public WebElement tagUpdateMsg()
	{
		Common.explicitWait(tagUpdateMsg);
		return driver.findElement(tagUpdateMsg);
	}
	
	public WebElement tagList()
	{
		Common.explicitWait(tagsPage);
		return driver.findElement(tagsPage);
	}
	
	public WebElement tagEditBtn()
	{
		Common.explicitWait(edit);
		return driver.findElement(edit);
	}
	
	public WebElement tagUpdate()
	{
		Common.explicitWait(tagname);
		return driver.findElement(tagname);
	}
	
	public WebElement tagUpdateDeleteReject()
	{
		Common.explicitWait(close);
		return driver.findElement(close);
	}
	
	public WebElement tagUpdateAccept()
	{
		Common.explicitWait(update);
		return driver.findElement(update);
	}
	
	public WebElement tagDelete()
	{
		Common.explicitWait(delete);
		return driver.findElement(delete);
	}
	
	public WebElement tagDeleteAccept()
	{
		Common.explicitWait(tagDelete);
		return driver.findElement(tagDelete);
	}
	
	public WebElement tagContact()
	{
		Common.explicitWait(tagsContact);
		return driver.findElement(tagsContact);
	}
	
	public WebElement tagCardPreview()
	{
		Common.explicitWait(tagsCard);
		return driver.findElement(tagsCard);
	}

}
