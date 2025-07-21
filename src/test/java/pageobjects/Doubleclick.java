package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Doubleclick extends Basepage{

	public Doubleclick(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//button[normalize-space()='Copy Text']")  WebElement copyText;
	//@FindBy(xpath="//input[@id='field2']") WebElement field2;
	@FindBy(xpath="//div[@class='column-right-outer']//input[2]")  WebElement field2;
	Actions act= new Actions(driver);
	JavascriptExecutor jsexe= (JavascriptExecutor)driver;
	public void copytext() throws InterruptedException {
		jsexe.executeScript("document.getElementsByTagName('button')[10].style.background ='yellow';");
		act.doubleClick(copyText).build().perform();
		Thread.sleep(2000);
		//String field2text=field2.getText();
		System.out.println("Field 2 copied text is:"+field2.getText());
	}
}
