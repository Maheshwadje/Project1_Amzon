package ecommerce.Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case4 
{
	public void Edit_user_profile()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Amazon_Login_Page login = new Amazon_Login_Page(driver);
	login.signinclickhome();
	
	}

}
