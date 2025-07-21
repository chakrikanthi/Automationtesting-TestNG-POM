package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragNDrop extends Basepage {

	public DragNDrop(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//div[@id='draggable']")WebElement dragMeToMyTarget;
	@FindBy(xpath="//div[@id='droppable']")  WebElement dropHere;
	
	Actions act =new Actions(driver);
	
	public void dragNdrop() {
		act.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
		System.out.println("Source box dropped successfully at Target box");
	}
}
