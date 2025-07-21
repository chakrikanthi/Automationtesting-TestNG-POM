package testCases;

import org.testng.annotations.Test;

import pageobjects.Alerts_Popups;
import testBase.Baseclass;

public class AlertsnPopups_TC extends Baseclass{
	@Test
	public void Alertsnpopups() throws InterruptedException {
		Alerts_Popups ALPU= new Alerts_Popups(driver);
		ALPU.clicksimplealert();
		ALPU.clickconfirmationAlert();
		ALPU.clickpromptAlert();
		ALPU.aftertext();
		ALPU.clicknewTab();
		ALPU.popupwindow();
	}

}
/*output:
I am an alert box!
Press a button!
Please enter your name:
Hello Kanthi! How are you today?
Main window page title: 1801E0E44EB2976237CECD9AB238DC1CAutomation Testing Practice
New tab window page title: 7EF4C230B0CC88FD67D4A725F33EF71CYour Store
Main window page title: 1801E0E44EB2976237CECD9AB238DC1CAutomation Testing Practice
New Pop up window page title: BE30283B62508DE1BF1B7A1ACECB3E83Fast and reliable end-to-end testing for modern web apps | Playwright
New Pop up window page title: 278B9D3387D5B6D50264EC82AE08FD64Selenium

here during run time when the mouse is clicking new pop up window ..it's opening two windows instead of one*/