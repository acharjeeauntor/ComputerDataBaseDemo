package com.ComputerDatabaseDemo.pageObjects;

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
	
	
}
