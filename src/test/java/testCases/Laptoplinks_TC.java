package testCases;

import org.testng.annotations.Test;

import pageobjects.Laptoplinks;
import testBase.Baseclass;

public class Laptoplinks_TC extends Baseclass{
    @Test
	public void laptop_links() {
		Laptoplinks lpln= new Laptoplinks(driver);
		lpln.laptoplinks();
		lpln.laptopfield_hl();
		lpln.applelink();
		lpln.lenovolink();
		lpln.delllink();
	}
}


//output:
/*Laptop Links
https://testautomationpractice.blogspot.com/
clicked on the Apple link and we are in page:https://www.apple.com/
Apple
Navigated back to the page:https://testautomationpractice.blogspot.com/
clicked on the Lenovo link and we are in page:https://www.lenovo.com/us/en/
Lenovo Official US Site | Laptops, PCs, Tablets & Servers | Lenovo US
Navigated back to the page:https://testautomationpractice.blogspot.com/
clicked on the Dell link and we are in page:https://www.dell.com/en-us
Computers, Monitors & Technology Solutions | Dell USA
Navigated back to the page:https://testautomationpractice.blogspot.com/*/