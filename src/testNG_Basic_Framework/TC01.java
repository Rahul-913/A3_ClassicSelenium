package testNG_Basic_Framework;

import org.testng.annotations.Test;

public class TC01 extends GenericScript
{
	@Test
	public void Title()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

}
