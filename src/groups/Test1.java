package groups;

import org.testng.annotations.Test;

public class Test1 
{
	@Test(groups = {"ITC","E2ETC"})
	public void IntegrationTestcase()
	{
		System.out.println("IntegrationTestcase");
	}
	@Test(groups = "E2ETC")
	public void SystemTestcase()
	{
		System.out.println("SystemTestcase");
	}
}
