package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SVG_Elements extends Basepage{

	public SVG_Elements(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//div[@class='svg-container']//*[name()='circle' and contains(@cx,'15')]") WebElement Circlesvg;
	public void circlesvgelement() {
		String tagname= Circlesvg.getTagName();
		System.out.println("First SVG Element is:"+tagname);
	}
	@FindBy(xpath="//div[@class='svg-container']//*[name()='rect' and contains(@x,'3')]") WebElement Rectanglesvg;
	public void Rectanglesvgelement() {
		String tagname1= Rectanglesvg.getTagName();
		System.out.println("Second SVG Element is:"+tagname1);
	}
	@FindBy(xpath="//div[@class='svg-container']//*[name()='polygon' and contains(@points,'15,3 3,27 ')]") WebElement Trianglesvg;
	public void Trianglesvgelement() {
		String tagname2= Trianglesvg.getTagName();
		System.out.println("Third SVG Element is:"+tagname2);
	}

}
