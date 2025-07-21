package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Sortedlist_Animals extends Basepage {

	public Sortedlist_Animals(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//option[@value='cat']") 
	WebElement cat;

	@FindBy(xpath="//option[@value='cheetah']") 
	WebElement cheetah;

	@FindBy(xpath="//option[@value='dog']") 
	WebElement dog;

	Actions act= new Actions(driver);

	public void multianimalselection() {
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).click(cat).click(cheetah).click(dog).keyUp(Keys.CONTROL).perform();
	}


}
