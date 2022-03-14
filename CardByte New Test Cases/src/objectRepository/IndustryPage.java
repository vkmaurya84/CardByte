package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.Common;

public class IndustryPage {
	
WebDriver driver;
	
	public IndustryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By industryPage = By.xpath("//a[@href='/industries']");
	By industry = By.xpath("//div[@id='industryA']/div[2]");
	By industryCard = By.xpath("//div[@data-id='1']");

	
	public WebElement industryList()
	{
		Common.explicitWait(industryPage);
		return driver.findElement(industryPage);
	}
	
	public WebElement industryCardList()
	{
		Common.explicitWait(industry);
		return driver.findElement(industry);
	}
	
	public WebElement industryCardPreview()
	{
		Common.explicitWait(industryCard);
		return driver.findElement(industryCard);
	}

}
