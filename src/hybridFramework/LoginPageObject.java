package hybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject
{
	//Declaration
	@FindBy(id="email")
	private WebElement usn;
	
	@FindBy(id="pass")
	private WebElement psw;
	
	@FindBy(name="login")
	private WebElement login;
	
	//Initialization
	public LoginPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void EnterUsn()
	{
		usn.sendKeys("admin");
	}
	public void EnterPsw()
	{
		psw.sendKeys("admin@123");
	}
	
	public void ClickLogin()
	{
		login.click();
	}
	
	
	
	
	
	
	

}
