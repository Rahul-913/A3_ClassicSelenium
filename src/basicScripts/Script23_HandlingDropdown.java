package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script23_HandlingDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/A3_Automation/DropDown.html");
		WebElement dd = driver.findElement(By.xpath("//Select[@id='Celebrities']"));
		Select s = new Select(dd);
		List<WebElement> opts = s.getOptions();
		int count = opts.size();
		System.out.println(count);
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<count;i++)
		{
			WebElement opt = opts.get(i);
			String val = opt.getText();
			al.add(val);
		}
		Collections.sort(al,Collections.reverseOrder());
		for(String a:al)
		{
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if(s.isMultiple())
		{
			s.selectByValue("j");
			Thread.sleep(1000);
			s.selectByVisibleText("Yash");
			Thread.sleep(1000);
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.deselectAll();
		}
		else 
		{
			System.out.println("It is single select Dropdown");
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
