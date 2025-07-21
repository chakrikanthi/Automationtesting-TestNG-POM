package testCases;

import org.testng.annotations.Test;


import pageobjects.Uploadfiles;
import testBase.Baseclass;

public class Uploadfiles_TC extends Baseclass {
	@Test

	public void UPLOADFILES() {
		Uploadfiles UPFILES= new Uploadfiles(driver);
		//UPFILES.clicksinglefilebtn();
		UPFILES.singlefileupload();
		UPFILES.Ironmanstatus();
		UPFILES.multiplefileupload();
	}

}
