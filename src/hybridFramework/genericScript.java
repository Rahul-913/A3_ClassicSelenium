package hybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class genericScript 
{
	WebDriver driver;
	@Parameters("Browser")//xml->chrome/firefox
	@BeforeMethod
	public void LaunchApplication(String Browser)
	{
		if(Browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(Browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void CloseApplication()
	{
		driver.quit();
	}
}
