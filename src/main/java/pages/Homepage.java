package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common_methods.common_Methods;

public class Homepage
{
	
	//public static final By AgreeButtonBy = By.xpath("//a[text()='Agree']");
	public static final By NewText=By.xpath("//h1[text()='News']");
	public static final By Profilelogo=By.xpath("//a[contains(@href,'w.ve3.')]//img[contains(@class,'wp-image')]");
	
	
    public static WebElement NewsText() {
		
    	return Basepage.getDriver().findElement(NewText);
	}
    
    public static WebElement ProfilelogoEle() {
		
    	return Basepage.getDriver().findElement(Profilelogo);
	}
    
    
    public static void HomePageURlOpened()
    {
    	Basepage.log.info(" checking thehomre page is opend sucesfully");
    	 Assert.assertTrue(common_Methods.CurrentUrl().contains(constants.HomePageUrl), "Homepage is not opened");
    }
    public static void HomepageDisplayedSucessfully()
    {
        NewsText().isDisplayed();
    	ProfilelogoEle().isDisplayed();
    }

}
