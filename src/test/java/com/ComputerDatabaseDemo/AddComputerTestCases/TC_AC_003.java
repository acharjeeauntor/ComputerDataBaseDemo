package com.ComputerDatabaseDemo.AddComputerTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ComputerDatabaseDemo.pageObjects.AddComputerPage;
import com.ComputerDatabaseDemo.pageObjects.ComputerListPage;

public class TC_AC_003 extends BaseClassAC{
	public String Cname="Auntor";
	
	@Test(priority=1)
	public void addComputerWithValidInput() throws InterruptedException {
		AddComputerPage ac = new AddComputerPage(driver);
		ac.clickNewComputer();
		Thread.sleep(2000);
		logger.info("Providing Input...");
		ac.setComputername(Cname);
		ac.setIntroduced("1998-10-25");
		ac.setDiscontinued("1998-10-26");
		ac.setcompany("IBM");
		ac.clickCreateComputer();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void SearchComputerName() throws InterruptedException, IOException {
		ComputerListPage cp = new ComputerListPage(driver);
		logger.info("Validation Start...");
		cp.setSearchInput(Cname);
		cp.clickOnSearchSubmitBtn();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("Nothing to display")) {
			logger.info("TC_AC_003 failed");
			captureScreen(driver,"SearchComputerName");
			Assert.fail();
		}else {
			logger.info("TC_AC_003 passed");
			Assert.assertTrue(true);
		}
	}
	
}
