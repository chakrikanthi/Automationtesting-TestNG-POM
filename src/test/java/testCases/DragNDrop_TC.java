package testCases;

import org.testng.annotations.Test;

import pageobjects.DragNDrop;
import testBase.Baseclass;

public class DragNDrop_TC extends Baseclass{
	@Test
	public void dragndrop(){
		
		DragNDrop dgdp=new DragNDrop(driver);
		dgdp.dragNdrop();
		
	}

}
