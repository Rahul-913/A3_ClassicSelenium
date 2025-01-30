package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script26_ScrollAction2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.body.style.zoom='200%'");//zoom in
//		Thread.sleep(2000);
//		
//		js.executeScript("document.body.style.zoom='20%'");//zoom out
		
		
		
		
		
		
		
		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//bottom of page
//		
//		Thread.sleep(2000);
//		
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//top of page
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement ele = driver.findElement(By.xpath("//h3[.='b. Premium Materials']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();",ele);//scroll till particular element
//		
		

		
		
		
		
		
//		js.executeScript("arguments[0].value='abcd'",ele);//pass value 
			//for disabled element
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
