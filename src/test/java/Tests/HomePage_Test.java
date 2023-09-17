package Tests;

import static org.testng.Assert.assertTrue;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Basepage;
import pages.Homepage;
import pages.platfromspage;

public class HomePage_Test extends Base_tests {

	
	@Test
	public static void Verify_That_The_Ve3_global_Homepage_loads_successfully() throws Exception
	{
		Basepage.log.info("Navigate to google chrome and Ve3 Url");
		
		Homepage.HomePageURlOpened();
		
		Basepage.log.info("Home page is opened Sucessfully ");
		
		Homepage.HomepageDisplayedSucessfully();
		Basepage.log.info("Navigate to Tab finished");

	}
	
}
