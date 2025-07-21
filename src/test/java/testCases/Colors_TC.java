package testCases;

import org.testng.annotations.Test;

import pageobjects.Colors;
import testBase.Baseclass;

public class Colors_TC extends Baseclass{
	@Test
	
	public void colors() {
		Colors cl= new Colors(driver);
		cl.multicolors();
		
	}

}
