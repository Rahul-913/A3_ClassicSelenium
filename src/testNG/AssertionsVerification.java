package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsVerification 
{
	@Test
	public void TC01()
	{
		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String ExpectedTitle  ="Facebook – log in or sign up page";
		String ActualTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActualTitle, ExpectedTitle);		
		System.out.println("Verification is Successful");
		driver.quit();
		sa.assertAll();
	}

}
