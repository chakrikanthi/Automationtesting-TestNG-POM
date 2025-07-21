package testCases;

import org.testng.annotations.Test;

import pageobjects.Days;

import testBase.Baseclass;

public class DaysSelection_TC extends Baseclass{
	@Test
	public void DAYS() {
		Days DY= new Days(driver);
		DY.multidays();

}
}