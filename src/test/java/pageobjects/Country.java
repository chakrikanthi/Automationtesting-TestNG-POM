package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Country extends Basepage{

	public Country(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//select[@id='country']")
	WebElement country;
	
	Select countryselection=new Select(country);

	public void USA() {
		countryselection.selectByValue("usa");
	}

	public void Canada() {
		countryselection.selectByValue("canada");
	}
	
	public void UK() {
		countryselection.selectByValue("uk");
	}
	public void Germany() {
		countryselection.selectByValue("germany");
	}
	public void France() {
		countryselection.selectByValue("france");
	}
	public void Australia() {
		countryselection.selectByValue("australia");
	}
	public void Japan() {
		countryselection.selectByValue("japan");
	}
	public void China() {
		countryselection.selectByValue("china");
	}
	
	public void Brajil() {
		countryselection.selectByValue("brazil");
	}
	
	public void India() {
		countryselection.selectByValue("india");
	}
	
	
}
