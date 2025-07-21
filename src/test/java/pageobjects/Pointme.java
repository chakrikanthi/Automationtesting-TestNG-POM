package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Pointme extends Basepage {

	public Pointme(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//button[normalize-space()='Point Me']")  WebElement pointMe;
	@FindBy(xpath="//a[normalize-space()='Mobiles']")  WebElement mobiles;
	@FindBy(xpath="//a[normalize-space()='Laptops']")  WebElement laptops;
	Actions act= new Actions(driver);
	JavascriptExecutor jsexe= (JavascriptExecutor)driver;

	public void ponitmemobiles() throws InterruptedException {
		jsexe.executeScript("window.scrollBy(0,700)");

		jsexe.executeScript("document.getElementsByTagName('a')[9].style.background ='red';");
		Thread.sleep(2500);
		act.moveToElement(pointMe).click(mobiles).build().perform();
		System.out.println("clicked on mobiles and it got highlighted in red color then the current page title is:"+driver.getTitle());
	}

	public void ponitmelaptops() throws InterruptedException {
		
		jsexe.executeScript("window.scrollBy(0,800)");
		jsexe.executeScript("document.getElementsByTagName('a')[10].style.background ='yellow';");
		Thread.sleep(2500);
		act.moveToElement(pointMe).click(laptops).build().perform();
		System.out.println("clicked on laptops and it got highlighted in yellow color then the current page title is:"+driver.getTitle());

	}
}
