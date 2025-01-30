package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement btn = driver.findElement(By.id("buttonAlert1"));
		btn.click();
		Alert popup = driver.switchTo().alert();
	popup.sendKeys("yes");
//	popup.accept();
	String msg = popup.getText();
	System.out.println(msg);
	popup.dismiss();
	
	
	
	}

}
