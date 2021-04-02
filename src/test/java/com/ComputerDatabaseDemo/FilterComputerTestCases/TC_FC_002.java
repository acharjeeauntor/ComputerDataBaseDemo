package com.ComputerDatabaseDemo.FilterComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.AddComputerTestCases.BaseClass;
import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;
import com.ComputerDatabaseDemo.pageObjects.ComputerListPage;
import com.ComputerDatabaseDemo.pageObjects.EditComputerPage;
import com.ComputerDatabaseDemo.utilities.XLUtils;

public class TC_FC_002 extends BaseClass{
	
	@Test(priority=1)
	public void searchByValidInput() throws InterruptedException, IOException {
		String cName=XLUtils.getCellData(excelPath, "sheet1", 5, 1);
		ComputerListPage cp = new ComputerListPage(driver);
		cp.setSearchInput(cName);
		cp.clickOnSearchSubmitBtn();
		if(driver.getPageSource().contains(cName)) {
			logger.info("TC_FC_002 passed");
			Assert.assertTrue(true);
		}else {
			logger.info("TC_FC_002 failed");
			captureScreen(driver,"searchByValidInput");
			Assert.fail();
		}
	}
	
	
}
