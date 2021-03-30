package com.ComputerDatabaseDemo.AddComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;

public class TC_AC_002 extends BaseClassAC{
	public String invalidinput ="<script>alert(\"a\")</script>";
	
	@Test(priority=1)
	public void addComputerWithInvalidInput() throws InterruptedException, IOException {
		AddComputerPage ac = new AddComputerPage(driver);
		ac.clickNewComputer();
		Thread.sleep(2000);
		logger.info("Providing Input...");
		ac.setComputername(invalidinput);
		ac.setIntroduced(invalidinput);
		ac.setDiscontinued(invalidinput);
		ac.setcompany("IBM");
		ac.clickCreateComputer();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("Failed to decode date")) {
			logger.info("TC_AC_002 passed");
			Assert.assertTrue(true);
		}else {
			logger.warn("TC_AC_002 failed");
			captureScreen(driver,"addComputerWithInvalidInput");
			Assert.fail();
		}
	}
	
	
}
