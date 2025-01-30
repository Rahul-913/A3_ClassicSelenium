package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05_URLandTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.flipkart.com");
		String src = driver.getPageSource();
		System.out.println(src);
		Thread.sleep(2000);
//		driver.quit();
		driver.close();
		
		
		
	}

}
