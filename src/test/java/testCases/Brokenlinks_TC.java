package testCases;

import org.testng.annotations.Test;

import pageobjects.Broken_Links;
import testBase.Baseclass;

public class Brokenlinks_TC extends Baseclass{

	@Test
	public void brokenlinks() {
		Broken_Links brklnk= new Broken_Links(driver);
		brklnk.brokenLinksheader();
		brklnk.errorcode400();
		brklnk.bodyElement400();
		brklnk.errorcode401();
		brklnk.bodyElement401();
		brklnk.errorcode403();
		brklnk.bodyElement403();
		brklnk.errorcode404();
		brklnk.bodyElement404();
		brklnk.errorcode408();
		brklnk.bodyElement408();
	}
}
