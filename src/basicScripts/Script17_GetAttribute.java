package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script17_GetAttribute {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement Btn = driver.findElement(By.name("login"));
//		int H = Btn.getSize().getHeight();
//		System.out.println(H);
//		int W = Btn.getSize().getWidth();
//		System.out.println(W);
//		Thread.sleep(2000);
//		driver.quit();
	}
}





