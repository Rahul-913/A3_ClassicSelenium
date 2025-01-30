package basicScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script31_Explicit 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String ExpectedTitle = "Facebook – log in or sign up";
		WebDriverWait ew = new WebDriverWait(driver, 10);
		
		ew.until(ExpectedConditions.titleContains(ExpectedTitle));
		String title = driver.getTitle();
		System.out.println(title);
		
		
		ew.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		WebElement usn = driver.findElement(By.id("email"));
		ew.until(ExpectedConditions.visibilityOf(usn));
		usn.sendKeys("admin");
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
	
		
		
		
		
		
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
