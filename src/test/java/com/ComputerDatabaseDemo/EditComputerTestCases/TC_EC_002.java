package com.ComputerDatabaseDemo.EditComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.AddComputerTestCases.BaseClass;
import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;
import com.ComputerDatabaseDemo.pageObjects.EditComputerPage;
import com.ComputerDatabaseDemo.utilities.XLUtils;

public class TC_EC_002 extends BaseClass{
	
	@Test(priority=1)
	public void editComputerWithInvalidInput() throws InterruptedException, IOException {
		String cName=XLUtils.getCellData(excelPath, "sheet1", 5, 1);
		String invalidinput =XLUtils.getCellData(excelPath, "sheet1", 5, 0);
		EditComputerPage ec = new EditComputerPage(driver);
		ec.clickComputerName(cName);
		Thread.sleep(2000);
		ec.setComputername(invalidinput);
		ec.setIntroduced(invalidinput);
		ec.setDiscontinued(invalidinput);
		ec.saveComputer();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("Failed to decode date")) {
			logger.info("TC_EC_002 passed");
			Assert.assertTrue(true);
		}else {
			logger.warn("TC_EC_002 failed");
			captureScreen(driver,"editComputerWithInvalidInput");
			Assert.fail();
		}
	}
	
	
}
