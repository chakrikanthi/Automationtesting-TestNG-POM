package testCases;

import org.testng.annotations.Test;


import pageobjects.Country;
import testBase.Baseclass;

public class Country_TC  extends Baseclass{
	@Test

	public void colors() {
		Country ctry= new Country(driver);
		ctry.USA();


	}
}