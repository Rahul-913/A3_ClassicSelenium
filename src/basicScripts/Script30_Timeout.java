package basicScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script30_Timeout 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("name"));
		ele.sendKeys("adbjsfkshvfs");
		System.out.println("Value is entered");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
