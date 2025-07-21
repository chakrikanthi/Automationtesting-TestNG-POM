package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs extends Basepage {

	public Tabs(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//input[@class='wikipedia-search-input']")  WebElement Wikipediatxtbox;

	public void searchbox(String txt) {
		Wikipediatxtbox.sendKeys(txt);

	}

	@FindBy(xpath="//input[@type='submit']")WebElement searchIcon;
	public void searchicon() {
		searchIcon.click();
	}
	@FindBy(xpath="//div[@id='Wikipedia1_wikipedia-search-results']") 
	WebElement seleniumSearchresult;
	public String seleniumSearchresultnames() {

		String textnames=seleniumSearchresult.getText();
		return textnames;
	}
	@FindBy(xpath="//a[normalize-space()='Selenium']") WebElement seleniumfirstserchresult;
	public void seleniumfirstserchresult() {

		String textnames=seleniumfirstserchresult.getText();
		System.out.println(textnames);
	}
}
