package testCases;

import org.testng.annotations.Test;

import pageobjects.Scrolling_Dropdown;
import testBase.Baseclass;

public class Scrollingdrp_down_TC extends Baseclass{
	@Test
	public void scroll_dropdown() throws InterruptedException {
		Scrolling_Dropdown scrdrp= new Scrolling_Dropdown(driver);
		scrdrp.selectionbox();
		scrdrp.selectitems();
	}

}
