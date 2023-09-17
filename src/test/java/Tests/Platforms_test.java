package Tests;

import org.testng.annotations.Test;

import pages.platfromspage;

public class Platforms_test extends Base_tests{

	@Test
	public  void verify_Validate_Sort_On_Length_Librarypage() throws Exception
	{
		platfromspage.ClickPlatformsTab();
		platfromspage.ClickOracleBtn();
		platfromspage.OracleheaderisDisplayed();
			
	}
	
	
	
}
