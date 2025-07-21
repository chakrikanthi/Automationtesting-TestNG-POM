package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageslink extends Basepage{

	public Pageslink(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Hidden Elements & AJAX']")  WebElement hiddenElementsAJAX;
	
	public void hiddenElementsAJAXLink() {
		hiddenElementsAJAX.click();
	}
	
	@FindBy(xpath="//button[@id='toggleInput']") 
	WebElement toggleInputBox2;
	
	public void clicktoggleinputbox2()
	{
		toggleInputBox2.click();
	}
	
	@FindBy(xpath="//div[@id='container']//input[@id='input1']") 
	WebElement inputBox1;
	
	public void setinputbox1(String txt1)
	{
		inputBox1.sendKeys(txt1);
	}
	
	@FindBy(xpath="//div[@id='container']//input[@id='input2']") 
	WebElement inputBox2;
	
	public void setinputbox2(String txt2) 
	{
		boolean inputbox2status=inputBox2.isDisplayed();
		if(inputbox2status==true) {
			System.out.println("input box 2  is displayed and ready to type");
		}
		inputBox2.sendKeys(txt2);
	}
	
	@FindBy(xpath="//button[@id='toggleCheckbox']") 
	WebElement toggleCheckbox2;
	public void clicktoggleCheckbox2()
	{
		
		toggleCheckbox2.click();
	}
	
	@FindBy(xpath="//input[@id='checkbox1']") 
	WebElement checkbox1;
	
	public void clickcheckbox1() {
		checkbox1.click();
	}
	
	@FindBy(xpath="//input[@id='checkbox2']") 
	WebElement checkbox2;
	
	public void clickcheckbox2() {
		boolean checkboxstatus=checkbox2.isDisplayed();
		if(checkboxstatus==true) {
			System.out.println("Chceck box 2 is displayed and ready to click");
		}
		checkbox2.click();
	}
	
	@FindBy(xpath="//button[@id='loadContent']") 
	WebElement loadAJAXContent;
	
	public void clickloadAJAXContent() {
		loadAJAXContent.click();
	}
	
	@FindBy(xpath="//div[@id='ajaxContent']")
	WebElement aJAXContentLoadedThisIsSom;
	@FindBy(xpath="//p[normalize-space()='This is some dynamic content loaded through AJAX.']") 
	WebElement thisIsSomeDynamicContentL;
	public void aJAXcontentloaded() throws InterruptedException {
		boolean status=aJAXContentLoadedThisIsSom.isDisplayed();
		if(status==true) {
			
			System.out.println("aJAX content is loaded successfully..and the message is..");
			Thread.sleep(3000);
			String msg=thisIsSomeDynamicContentL.getText();
			System.out.println(msg);
		}
	}
	
	@FindBy(xpath="//a[normalize-space()='Home']") 
	WebElement home;
	
	public void clickhome() throws InterruptedException {
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByClassName('home-link')[0].style.background ='yellow'");
		Thread.sleep(2500);
		home.click();
	}
	
}
