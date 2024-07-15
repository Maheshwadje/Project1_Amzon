package ecommerce.Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Case2 
{
	@Test
	public void login_to_Amazon_Valid_Cred()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Amazon_Login_Page login = new Amazon_Login_Page(driver);
	login.signinclickhome();
	login.un();
	login.Continue_button_Method();
	login.pwd();
	login.Signin();
	
	WebElement username = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Assert.assertEquals(username.getText(),"Hello, Mahesh", "Test_Case2 is failed");
	Reporter.log("Login validated with valid cred");
	}
}
