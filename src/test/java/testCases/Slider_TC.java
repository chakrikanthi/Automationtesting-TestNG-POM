package testCases;

import org.testng.annotations.Test;

import pageobjects.Slider;
import testBase.Baseclass;

public class Slider_TC extends Baseclass {
    @Test
	public void sliders() throws InterruptedException {
		Slider sld= new Slider(driver);
		sld.Leftslideractions();
		Thread.sleep(1500);
		sld.Rightslideractions();
	}
}
