package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script15_GetText {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
//		WebElement lgnbtn = driver.findElement(By.name("login"));
		WebElement lgnbtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		String eletext = lgnbtn.getText();
		System.out.println(eletext);
		
		WebElement link = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		String txt = link.getText();
		System.out.println(txt);
		
//		Thread.sleep(2000);
//		driver.quit();
	}
}





