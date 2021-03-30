package com.ComputerDatabaseDemo.FilterComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;
import com.ComputerDatabaseDemo.pageObjects.ComputerListPage;
import com.ComputerDatabaseDemo.pageObjects.EditComputerPage;

public class TC_FC_002 extends BaseClassFC{
	String cName = "ACE";
	
	@Test(priority=1)
	public void searchByValidInput() throws InterruptedException, IOException {
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
