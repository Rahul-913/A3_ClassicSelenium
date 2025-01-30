package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement btn = driver.findElement(By.id("browNotButton"));
		btn.click();
		System.out.println("Clicked on Button");
	
	
	}

}
