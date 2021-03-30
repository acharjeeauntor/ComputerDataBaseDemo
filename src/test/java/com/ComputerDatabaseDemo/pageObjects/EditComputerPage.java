package com.ComputerDatabaseDemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditComputerPage {
WebDriver ldriver;
	
	public EditComputerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	
	@FindBy(xpath="//input[@id='name']")
	WebElement computerName;
	
	@FindBy(xpath="//input[@id='introduced']")
	WebElement introduced;
	

	@FindBy(xpath="//input[@id='discontinued']")
	WebElement discontinued;
	
	@FindBy(xpath="//select[@id='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@value='Save this computer']")
	WebElement saveComputerBtn;
	
	
	
	public void clickComputerName(String name) {
		ldriver.findElement(By.xpath("//a[normalize-space()='"+name+"']")).click();
	}
	
	public void saveComputer() {
		saveComputerBtn.click();
	}
	
	public void setComputername(String n) {
		computerName.clear();
		computerName.sendKeys(n);
	}
	public void setIntroduced(String i) {
		introduced.clear();
		introduced.sendKeys(i);
	}
	public void setDiscontinued(String d) {
		discontinued.clear();
		discontinued.sendKeys(d);
	}
	public void setcompany(String com) {
		Select se = new Select(company);
		se.selectByVisibleText(com);
		
	}
	
	public void clearComputername() {
		computerName.clear();
		
	}
	public void clearIntroduced() {
		introduced.clear();
		
	}
	public void clearDiscontinued() {
		discontinued.clear();
		
	}
	public void clearCompany() {
		Select se = new Select(company);
		se.selectByVisibleText("-- Choose a company --");
		
	}
}
