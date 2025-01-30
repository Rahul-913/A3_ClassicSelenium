package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10_Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/A3_Automation/Test.html");
		WebElement usn = driver.findElement(By.tagName("input"));
		usn.sendKeys("admin");
		Thread.sleep(2000);
		WebElement box = driver.findElement(By.id("cb"));
		box.click();
		Thread.sleep(2000);
		WebElement rb = driver.findElement(By.name("rad"));
		rb.click();
		Thread.sleep(2000);
		WebElement lnk = driver.findElement(By.className("link"));
		lnk.click();
		Thread.sleep(4000);
		driver.quit();
	}
}
