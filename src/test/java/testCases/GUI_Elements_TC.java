package testCases;


import org.testng.annotations.Test;

import pageobjects.GUIElements;
import testBase.Baseclass;

public class GUI_Elements_TC extends Baseclass {
	
	
    @Test
	public void GUI_Elements_tc() {
		GUIElements gui= new GUIElements(driver);
		gui.Setname("Kanthi sri");
		gui.SetEmail("kanthi@gmail.com");
		gui.SetPhone("4005006789");
		gui.Setaddress("5678 oak park circle, UK");
		
	}

}
