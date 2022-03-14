package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.Common;

public class FavouritePage {
	
WebDriver driver;
	
	public FavouritePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By favouritePage = By.xpath("//a[@href='/favourite']");
	By favouriteContact = By.xpath("//div[@data-id='1']");
	
	
	public WebElement favouriteList()
	{
		Common.explicitWait(favouritePage);
		return driver.findElement(favouritePage);
	}
	
	public WebElement favouriteCard()
	{
		Common.explicitWait(favouriteContact);
		return driver.findElement(favouriteContact);
	}

}
