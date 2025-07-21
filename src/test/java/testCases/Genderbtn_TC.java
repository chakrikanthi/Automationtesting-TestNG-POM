package testCases;

import org.testng.annotations.Test;

import pageobjects.Genderbtn;
import testBase.Baseclass;

public class Genderbtn_TC extends Baseclass{
	@Test
	public void gender() {
		Genderbtn gb= new Genderbtn(driver);
		gb.femalebtn();
		
	}}