
package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common_methods.common_Methods;
import common_methods.validations;

public class platfromspage {

	 static final By PlatformsBy=By.xpath("//span[text()='Platforms']");
	 static final By OracleBtnBy=By.xpath("//a[text()='Oracle']");
	 static final By oracleheader=By.xpath("//h2[text()='Oracle ']");
	 

	
	//web Element

	 static WebElement PlatformsTab() {

		return Basepage.getDriver().findElement(PlatformsBy);

	}
	static WebElement OracleBtnTab() {

		return Basepage.getDriver().findElement(OracleBtnBy);
	}

	static WebElement oracleheaderele() {

		return Basepage.getDriver().findElement(oracleheader);
	}

	


	//Action
	public static void ClickPlatformsTab() throws Exception
	{
		Thread.sleep(5000);
		PlatformsTab().click();
		Thread.sleep(3000);
	}
	public static void  ClickOracleBtn() throws Exception {
		PlatformsTab().click();
		Thread.sleep(5000);
	}

	public static void OracleheaderisDisplayed()
	{
		oracleheaderele().isDisplayed();
	}


	
	
}