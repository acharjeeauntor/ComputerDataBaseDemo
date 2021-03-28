package com.ComputerDatabaseDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddComputerPages {
WebDriver ldriver;
	
	public AddComputerPages(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Add a new computer']")
	WebElement newComputerBtn;
	
	@FindBy(xpath="//input[@value='Create this computer']")
	WebElement createComputerBtn;
	

	
	
	
	
	public void clickNewComputer() {
		newComputerBtn.click();
	}
	
	public void clickCreateComputer() {
		createComputerBtn.click();
	}
	
	
}
