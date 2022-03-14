package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.Common;

public class MyCardsPage {
	
WebDriver driver;
	
	public MyCardsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By myCards = By.xpath("//a[@href='/mycards']");
	By shareCard = By.xpath("//div[@class='myCard-container']/div[2]//button");
	By edit = By.xpath("//span[text()='Edit card']");
	By view = By.xpath("//span[text()='View card']");
	By delete = By.xpath("//span[text()='Delete card']");
	By cardTheme1 = By.xpath("//div[@id='1']/div");
	By cardTheme2 = By.xpath("//div[@id='2']/div");
	
	By nextButton = By.xpath("//span[contains(text(),'Next')]");
	By looksGoodButton = By.xpath("//span[contains(text(),'Looks Good!')]");
	By close = By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]");
	
	
	By newCard = By.xpath("//div[@class='addCards']");
	By closeBtn = By.xpath("//body/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/button[1]");
	
	By prefix = By.xpath("//div[contains(text(),'Prefix')]");
	By prefixData = By.cssSelector("#react-select-3-option-3");
	
	By fName = By.name("firstName");
	By lName = By.name("lastName");
	
	By business = By.xpath("//div/div[text()='Business name*']");
	By businessData = By.cssSelector("#react-select-4-option-5");
	
	By designation = By.xpath("//div/div[text()='Designation*']");
	By designationData = By.cssSelector("#react-select-5-option-2");
	
	By address = By.name("addressLine1");
	By pin = By.name("pincode");
	By mobile = By.name("mobileNumber");
	By email = By.name("email");
	By facebook = By.name("facebook");
	
	By industry = By.xpath("//div/div[text()='Industry*']");
	By industryData = By.cssSelector("#react-select-7-option-1");
	
	By cardUpdateMsg = By.xpath("//div[contains(text(),'Card updated successfully')]");
	By viewCard = By.xpath("//h2[contains(text(),'My Cards')]");
	By deleteCardMsg = By.xpath("//div[contains(text(),'Card deleted successfully')]");
	By cardCreatedMsg = By.xpath("//div[contains(text(),'Card created successfully')]");
	
	
	
	public WebElement createCardMsg()
	{
		Common.explicitWait(cardCreatedMsg);
		return driver.findElement(cardCreatedMsg);
	}
	
	public WebElement deleteCardMsg()
	{
		Common.explicitWait(deleteCardMsg);
		return driver.findElement(deleteCardMsg);
	}
	
	public WebElement viewCard()
	{
		Common.explicitWait(viewCard);
		return driver.findElement(viewCard);
	}
	
	public WebElement cardUpdateMsg()
	{
		Common.explicitWait(cardUpdateMsg);
		return driver.findElement(cardUpdateMsg);
	}
	
	public WebElement cardsPage()
	{
		Common.explicitWait(myCards);
		return driver.findElement(myCards);
	}
	
	public WebElement share()
	{
		Common.explicitWait(shareCard);
		return driver.findElement(shareCard);
	}
	
	public WebElement editBtn()
	{
		Common.explicitWait(edit);
		return driver.findElements(edit).get(0);
	}
	
	public WebElement theme1()
	{
		Common.explicitWait(cardTheme1);
		return driver.findElement(cardTheme1);
	}
	public WebElement theme2()
	{
		Common.explicitWait(cardTheme2);
		return driver.findElement(cardTheme2);
	}
	
	public WebElement nextBtn()
	{
		Common.explicitWait(nextButton);
		return driver.findElement(nextButton);
	}
	
	public WebElement goodBtn()
	{
		Common.explicitWait(looksGoodButton);
		return driver.findElement(looksGoodButton);
	}
	
	public WebElement viewPage()
	{
		Common.explicitWait(view);
		return driver.findElements(view).get(0);
	}
	
	public WebElement closeBtn()
	{
		Common.explicitWait(close);
		return driver.findElement(close);
	}
	
	public WebElement delete()
	{
		Common.explicitWait(delete);
		return driver.findElements(delete).get(0);
	}
	
//	new card create
	
	public WebElement newCard()
	{
		Common.explicitWait(newCard);
		return driver.findElement(newCard);
	}
	
	public WebElement prefix()
	{
		Common.explicitWait(prefix);
		return driver.findElement(prefix);
	}
	
	public WebElement prefixValue()
	{
		return driver.findElement(prefixData);
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
	
	public WebElement business()
	{
		Common.explicitWait(business);
		return driver.findElement(business);
	}
	
	public WebElement businessValue()
	{
		Common.explicitWait(businessData);
		return driver.findElement(businessData);
	}
	
	public WebElement designation()
	{
		Common.explicitWait(designation);
		return driver.findElement(designation);
	}
	
	public WebElement designationValue()
	{
		Common.explicitWait(designationData);
		return driver.findElement(designationData);
	}
	
	public WebElement address()
	{
		Common.explicitWait(address);
		return driver.findElement(address);
	}
	
	public WebElement pincode()
	{
		Common.explicitWait(pin);
		return driver.findElement(pin);
	}
	
	public WebElement mobileno()
	{
		Common.explicitWait(mobile);
		return driver.findElement(mobile);
	}
	
	public WebElement emailid()
	{
		Common.explicitWait(email);
		return driver.findElement(email);
	}
	
	public WebElement industries()
	{
		Common.explicitWait(industry);
		return driver.findElement(industry);
	}
	
	public WebElement industryValue()
	{
		Common.explicitWait(industryData);
		return driver.findElement(industryData);
	}

}
