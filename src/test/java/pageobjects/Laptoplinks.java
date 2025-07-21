package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Laptoplinks extends Basepage{

	public Laptoplinks(WebDriver driver) {
		super(driver);

	}
	JavascriptExecutor jsexe= (JavascriptExecutor)driver;
	@FindBy(xpath="//h4[normalize-space()='Laptop Links']")  WebElement laptopLinks;


	public void laptoplinks() {
		String laptoplinks_name=laptopLinks.getText();
		System.out.println(laptoplinks_name);
	}

	public void laptopfield_hl() {

		//JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("window.scrollBy(0,600)");
		jsexe.executeScript("document.getElementById('laptops').style.background ='yellow';");
	}

	@FindBy(xpath="//a[normalize-space()='Apple']")  WebElement applelink;
	public void applelink() {
		jsexe.executeScript("document.getElementById('apple').style.background ='green';");
		System.out.println(driver.getCurrentUrl());
		applelink.click();
		System.out.println("clicked on the Apple link and we are in page:"+driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("Navigated back to the page:"+driver.getCurrentUrl());
	}

	@FindBy(xpath="//a[normalize-space()='Lenovo']")  WebElement lenovolink;
	public void lenovolink() {
		jsexe.executeScript("document.getElementById('lenovo').style.background ='red';");
		lenovolink.click();
		System.out.println("clicked on the Lenovo link and we are in page:"+driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("Navigated back to the page:"+driver.getCurrentUrl());
	}

	//document.getElementById('dell').style.background ='blue';
	@FindBy(xpath="//a[normalize-space()='Dell']")  WebElement delllink;

	public void delllink() {
		jsexe.executeScript("document.getElementById('dell').style.background ='blue';");
		delllink.click();
		System.out.println("clicked on the Dell link and we are in page:"+driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("Navigated back to the page:"+driver.getCurrentUrl());
	}
}
