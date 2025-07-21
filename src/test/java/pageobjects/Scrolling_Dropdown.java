package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scrolling_Dropdown extends Basepage{

	public Scrolling_Dropdown(WebDriver driver) {
		super(driver);
		
	}

	
	
	@FindBy(xpath="//input[@placeholder='Select an item']")  WebElement selectAnItem;
	
	
	public void selectionbox()
	{
		selectAnItem.click();	
	}
	
	@FindBy(xpath="//div[normalize-space()='Item 3']")  WebElement item3;
	
	public void selectitems() throws InterruptedException {
		
	JavascriptExecutor jsexe= (JavascriptExecutor)driver;
	jsexe.executeScript("window.scrollBy(0,600)");
	 jsexe.executeScript("document.getElementsByClassName('option')[2].style.border='5px red solid';");
	 
	 Thread.sleep(1000);
	 item3.click();
	 System.out.println("Item 3 got highlighted and selected");
	}
}
