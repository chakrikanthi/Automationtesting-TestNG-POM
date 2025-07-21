package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Genderbtn extends Basepage{

	public Genderbtn(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@id='male']") 
	WebElement male;
	
	public void malebtn() {
		male.click();	
	}
	
	@FindBy(xpath="//input[@id='female']") 
	WebElement female;
	public void femalebtn() {
		female.click();	
	}
	
	
}
