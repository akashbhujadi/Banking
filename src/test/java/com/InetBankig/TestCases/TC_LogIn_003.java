package com.InetBankig.TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.InetBankig.POM.HomePage;
import com.InetBankig.POM.LoginPage;
import com.InetBankig.Utilities.IExtentReport;
/**
 * 
 * @author cka
 *
 */
public class TC_LogIn_003 extends BaseClass {

	@Test(groups = { "regression" } ,description = "Auther=bakash")
	public  void TC_003() throws InterruptedException, FindFailed {
		
		TC_LogIn_001 tc=new TC_LogIn_001();
		tc.TC_001();
		

		HomePage homePage = new HomePage(driver);

		click(5,homePage.getNewCustomerElement());
		log.info("New Customer link clicked");
		IExtentReport.etest.info("New Customer link clicked");

		
		adblocker();
		

		
		sendKeys(5,homePage.getCustomerNameElement(), "akash babji");
		log.info("Customer name entered successfully");
		IExtentReport.etest.info("Customer name entered successfully");

		checkBox(5,homePage.getFemaleGenderElement());
		log.info("Gender selected successfully");
		IExtentReport.etest.info("Gender selected successfully");

		enterDOB(5,homePage.getDobElement(), "14", "01", "2023");
		log.info("DOB entered successfully");
		IExtentReport.etest.info("DOB entered successfully");

		sendKeys(5,homePage.getAddressElement(), "GAw Mahirt Ngu JLN");
		log.info("Address entered successfully");
		IExtentReport.etest.info("Address entered successfully");

		sendKeys(5,homePage.getCityElement(), "city");
		log.info("city entered successfully");
		IExtentReport.etest.info("City entered successfully");

		sendKeys(5,homePage.getStateElement(), "State");
		log.info("State entered successfully");
		IExtentReport.etest.info("State entered successfully");

		sendKeys(5,homePage.getPinElement(), "457812");
		log.info("pin entered successfully");
		IExtentReport.etest.info("pin entered successfully");

		sendKeys(5,homePage.getMobileElement(), GenerateMobileno());
		log.info("MobileNo entered successfully");
		IExtentReport.etest.info("MobileNo entered successfully");

		sendKeys(5,homePage.getEmailElement(), generateEmail());
		log.info("Email entered successfully");
		IExtentReport.etest.info("Email entered successfully");

		sendKeys(5,homePage.getPasswordElement(), GeneratePassword());
		log.info("Password entered successfully");
		IExtentReport.etest.info("Password entered successfully");
		Thread.sleep(2000);

		click(5,homePage.getSubmitElement());
		log.info("Submitted successfully");
		IExtentReport.etest.info("Submitted  successfully");

		Assert.assertTrue(driver.getPageSource().contains("Customer Registered Successfully!!!"));
		log.info("Test is  successfully executed");
		IExtentReport.etest.info("Test is  successfully executed with assertion");

		Thread.sleep(500);

	}

	
}
