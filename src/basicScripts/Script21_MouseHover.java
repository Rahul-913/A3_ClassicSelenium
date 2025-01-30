package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script21_MouseHover {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement fashion = driver.findElement(By.xpath("//span[.='Fashion']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(fashion).perform();
		WebElement Login = driver.findElement(By.xpath("//span[.='Login']"));
		Thread.sleep(2000);
		a.moveToElement(Login).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.quit();
	}
}





