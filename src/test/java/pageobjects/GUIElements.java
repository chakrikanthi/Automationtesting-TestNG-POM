package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GUIElements extends Basepage{

	public GUIElements(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@id='name']") 
	WebElement enterName;
	
	public void Setname(String name)
	{
		enterName.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@id='email']") 
	
	WebElement enterEMail;
	
	public void SetEmail(String email)
	{
		enterEMail.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@id='phone']") 
	WebElement enterPhone;
	
	public void SetPhone(String phnumb)
	{
		enterPhone.sendKeys(phnumb);
	}
	
	@FindBy(xpath="//textarea[@id='textarea']") 
	WebElement address;
	
	public void Setaddress(String add)
	{
		address.sendKeys(add);
	}
	
}
