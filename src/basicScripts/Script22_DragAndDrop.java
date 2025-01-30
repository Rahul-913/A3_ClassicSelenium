package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script22_DragAndDrop {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		WebElement Src = driver.findElement(By.id("box3"));
//		WebElement Dst = driver.findElement(By.id("box103"));
//		WebElement Src1 = driver.findElement(By.id("box7"));
//		WebElement Dst1 = driver.findElement(By.id("box107"));
//		Thread.sleep(2000); 
//		Actions a = new Actions(driver);
//		a.dragAndDrop(Src, Dst).perform();
//		Thread.sleep(2000);
//		a.dragAndDrop(Src1, Dst1).perform();
		
		
		
		
		
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement btn = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
//		Thread.sleep(2000);
//		Actions a = new Actions(driver);
//		a.doubleClick(btn).perform();
//		
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement btn1 = driver.findElement(By.xpath("//span[.='right click me']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.contextClick(btn1).perform();
		
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.quit();
	}
}





