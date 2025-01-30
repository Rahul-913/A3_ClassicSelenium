package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20_UrlOfLinks {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> eles = driver.findElements(By.xpath("//*"));
		for(WebElement ele:eles)
		{
			String tag = ele.getTagName();
			System.out.println(tag);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int count = links.size();
//		for(int i=count-1;i>=0;i--)//count=399,0-398
//		{
//			WebElement link = links.get(i);
//			String url = link.getAttribute("href");
//			System.out.println(url);
//		}
		Thread.sleep(2000);
		driver.quit();
	}
}





