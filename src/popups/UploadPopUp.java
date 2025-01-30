package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopUp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSPR/Desktop/A3_Automation/Upload.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement btn = driver.findElement(By.id("f1"));
		btn.sendKeys("C:\\Users\\QSPR\\Desktop\\selenium-server-4.15.0.jar");
	
	
	
	}

}
