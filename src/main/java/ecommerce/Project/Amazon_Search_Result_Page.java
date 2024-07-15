package ecommerce.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Search_Result_Page 
{
WebDriver driver;
	
	@FindBy(linkText="Men's Running Shoes")
	WebElement Category1;
	
	@FindBy(linkText="Men's Sneakers")
	WebElement Category2;
	
	@FindBy(linkText="Any Department")
	WebElement Return_Search_Page;
	
	public void Category1()
	{
		Category1.click();
	}
	public void Category2()
	{
		Category2.click();
	}
	public void Return_Search_Page_Method()
	{
		Return_Search_Page.click();
	}
	public Amazon_Search_Result_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
