package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Slider extends Basepage{

	public Slider(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//div[@class='widget HTML']//span[1]")  WebElement Leftsliderrange;
	
	@FindBy(xpath="//div[@class='widget HTML']//span[2]") WebElement Rightsliderrange;
	Actions act= new Actions(driver);
	
	public void Leftslideractions() {
		System.out.println("Left slider location Before moving:"+Leftsliderrange.getLocation());
		act.dragAndDropBy(Leftsliderrange, -100, 0).perform();
		System.out.println("Left slider location after moving:"+Leftsliderrange.getLocation());
	}
	public void Rightslideractions() {
		System.out.println(" Right slider location Before moving:"+Rightsliderrange.getLocation());
		act.dragAndDropBy(Rightsliderrange, 0,1000).perform();
		System.out.println("Right slider location after moving:"+Rightsliderrange.getLocation());
	}
	
}
