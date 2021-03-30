package com.ComputerDatabaseDemo.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ComputerListPage {
WebDriver ldriver;
	
	public ComputerListPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@id='searchbox']")
	WebElement searchInput;
	
	@FindBy(xpath="//input[@id='searchsubmit']")
	WebElement searchSubmitBtn;
	
	
	
	
	
	public void setSearchInput(String input) {
		searchInput.sendKeys(input);
	}
	
	public void clickOnSearchSubmitBtn() {
		searchSubmitBtn.click();
	}
	
	
	// First Way using Error Message
	public String validateInput() {
		// element is required and validation error will pop-up if the field is empty.
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		String message = (String)js.executeScript("return arguments[0].validationMessage;", searchInput);
		return message;
	}
	
	// Second Way using boolean value 
//	public Boolean validateInput() {
//		// element is required and validation error will pop-up if the field is empty.
//		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//		boolean isRequired = (Boolean) js.executeScript("return arguments[0].required;",searchInput);
//		return isRequired;
//	}
	
}
