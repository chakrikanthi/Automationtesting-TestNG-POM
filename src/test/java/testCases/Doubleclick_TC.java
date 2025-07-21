package testCases;

import org.testng.annotations.Test;

import pageobjects.Doubleclick;
import testBase.Baseclass;

public class Doubleclick_TC extends Baseclass{
    @Test
	public void doubleclasstc() throws InterruptedException {
		Doubleclick dbclick= new Doubleclick(driver);
		dbclick.copytext();
	}
}
