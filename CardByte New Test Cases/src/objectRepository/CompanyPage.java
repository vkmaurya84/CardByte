package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import common.Common;

public class CompanyPage {
	
WebDriver driver;
	
	public CompanyPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By companyPage = By.xpath("//a[@href='/companies']");
	By company = By.xpath("//div[@id='companyL']/div[2]");
	By companyCard = By.xpath("//div[@data-id='1']");
	
	
	public WebElement companyList()
	{
		Common.explicitWait(companyPage);
		return driver.findElement(companyPage);
	}
	
	public WebElement companyCard()
	{
		Common.explicitWait(company);
		return driver.findElement(company);
	}
	
	public WebElement companyCardPreview()
	{
		Common.explicitWait(companyCard);
		return driver.findElement(companyCard);
	}

}
