package com.ComputerDatabaseDemo.FilterComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;
import com.ComputerDatabaseDemo.pageObjects.ComputerListPage;
import com.ComputerDatabaseDemo.pageObjects.DeleteComputerPage;
import com.ComputerDatabaseDemo.pageObjects.EditComputerPage;

public class TC_FC_001 extends BaseClassFC{
	String errorMsg = "Please fill out this field.";
	
	@Test(priority=1)
	public void searchByEmptyField() throws InterruptedException, IOException {
		ComputerListPage cp = new ComputerListPage(driver);
		cp.setSearchInput("");
		cp.clickOnSearchSubmitBtn();
		if(cp.validateInput().equals(errorMsg)) {
			logger.info("TC_FC_001 passed");
			Assert.assertTrue(true);
		}else {
			logger.info("TC_FC_001 failed");
			captureScreen(driver,"searchByEmptyField");
			Assert.fail();
		}
		
	}
	
}
