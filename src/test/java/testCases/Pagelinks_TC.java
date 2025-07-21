package testCases;

import org.testng.annotations.Test;

import pageobjects.Pageslink;
import testBase.Baseclass;

public class Pagelinks_TC extends Baseclass {
	@Test
	public void pagelinks() throws InterruptedException {
		Pageslink pgl= new Pageslink(driver);
		pgl.hiddenElementsAJAXLink();
		pgl.clicktoggleinputbox2();
		pgl.setinputbox1("first text");
		pgl.setinputbox2("Second text");
		pgl.clicktoggleCheckbox2();
		pgl.clickcheckbox1();
		pgl.clickcheckbox2();
		
		pgl.clickloadAJAXContent();
		
		Thread.sleep(3000);
		pgl.aJAXcontentloaded();
		pgl.clickhome();
		
		
		
		
	}


}
