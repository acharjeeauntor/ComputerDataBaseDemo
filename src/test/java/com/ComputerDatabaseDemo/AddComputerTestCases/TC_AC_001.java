package com.ComputerDatabaseDemo.AddComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;

public class TC_AC_001 extends BaseClass{
	
	@Test(priority=1)
	public void addComputerWithEmptyField() throws InterruptedException, IOException {
		AddComputerPage ac = new AddComputerPage(driver);
		ac.clickNewComputer();
		Thread.sleep(2000);
		ac.clickCreateComputer();
		if(driver.getPageSource().contains("Failed to refine type")) {
			logger.info("TC_AC_001 passed");
			Assert.assertTrue(true);
		}else {
			logger.warn("TC_AC_001 failed");
			captureScreen(driver,"addComputerWithEmptyField");
			Assert.fail();
		}
	}
	
	
}
