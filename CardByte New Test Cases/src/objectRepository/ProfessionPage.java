package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Common;

public class ProfessionPage {
	
WebDriver driver;
	
	public ProfessionPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By professionPage = By.xpath("//a[@href='/professions']");
	By profession = By.xpath("//div[@id='professionO']/div[2]");
	By professionCard = By.xpath("//div[@data-id='1']");
	
	public WebElement professionList()
	{
		Common.explicitWait(professionPage);
		return driver.findElement(professionPage);
	}
	
	public WebElement professionCardList()
	{
		Common.explicitWait(profession);
		return driver.findElement(profession);
	}
	
	public WebElement professionCardPreview()
	{
		Common.explicitWait(professionCard);
		return driver.findElement(professionCard);
	}

}
