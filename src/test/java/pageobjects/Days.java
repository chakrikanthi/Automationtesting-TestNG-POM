package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Days extends Basepage{

	public Days(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//input[@id='sunday']")
	WebElement sunday;
	public void sundayset() {
		sunday.click();
	}

	@FindBy(xpath="//input[@id='monday']")  
	WebElement monday;
	public void mondayset() {
		monday.click();
	}
	@FindBy(xpath="//input[@id='tuesday']")  
	WebElement tuesday;
	public void tuesdayset() {
		tuesday.click();
	}

	@FindBy(xpath="//input[@id='wednesday']")  
	WebElement wednesday;
	public void wednesdayset() {
		wednesday.click();
	}

	@FindBy(xpath="//input[@id='thursday']")
	WebElement thursday;
	public void thursdayset() {
		thursday.click();
	}

	@FindBy(xpath="//input[@id='friday']")
	WebElement friday;
	public void fridayset() {
		friday.click();
	}

	@FindBy(xpath="//input[@id='saturday']") 
	WebElement saturday;
	public void saturdayset() {
		saturday.click();
	}
	
	Actions act= new Actions(driver);
  public void multidays() {
	  act.keyDown(Keys.CONTROL).click(sunday).click(monday).click(saturday).keyUp(Keys.CONTROL).perform();
	
}
}
