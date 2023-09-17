package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Basepage 
{	
	public static WebDriver driver;
	public static ExtentTest log;
	
    
	public static ExtentSparkReporter esp;
    public static ExtentReports er;
    public static ExtentTest et;
    public static ExtentTest ets;
	//To instantiate driver
	public static void  driverIn() throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(constants.HomePageUrl);
		//Thread.sleep(3000);
		driver.manage().window().maximize();		
	}
	
	public static void LaunchExtentReports() throws IOException, Exception
	{
		esp=new ExtentSparkReporter("ExtentReports.html");
		er=new ExtentReports();
        er.attachReporter(esp);
        log =er.createTest("Log"); 
       
	}
	
	//to get driver
	public static WebDriver getDriver() 
	{	
		return driver;
	}

	
	// To quit the browser
	public static void 	quit() 
	{
		driver.quit();
	}
	
	
	public static void pageRefresh() throws InterruptedException 
	{
		driver.navigate().refresh();
		Thread.sleep(6000);
		
	} 

	
}
