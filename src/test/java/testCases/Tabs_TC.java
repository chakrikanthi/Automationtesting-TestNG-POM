package testCases;

import org.testng.annotations.Test;

import pageobjects.Tabs;
import testBase.Baseclass;

public class Tabs_TC extends Baseclass{
	@Test
	public void tabs() {
		Tabs tbs= new Tabs(driver);
		tbs.searchbox("selenium");
		tbs.searchicon();
		//tbs.seleniumSearchresultnames();
		tbs.seleniumfirstserchresult();
	}

}
