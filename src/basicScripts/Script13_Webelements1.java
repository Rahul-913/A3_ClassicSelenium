package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13_Webelements1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/A3_Automation/checkbox.html");	
		WebElement cb = driver.findElement(By.xpath("//input[1]"));
		if (cb.isDisplayed())
		{
				if(cb.isEnabled())
				{
					if(cb.isSelected())
					{
						System.out.println("It is Selected");
					}
					else 
					{
						System.out.println("It is not selected");
						cb.click();
					}
				}
				else {
				System.out.println("It is Disabled");	
				}
		} 
		else 
		{
			System.out.println("It is not displayed");
		}
		
		Thread.sleep(2000);
//		driver.quit();
	}
}





