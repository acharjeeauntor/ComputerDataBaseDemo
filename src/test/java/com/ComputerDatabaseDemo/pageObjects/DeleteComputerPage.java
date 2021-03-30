package com.ComputerDatabaseDemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DeleteComputerPage {
WebDriver ldriver;
	
	public DeleteComputerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@value='Delete this computer']")
	WebElement deleteComputerBtn;

	
	public void clickComputerName(String name) {
		ldriver.findElement(By.xpath("//a[normalize-space()='"+name+"']")).click();
	}
	
	public void clickDeleteComputer() {
		deleteComputerBtn.click();
	}
	
	
}
