package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Saticwebtable extends Basepage{

	public Saticwebtable(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]") 
	WebElement learnSelenium;
	
	

}
