package ecommerce.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page 
{
	WebDriver driver;
	//search a product
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") 
	WebElement search;
	
	//accounts option click
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") 
	WebElement Account_click;
	
	//click on search button
	@FindBy(id="nav-search-submit-button")
	WebElement search_enter;
	
	public void search() 
	{
		search.sendKeys("shoes");
	}
	public void search_btn_click()
	{
		search_enter.click();
	}
	public void Accounts_Page()
	{
		Account_click.click();;
	}
	public Amazon_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
