package hybridFramework;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.testng.annotations.Test;

public class TC01 extends genericScript
{
	@Test
	public void Login()
	{
		LoginPageObject lp = new LoginPageObject(driver);
		System.out.println("Hii"+ Thread.currentThread());
		lp.EnterUsn();
		lp.EnterPsw();
		lp.ClickLogin();
	}

}
