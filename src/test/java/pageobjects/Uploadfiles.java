package pageobjects;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Uploadfiles extends Basepage {

	public Uploadfiles(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='singleFileInput']")
	WebElement singleFileInput;
	
	JavascriptExecutor jsexe= (JavascriptExecutor)driver;
	
	public void clicksinglefilebtn() {
		//jsexe.executeScript("window.scrollBy(0,1300)");
		singleFileInput.click();
		jsexe.executeScript("document.getElementById('singleFileInput').style.background ='yellow';");
	}
 Actions act= new Actions(driver);
 public String singlefileupload() {
	 jsexe.executeScript("window.scrollBy(0,1300)");
	 singleFileInput.sendKeys(" C:\\Users\\chakr\\Desktop\\ironman.jpg");
	String uploadedfile= singleFileInput.getText();
	return uploadedfile;
 }
 
 @FindBy(xpath="//p[@id='singleFileStatus']") 
 WebElement Ironmanstatus;
 public String Ironmanstatus() {
	 return(Ironmanstatus.getText());
	
	 
 }
 @FindBy(xpath="//input[@id='multipleFilesInput']")
 WebElement multipleFilesInput;
 
 String file1="C:\\Users\\chakr\\Desktop\\ironman.jpg";
 String file2="C:\\Users\\chakr\\Desktop\\cucumber project creation.png";
 String file3="C:\\Users\\chakr\\Desktop\\selenium.JPG";
 public void multiplefileupload() {
	 multipleFilesInput.sendKeys(file1+"\n"+file2+"\n"+file3);
 }
 
}
