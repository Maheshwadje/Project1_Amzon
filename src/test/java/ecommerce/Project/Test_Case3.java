package ecommerce.Project;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Case3 
{
	@Test
	public void login_to_Amazon_inValid_Cred()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Amazon_Login_Page login = new Amazon_Login_Page(driver);
	login.signinclickhome();
	login.invalidun();
	login.Continue_button_Method();
	Assert.assertEquals(driver.getTitle(), "Amazon Sign In", "invalid mobile number");
	Reporter.log("login with invalid mobile number");
	}

}
