package com.FrameworkPractice.action;

import org.openqa.selenium.WebElement;

import base.TestBase;

public class ActionClass extends TestBase {
	
	//Reusable Methods
	//Methods which are used more frequently can be defined in this ActionClass
	//and then these methods can be called where ever it is required in the framework

	public void clearText(WebElement a) {
		
		driver.findElement(null).clear();
		
	}
}
