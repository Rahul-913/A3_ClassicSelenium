package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11_CssSelector {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/A3_Automation/Test.html");
		WebElement usn = driver.findElement(By.cssSelector("input[type='text']"));
		usn.sendKeys("admin");
		WebElement box = driver.findElement(By.cssSelector("input[id='cb']"));
		box.click();
		WebElement rb = driver.findElement(By.cssSelector("input[name='rad']"));
		rb.click();
		WebElement lnk = driver.findElement(By.cssSelector("a[href='https://www.amazonprime.com']"));
		lnk.click();		
	}
}





