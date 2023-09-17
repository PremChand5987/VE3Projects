package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common_methods.common_Methods;
import common_methods.validations;
import freemarker.template.utility.Constants;

public class Contact_Page 
{
	
	public static final By ContactTab =By.xpath("//span[text()='Contact']");
	public static final By tittleheader =By.xpath("//h2[text()='We Are Here To Help You']");
	public static final By Contactfrom=By.xpath("//h2[text()='Give Us a Shout']");
	public static final By nameFiled=By.xpath("//input[contains(@id,'forminator-field-name')]");
	public static final By emailFiled=By.xpath("//input[contains(@id,'forminator-field-email')]");
	public static final By SubjectFiled=By.xpath("//input[contains(@placeholder,'Subject')]");
	public static final By MessageFiled=By.xpath("//textarea[contains(@placeholder,'message')]");
	public static final By SentButton =By.xpath("//span[text()='Send']");
	public static final By Errormsg=By.xpath("//span[@class='forminator-error-message']");
	public static final By Submitting=By.xpath("//*[contains(@class,'loading')]");
	public static final By ConformMsg=By.xpath("//*[text()='Thank you for contacting us, we will be in touch shortly.']");
	//web Elements
	static WebElement ContactTabElement() {
    	return Basepage.getDriver().findElement(ContactTab);
	}
	
	static WebElement tittleHeaderElement() {
    	return Basepage.getDriver().findElement(tittleheader);
	}
    
	static WebElement ContactfromElement() {
    	return Basepage.getDriver().findElement(Contactfrom);
	}
    
	static WebElement nameFiledElement() {
    	return Basepage.getDriver().findElement(nameFiled);
	}
	
	static WebElement emailFiledElement() {
    	return Basepage.getDriver().findElement(emailFiled);
	}
    
	static WebElement SubmittingElement() {
    	return Basepage.getDriver().findElement(Submitting);
	}
	
	static WebElement ConformMsgElement() {
    	return Basepage.getDriver().findElement(ConformMsg);
	}
    
	
	static WebElement SubjectFiledElement() {
    	return Basepage.getDriver().findElement(SubjectFiled);
	}
	
	static WebElement MessageFiledElement() {
    	return Basepage.getDriver().findElement(MessageFiled);
	}
	
	static WebElement SentButtonElement() {
    	return Basepage.getDriver().findElement(SentButton);
	}
	
	static WebElement ErrormsgElement() {
    	return Basepage.getDriver().findElement(Errormsg);
	}
    
	
	
	
	
    //actions	
	public static void ClickOnContactTab() throws Exception 
	{
		ContactTabElement().click();	
	}
	public static boolean IspageDisplayed()
	{
		boolean flag=tittleHeaderElement().isDisplayed();
		return flag;
	}
	
	public static void MoveToContactFrom()
	{
		common_Methods.MoveToEle(ContactfromElement());
	}
	
	public static void ContactFromIsDisplayed()
	{
		nameFiledElement().isDisplayed();
		emailFiledElement().isDisplayed();
		SubjectFiledElement().isDisplayed();
		MessageFiledElement().isDisplayed();
		
	}
	public static void Entername(String name )
	{
		nameFiledElement().clear();
		nameFiledElement().sendKeys(name);
		
	}
	public static void EnterEmail(String email)
	{
		emailFiledElement().clear();
		emailFiledElement().sendKeys(email);
	}
	public static void EnterSubject(String subject)
	{
		SubjectFiledElement().clear();
		SubjectFiledElement().sendKeys(subject);
	}
	public static void Entermessage(String message)
	{
		MessageFiledElement().clear();
		MessageFiledElement().sendKeys(message);
	}
	
	public static void ClickSentButton() throws Exception 
	{
		SentButtonElement().click();	
	}
	
	public static boolean SubmittingElementIsDisplayed() throws Exception 
	{
		boolean flag=SubmittingElement().isDisplayed();	
		return flag;
	}
	public static boolean ConformMsgElementIsDispalyed() throws Exception 
	{
		boolean flag=ConformMsgElement().isDisplayed();	
		return flag;
	}
	

	public static boolean GetErrorMsg() {
		return ErrormsgElement().isDisplayed();
	}
}
