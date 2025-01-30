package testNG_Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example1
{
	@Test
	public void Title() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String expectedResult = "Facebook – log in or sign UP";
		String actualResult = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		System.out.println(expectedResult);
		System.out.println(actualResult);
		Thread.sleep(1000);
		driver.quit();
		sa.assertAll();
	}

}
