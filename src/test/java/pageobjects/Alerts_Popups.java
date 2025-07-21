package pageobjects;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alerts_Popups extends Basepage{

	public Alerts_Popups(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//button[@id='alertBtn']") WebElement simpleAlert;


	public void clicksimplealert() {
		simpleAlert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	@FindBy(xpath="//button[@id='confirmBtn']")  WebElement confirmationAlert;
	public void clickconfirmationAlert() {
		confirmationAlert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}


	@FindBy(xpath="//button[@id='promptBtn']")  WebElement promptAlert;

	public void clickpromptAlert() throws InterruptedException {
		promptAlert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Kanthi");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

	@FindBy(xpath="//p[@id='demo']")  WebElement text;

	public void aftertext() {
		String txt=text.getText();
		System.out.println(txt);
	}

	@FindBy(xpath="//button[normalize-space()='New Tab']") WebElement newTab;

	public void clicknewTab() {

		String mainwindow= driver.getWindowHandle();
		System.out.println("Main window page title: "+mainwindow+driver.getTitle());
		newTab.click();
		Set <String> allwindows= driver.getWindowHandles();
		for(String allwindow:allwindows) {

			if(!allwindow.equals(mainwindow))
			{
				driver.switchTo().window(allwindow);
				driver.manage().window().maximize();
				System.out.println("New tab window page title: "+allwindow+driver.getTitle());					
				driver.close();
				driver.switchTo().window(mainwindow);
			}
		}


	}
	
	
	@FindBy(xpath="//button[@id='PopUp']")  WebElement popupWindows;
	public void popupwindow() throws InterruptedException {
		//Thread.sleep(3000);
		String mainwindow= driver.getWindowHandle();
		System.out.println("Main window page title: "+mainwindow+driver.getTitle());
		popupWindows.click();
		Set <String> allwindows= driver.getWindowHandles();
		for(String allwindow:allwindows) {

			if(!allwindow.equals(mainwindow))
			{
				driver.switchTo().window(allwindow);
				driver.manage().window().maximize();
				System.out.println("New Pop up window page title: "+allwindow+driver.getTitle());					
				driver.close();
				driver.switchTo().window(mainwindow);
			}
		}
	}

}


