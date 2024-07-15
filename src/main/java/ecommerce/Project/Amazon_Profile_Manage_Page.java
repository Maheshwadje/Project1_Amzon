package ecommerce.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Profile_Manage_Page 
{
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[1]")
	WebElement Pref_dept;
	
	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[2]")
	WebElement Ht_Wt;
	
	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[3]")
	WebElement Age_grp;
	
	@FindBy(xpath="//button[@class='attribute-action']")
	WebElement Add_Attributes;
	
	public Amazon_Profile_Manage_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
