package com.ComputerDatabaseDemo.DeleteComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;
import com.ComputerDatabaseDemo.pageObjects.DeleteComputerPage;

public class TC_DC_001 extends BaseClassDC{
	String cName = "ACE";
	
	@Test(priority=1)
	public void deleteComputerInfo() throws InterruptedException, IOException {
		DeleteComputerPage dc = new DeleteComputerPage(driver);
		dc.clickComputerName(cName);
		Thread.sleep(2000);
		dc.clickDeleteComputer();
		Thread.sleep(2000);
		if(driver.getPageSource().contains(cName)) {
			logger.info("TC_DC_001 failed");
			captureScreen(driver,"deleteComputerInfo");
			Assert.fail();
		}else {
			logger.warn("TC_AC_001 Passed");
			Assert.assertTrue(true);
			
		}
	}
	
	
}
