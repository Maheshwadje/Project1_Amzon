package ecommerce.Project;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Case6 
{
	@Test
	public void Search_shoes()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Amazon_Home_Page login1 = new Amazon_Home_Page(driver);
	login1.search();
	login1.search_btn_click();
	
	Amazon_Search_Result_Page Result = new Amazon_Search_Result_Page(driver);
	Result.Category1();
	Result.Return_Search_Page_Method();
	Result.Category2();
	}
}
