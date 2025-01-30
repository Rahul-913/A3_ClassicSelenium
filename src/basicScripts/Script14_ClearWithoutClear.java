package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14_ClearWithoutClear {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/A3_Automation/DummyPage.html");	
		WebElement usn = driver.findElement(By.xpath("//input[@value='admin']"));
		Thread.sleep(2000);
		usn.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		usn.sendKeys(Keys.DELETE);
		
		
//		
//		Thread.sleep(2000);
//		driver.quit();
	}
}





