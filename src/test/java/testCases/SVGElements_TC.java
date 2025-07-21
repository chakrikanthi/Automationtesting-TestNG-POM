package testCases;

import org.testng.annotations.Test;

import pageobjects.SVG_Elements;
import testBase.Baseclass;

public class SVGElements_TC extends Baseclass{
	@Test
	
	public void svg_elements() {
		SVG_Elements svg= new SVG_Elements(driver);
		svg.circlesvgelement();
		svg.Rectanglesvgelement();
		svg.Trianglesvgelement();
	}

}
