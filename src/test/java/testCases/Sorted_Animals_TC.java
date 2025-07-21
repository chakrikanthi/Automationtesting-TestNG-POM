package testCases;

import org.testng.annotations.Test;


import pageobjects.Sortedlist_Animals;
import testBase.Baseclass;

public class Sorted_Animals_TC extends Baseclass {
	@Test
	public void Animals() {
		Sortedlist_Animals srtAnimal= new Sortedlist_Animals(driver);
		
		srtAnimal.multianimalselection();

}
}