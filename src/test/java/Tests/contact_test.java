package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Basepage;
import pages.Contact_Page;
import pages.Homepage;
import pages.constants;


public class contact_test extends Base_tests {


	@Test(priority=1)
	public  void Test_The_ContactFormByFillingItOutAndSubmittingItSuccessfully() throws Exception
	{
		Basepage.log.info("Navigate to google chrome and Ve3 Url");
		Homepage.HomePageURlOpened();

		Basepage.log.info("Home page is opened Sucessfully ");
		Homepage.HomepageDisplayedSucessfully();

		Basepage.log.info("Click on Contact Tab");
		Contact_Page.ClickOnContactTab();

		Basepage.log.info("Contact Page Is Opened Succesfully");
		Assert.assertTrue(Contact_Page.IspageDisplayed(),"Contact Page Is NotOpened Succesfully");

		Basepage.log.info("MoveToContactFrom");
		Contact_Page.MoveToContactFrom();
		
		Basepage.log.info("Contact From Is Displayed");
		Contact_Page.ContactFromIsDisplayed();
		
		Basepage.log.info("Entername");
		Contact_Page.Entername(constants.name);
		
		Basepage.log.info("Enter email");
		Contact_Page.EnterEmail(constants.emailid);
		
		Basepage.log.info("EnterSubject");
		Contact_Page.EnterSubject(constants.Subject);
		
		Basepage.log.info("Entermessage");
		Contact_Page.Entermessage(constants.message);
		
		Basepage.log.info("ClickSentButton");
		Contact_Page.ClickSentButton();
		
		Basepage.log.info("SubmittingElementIsDisplayed");
		Assert.assertTrue(Contact_Page.SubmittingElementIsDisplayed(),"Submitting alert is not Displayed");
		
		Basepage.log.info("ConformMsgElementIsDispalyed");
		Assert.assertTrue(Contact_Page.ConformMsgElementIsDispalyed(),"The conformation Message Is Not displayed");
		
		

	}
	@Test(priority=2)
	public  void AttemptToSubmitTheContactFormWithInvalidDataAndVerifyTheErrorMessages() throws Exception
	{
		Basepage.log.info("Navigate to google chrome and Ve3 Url");
		Homepage.HomePageURlOpened();

		Basepage.log.info("Home page is opened Sucessfully ");
		Homepage.HomepageDisplayedSucessfully();

		Basepage.log.info("Click on Contact Tab");
		Contact_Page.ClickOnContactTab();

		Basepage.log.info("Contact Page Is Opened Succesfully");
		Assert.assertTrue(Contact_Page.IspageDisplayed(),"Contact Page Is NotOpened Succesfully");

		Basepage.log.info("MoveToContactFrom");
		Contact_Page.MoveToContactFrom();
		
		Basepage.log.info("Contact From Is Displayed");
		Contact_Page.ContactFromIsDisplayed();
		
		Basepage.log.info("Entername");
		Contact_Page.Entername(constants.name);
		
		Basepage.log.info("Enter email");
		Contact_Page.EnterEmail(constants.InvalidEmail);
		
		Basepage.log.info("EnterSubject");
		Contact_Page.EnterSubject(constants.Subject);
		
		Basepage.log.info("Entermessage");
		Contact_Page.Entermessage(constants.message);
		
		Basepage.log.info("ClickSentButton");
		Contact_Page.ClickSentButton();
		
		Basepage.log.info("SubmittingElementIs Not Displayed");
		Assert.assertFalse(Contact_Page.SubmittingElementIsDisplayed(),"Submitting alert is not Displayed");
		
		Basepage.log.info("ConformMsgElementIs Not Dispalyed");
		Assert.assertFalse(Contact_Page.ConformMsgElementIsDispalyed(),"The conformation Message Is Not displayed");
		
		Basepage.log.info("Error test is Displayed");
		Assert.assertTrue(Contact_Page.GetErrorMsg(),"the Error msg was not displayed");
		
		

	}


}
