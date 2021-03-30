package com.ComputerDatabaseDemo.EditComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;
import com.ComputerDatabaseDemo.pageObjects.DeleteComputerPage;
import com.ComputerDatabaseDemo.pageObjects.EditComputerPage;

public class TC_EC_001 extends BaseClassEC{
	String cName = "ACE";
	
	@Test(priority=1)
	public void editComputerInfo() throws InterruptedException, IOException {
		EditComputerPage ec = new EditComputerPage(driver);
		ec.clickComputerName(cName);
		Thread.sleep(2000);
		ec.clearComputername();
		ec.clearIntroduced();
		ec.clearDiscontinued();
		ec.clearCompany();
		ec.saveComputer();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("Failed to refine type")) {
			logger.warn("TC_EC_001 Passed");
			Assert.assertTrue(true);
			
		}else {
			logger.info("TC_EC_001 failed");
			captureScreen(driver,"editComputerInfo");
			Assert.fail();
			
		}
	}
	
	
}
