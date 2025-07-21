package pageobjects;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Colors extends Basepage{

	public Colors(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//label[normalize-space()='Colors:']") 
	WebElement colors;
	@FindBy(xpath="//select[@id='colors']//option[1]") 
	WebElement red;
	@FindBy(xpath="//select[@id='colors']//option[3]") 
	WebElement green;
	@FindBy(xpath="//select[@id='colors']//option[4]") 
	WebElement Yellow;
	
	Actions act= new Actions(driver);
	
	public void multicolors() {
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).click(red).click(green).click(Yellow).keyUp(Keys.CONTROL).perform();
	}
	
	
	
}
