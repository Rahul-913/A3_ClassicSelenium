package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script18_ResizeBrowser {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int eles = links.size();//300->list-0-299
		System.out.println(eles);
		for(int i=0;i<eles;i++)
		{
			WebElement link = links.get(i);//0-1-2----299
			String txt = link.getText();
			System.out.println(txt);
		}
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}





