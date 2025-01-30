package testNG_Basic_Framework;

import org.testng.annotations.Test;

public class TC02 extends GenericScript
{
	@Test
	public void CurrentUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
