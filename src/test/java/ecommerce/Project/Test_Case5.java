package ecommerce.Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Case5 
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
	
	WebElement shoes_text = driver.findElement(By.linkText("Shoes"));
	Assert.assertEquals(shoes_text.getText(), "Shoes", "Test case 5 is failed");
	Reporter.log("Test case 5 passed, searching shoes");
	}

}
