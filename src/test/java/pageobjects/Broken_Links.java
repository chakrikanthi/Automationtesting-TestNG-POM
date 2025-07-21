package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Broken_Links extends Basepage{

	public Broken_Links(WebDriver driver) {
		super(driver);
		
	}
	JavascriptExecutor jsexe= (JavascriptExecutor)driver;
	@FindBy(xpath="//h4[normalize-space()='Broken Links']")  WebElement brokenLinks;
	public void brokenLinksheader() {
	
		jsexe.executeScript("window.scrollBy(0,1800)");
		jsexe.executeScript("document.getElementsByTagName('h4')[2].style.background ='yellow';");
	}
	
	@FindBy(xpath="//a[normalize-space()='Errorcode 400']")  WebElement errorcode400;
	public void errorcode400() {
		jsexe.executeScript("document.getElementsByTagName('a')[14].style.background ='green';");
		errorcode400.click();
		
	}
	
	@FindBy(xpath="//body")  WebElement bodyElement400;
	
	public void bodyElement400() {
		String pagetext= bodyElement400.getText();
		
		System.out.println("Error code page text is:"+driver.getCurrentUrl());
		System.out.println(pagetext);
		driver.navigate().back();
	}
	
	@FindBy(xpath="//a[normalize-space()='Errorcode 401']")  WebElement errorcode401;
	public void errorcode401() {
		jsexe.executeScript("document.getElementsByTagName('a')[15].style.background ='red';");
		errorcode401.click();
	}
	@FindBy(xpath="//h2[contains(text(),'401 - Unauthorized: Access is denied due to invali')]")  WebElement Unauthorizedbody401;
	public void bodyElement401() {
		String pagetext= Unauthorizedbody401.getText();
		System.out.println("Error code page text is:"+driver.getCurrentUrl());
		System.out.println(pagetext);
		driver.navigate().back();
	}
	
	@FindBy(xpath="//a[normalize-space()='Errorcode 403']")  WebElement errorcode403;
	public void errorcode403() {
		jsexe.executeScript("document.getElementsByTagName('a')[16].style .border='5px green solid';");
		errorcode403.click();
	}
	@FindBy(xpath="//h2[normalize-space()='403 - Forbidden: Access is denied.']") WebElement Forbiddenbody403;
	public void bodyElement403() {
		String pagetext= Forbiddenbody403.getText();
		System.out.println("Error code page text is:"+driver.getCurrentUrl());
		System.out.println(pagetext);
		driver.navigate().back();
	}
	
	@FindBy(xpath="//a[normalize-space()='Errorcode 404']")  WebElement errorcode404;
	public void errorcode404() {
		jsexe.executeScript("document.getElementsByTagName('a')[17].setAttribute('style', 'border:5px blue dotted;background:yellow');");
		errorcode404.click();
	}
	@FindBy(xpath="//h2[normalize-space()='404 - File or directory not found.']")  WebElement FileOrDirectory404;
	public void bodyElement404() {
		String pagetext= FileOrDirectory404.getText();
		System.out.println("Error code page text is:"+driver.getCurrentUrl());
		System.out.println(pagetext);
		driver.navigate().back();
	}
	@FindBy(xpath="//a[normalize-space()='Errorcode 408']")  WebElement errorcode408;
	public void errorcode408() {
		jsexe.executeScript("document.getElementsByTagName('a')[18].setAttribute('style', 'border:5px blue dotted;background:red');");
		errorcode408.click();
	}
	@FindBy(xpath="//body")  WebElement bodyElement408;
	public void bodyElement408() {
		String pagetext= bodyElement408.getText();
		System.out.println("Error code page text is:"+driver.getCurrentUrl());
		System.out.println(pagetext);
		driver.navigate().back();
	}
}
