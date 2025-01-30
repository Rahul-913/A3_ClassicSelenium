package groups;

import org.testng.annotations.Test;

public class Test2 
{
	@Test(groups = "SMTC")
	public void SmokeTestcase()
	{
		System.out.println("SmokeTestcase");
	}
	@Test(groups = "FTC")
	public void FunctionalTestcase()
	{
		System.out.println("FunctionalTestcase");
	}
	@Test(groups = "ITC")
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
