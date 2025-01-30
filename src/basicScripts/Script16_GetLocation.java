package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script16_GetLocation {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		WebElement lgnbtn = driver.findElement(By.name("login"));
		Point loc = lgnbtn.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x);
		System.out.println(y);
		WebElement link = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Point loc1 = link.getLocation();
		System.out.println(loc1);
		Thread.sleep(2000);
		driver.quit();
	}
}





