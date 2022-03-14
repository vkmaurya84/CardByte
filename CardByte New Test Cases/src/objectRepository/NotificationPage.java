package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.Common;

public class NotificationPage {
	
WebDriver driver;
	
	public NotificationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By notification = By.xpath("//button[@aria-label='show 17 new notifications']");
	By notificationDetails = By.xpath("//div[@class='infinite-scroll-component ']/span[1]/li[1]/div[2]");
	By notificationDelete = By.xpath("//div[@class='infinite-scroll-component ']/span[1]/li[1]/div[3]/button");
	By add = By.xpath("//div[@id='card-preview-action-id']/div[1]/div[2]/div[1]/span");
	By block = By.xpath("//div[@id='card-preview-action-id']/div[2]/div[1]/div[1]/span");
	By report = By.xpath("//div[@id='card-preview-action-id']/div[2]/div[2]/div[1]/span");
	By dismiss = By.xpath("//div[@id='card-preview-action-id']/div[3]/button");
	By close = By.xpath("//div[@id='share_card_notification']/div[1]/div[2]/button");
	
	
	
	
	public WebElement notificationList()
	{
		Common.explicitWait(notification);
		return driver.findElement(notification);
	}
	
	public WebElement notificationDetailsList()
	{
		Common.explicitWait(notificationDetails);
		return driver.findElement(notificationDetails);
	}
	
	public WebElement notificationDeletion()
	{
		Common.explicitWait(notificationDelete);
		return driver.findElement(notificationDelete);
	}
	
	public WebElement addCard()
	{
		Common.explicitWait(add);
		return driver.findElement(add);
	}

	public WebElement blockCard()
	{
		Common.explicitWait(block);
		return driver.findElement(block);
	}
	
	public WebElement dismissCard()
	{
		Common.explicitWait(dismiss);
		return driver.findElement(dismiss);
	}
	
	public WebElement closeCard()
	{
		Common.explicitWait(close);
		return driver.findElement(close);
	}

}
