package Tests;





import org.testng.asserts.*;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;


import common_methods.common_Methods;
import common_methods.validations;
import pages.Basepage;
import pages.Homepage;
import pages.constants;

import pages.Contact_Page;

public class Base_tests {

	
	@BeforeSuite
	public static void beforeSuite() throws Exception
	{
		Basepage.LaunchExtentReports();
		Basepage.log.info("Driver started");
		Basepage.driverIn();
		Basepage.log.info("Chrome finished");
	}
	
	@AfterSuite
	public static void afterSuite()
	{
		
		Basepage.er.flush();
		Basepage.log.info("quit driver started");
		Basepage.quit();
		Basepage.log.info("Driver quited finished");
		Basepage.er.flush();

	}
	
	@BeforeMethod
	public static void beforeMethod(Method m) throws Exception
	{
		Basepage.ets = Basepage.et.createNode(m.getName());
		Basepage.log.info("Homepage started");
	}
	
	
	@BeforeClass
	public  void beforeclass() {
		
		Basepage.et = Basepage.er.createTest(this.getClass().getName());
		
	}
	
}
