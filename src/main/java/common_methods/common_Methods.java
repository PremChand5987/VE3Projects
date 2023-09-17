package common_methods;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pages.Basepage;



public class common_Methods {
	
	public static WebDriver driver = Basepage.getDriver();

	// Method to perform click
	public void Click(WebElement element) {
		if (element.isDisplayed() && element.isEnabled()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", element);
			element.click();
		}
	}
	
	public static void MoveToEle(WebElement element) {
		Actions ACT=new Actions(driver);
		ACT.moveToElement(element).build().perform();
	}
	//Method to enter text	
	public void EnterInfo(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		element.clear();
		element.sendKeys(value);
	}
	
	//Method to Select Checkbox
	public void SelectCheckbox(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		if(!element.isSelected())
			element.click();
	}
	
	//Method to Select Dropdown option
	public void SelectOption(WebElement element,String option, String By) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Select s = new Select(element);
		if(By.equals("value")) {
			s.selectByValue(option);
		}else if(By.equals("visibleText")) {
			s.selectByVisibleText(option);
		}else if(By.equals("index")) {
			s.selectByIndex(Integer.parseInt(option));
		}		
	}
	
	//Method to perform double click
	public void DoubleClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}
	
	//Method to perform right click
	public void RightClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}
	
	//Method to perform drag and drop
	public void DragAndDrop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source,target).build().perform();
	}

	//Method to implicit wait
	
	
	public void ImplicitWait() {
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
			
	}

	//Method to get title of the Page
	public String getTitle() {
		return driver.getTitle();
	}
	
	// Method to click on alert button
	public void ClickOnAlert(String option) {
		Alert alert = driver.switchTo().alert();
		if (option.equals("ok"))
			alert.accept();
		else if (option.equals("cancel"))
			alert.dismiss();
	}
	
	
	
	// To get currentUrl
	public static String CurrentUrl() {
		//System.out.println(Basepage.getDriver().getCurrentUrl());
		return Basepage.getDriver().getCurrentUrl();
	}
	
	// select from drop down
	public static void selectDropDown(WebElement element,String visibleText)
	{
		Select s=new Select(element);
		s.selectByVisibleText(visibleText);
		
	}
	
	public static void refresh_page() throws Exception {
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	}


	// To close current browser
	public static void 	close() {
		driver.close();
	}
	
	
	public static String clickSearchMenuAndTypeOption(String Xpath,String option)
	{

		return String.format(Xpath,option);
	}
	
	
	public static String getText(WebElement element) throws InterruptedException {
		Thread.sleep(3000);
		return element.getAttribute("value");
		
	}
	public static void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

		
		
		
		
	

}
