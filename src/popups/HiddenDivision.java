package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement DATE = driver.findElement(By.id("onwardCal"));
		DATE.click();
		Thread.sleep(2000);
		WebElement d1 = driver.findElement(By.xpath("//span[.='25']"));
		d1.click();
	
	}

}
