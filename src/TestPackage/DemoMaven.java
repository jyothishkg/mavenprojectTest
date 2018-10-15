package TestPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoMaven {
	@Test
	public static void test()
	{
		Reporter.log("this is test",true);
	}

}
