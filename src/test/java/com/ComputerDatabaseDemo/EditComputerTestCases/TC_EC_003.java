package com.ComputerDatabaseDemo.EditComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;
import com.ComputerDatabaseDemo.pageObjects.ComputerListPage;
import com.ComputerDatabaseDemo.pageObjects.EditComputerPage;

public class TC_EC_003 extends BaseClassEC{
	public String cName="ACE";
	public String newName="ABC";
	
	@Test(priority=1)
	public void editComputerWithValidInput() throws InterruptedException {
		EditComputerPage ec = new EditComputerPage(driver);
		ec.clickComputerName(cName);
		Thread.sleep(2000);
		ec.setComputername(newName);
		ec.setIntroduced("1998-10-25");
		ec.setDiscontinued("1998-10-26");
		ec.setcompany("IBM");
		ec.saveComputer();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void SearchComputerNewName() throws InterruptedException, IOException {
		ComputerListPage cp = new ComputerListPage(driver);
		logger.info("Validation Start...");
		cp.setSearchInput(newName);
		cp.clickOnSearchSubmitBtn();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("Nothing to display")) {
			logger.info("TC_EC_003 failed");
			captureScreen(driver,"SearchComputerNewName");
			Assert.fail();
		}else {
			logger.info("TC_EC_003 passed");
			Assert.assertTrue(true);
		}
	}
	
}
