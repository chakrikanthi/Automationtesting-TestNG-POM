package testCases;

import org.testng.annotations.Test;

import pageobjects.Pointme;
import testBase.Baseclass;

public class Pointme_TC extends Baseclass{
	@Test
	public void ponitmeexe() throws InterruptedException {
		Pointme ptm= new Pointme(driver);
		ptm.ponitmemobiles();
		ptm.ponitmelaptops();
	}

}
