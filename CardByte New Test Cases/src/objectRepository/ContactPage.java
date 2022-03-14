package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.Common;

public class ContactPage {
	
WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By toastMsg = By.className("Toastify__close-button");

	By contactList = By.xpath("//a[@href='/contacts']");
	By contact = By.xpath("//div[@data-id='1']");
	By mailIcon = By.xpath("//img[@alt='Mail icon']");
	By mapIcon = By.xpath("//img[@alt='Navigatio icon']");
	By block = By.xpath("//button[@aria-label='block']");
	By report = By.xpath("//button[@aria-label='report']");
	By favourite = By.xpath("//button[@aria-label='favourite']");
	By tags = By.xpath("//button[@aria-label='tags']");
	By kababMenu = By.xpath("//button[@aria-label='delete card']");
	By close = By.xpath("//span[contains(text(),'Close')]");
	By remove = By.xpath("//span[contains(text(),'Remove')]");
	By sendMyCard = By.xpath("//span[contains(text(),'Send my card')]");
	
	
	By accept = By.xpath("//span[contains(text(),'Yes')]");
	By reject = By.xpath("//span[contains(text(),'No')]");
	
	By tag1 = By.xpath("//span[contains(text(),'Friend')]");
	By tag2 = By.xpath("//span[contains(text(),'Family')]");
	By tag3 = By.xpath("//span[contains(text(),'Work')]");
	By T_update = By.xpath("//span[contains(text(),'Update')]");
	
	
	By cardShare = By.xpath("//div[@id='send_card_component']/div[2]//button");
	
	By preview = By.xpath("//span[contains(text(),'Card Preview')]");
	By blockMsg = By.xpath("//div[contains(text(),'User Blocked')]");
	By unblockMsg = By.xpath("//div[contains(text(),'User Unblocked')]");
	By favouriteMsg = By.xpath("//div[contains(text(),'User added to Favourites')]");
	By unfavouriteMsg = By.xpath("//div[contains(text(),'User removed from Favourites')]");
	By tagMsg = By.xpath("//div[contains(text(),'Tags Updated')]");
	
	By cardShareMsg = By.xpath("//div[@class='Toastify__toast-body']");
	By cardRemove = By.xpath("//div[contains(text(),'Contact Removed')]");

	
	public WebElement cardRemoveMsg()
	{
		Common.explicitWait(cardRemove);
		return driver.findElement(cardRemove);
	}
	
	public WebElement cardShareMsg()
	{
		Common.explicitWait(cardShareMsg);
		return driver.findElement(cardShareMsg);
	}
	
	public WebElement tagMsg()
	{
		Common.explicitWait(tagMsg);
		return driver.findElement(tagMsg);
	}
	
	public WebElement favouriteMsg()
	{
		Common.explicitWait(favouriteMsg);
		return driver.findElement(favouriteMsg);
	}
	
	public WebElement unfavouriteMsg()
	{
		Common.explicitWait(unfavouriteMsg);
		return driver.findElement(unfavouriteMsg);
	}
	
	public WebElement preview()
	{
		Common.explicitWait(preview);
		return driver.findElement(preview);
	}
	
	public WebElement blockMsg()
	{
		Common.explicitWait(blockMsg);
		return driver.findElement(blockMsg);
	}
	
	public WebElement unblockMsg()
	{
		Common.explicitWait(unblockMsg);
		return driver.findElement(unblockMsg);
	}
	
	public WebElement toast()
	{
		Common.explicitWait(toastMsg);
		return driver.findElement(toastMsg);
	}
	
	public WebElement list()
	{
		Common.explicitWait(contactList);
		return driver.findElement(contactList);
	}
	
	public WebElement contact()
	{
		return driver.findElement(contact);
	}
	
	public WebElement mail()
	{
		return driver.findElements(mailIcon).get(0);
	}
	
	public WebElement map()
	{
		return driver.findElement(mapIcon);
	}
	
	public WebElement C_block()
	{
		return driver.findElement(block);
	}
	
	public WebElement C_block_Accept()
	{
		return driver.findElement(accept);
	}
	
	public WebElement C_block_Reject()
	{
		return driver.findElement(reject);
	}
	
	public WebElement C_report()
	{
		return driver.findElement(report);
	}
	
	public WebElement C_favourite()
	{
		return driver.findElement(favourite);
	}
	
	public WebElement C_tags()
	{
		return driver.findElement(tags);
	}
	
	public WebElement friend_tag()
	{
		return driver.findElement(tag1);
	}
	
	public WebElement family_tag()
	{
		return driver.findElement(tag2);
	}
	
	public WebElement work_tag()
	{
		return driver.findElement(tag3);
	}
	
	public WebElement tagUpdate()
	{
		return driver.findElement(T_update);
	}
	
	public WebElement sendCard()
	{
		return driver.findElement(sendMyCard);
	}
	
	public WebElement shareCard()
	{
		return driver.findElements(cardShare).get(0);
	}
	
	public WebElement menu()
	{
		Common.explicitWait(kababMenu);
		return driver.findElement(kababMenu);
	}
	
	public WebElement c_close()
	{
		return driver.findElement(close);
	}
	
	public WebElement c_remove()
	{
		return driver.findElement(remove);
	}

}
