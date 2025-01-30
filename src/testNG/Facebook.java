package testNG;

import org.testng.annotations.Test;

public class Facebook 
{
	@Test(enabled = false)
	public void signup()
	{
		System.out.println("signup");
	}
	@Test(invocationCount = 1 )
	public void login()
	{
		System.out.println("login");
	}
	@Test(invocationCount = 1)
	public void homepage()
	{
		System.out.println("homepage");
	}
	@Test(invocationCount = 1)
	public void logout()
	{
		System.out.println("logout");
	}
}
