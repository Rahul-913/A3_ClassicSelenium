package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script27_DisabledElement2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/A3_Automation/Disabled.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('value','Admin')",ele);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('value','')",ele);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Superadmin'",ele);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
