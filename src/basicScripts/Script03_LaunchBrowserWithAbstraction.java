package basicScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script03_LaunchBrowserWithAbstraction 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new ChromeDriver();
	
	}
}
