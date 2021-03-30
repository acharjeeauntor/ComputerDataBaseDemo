package com.ComputerDatabaseDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddComputerPage {
WebDriver ldriver;
	
	public AddComputerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Add a new computer']")
	WebElement newComputerBtn;
	
	@FindBy(xpath="//input[@value='Create this computer']")
	WebElement createComputerBtn;
	
	
	@FindBy(xpath="//input[@id='name']")
	WebElement computerName;
	
	@FindBy(xpath="//input[@id='introduced']")
	WebElement introduced;
	

	@FindBy(xpath="//input[@id='discontinued']")
	WebElement discontinued;
	
	@FindBy(xpath="//select[@id='company']")
	WebElement company;
	
	
	
	public void clickNewComputer() {
		newComputerBtn.click();
	}
	
	public void clickCreateComputer() {
		createComputerBtn.click();
	}
	
	public void setComputername(String n) {
		computerName.sendKeys(n);
	}
	public void setIntroduced(String i) {
		introduced.sendKeys(i);
	}
	public void setDiscontinued(String d) {
		discontinued.sendKeys(d);
	}
	public void setcompany(String com) {
		Select se = new Select(company);
		se.selectByVisibleText(com);
		
	}
}
