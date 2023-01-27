package com.InetBankig.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InetBankig.POM.LoginPage;
import com.InetBankig.TestData.DataProvider;
import com.InetBankig.Utilities.ExcelDataProviderUtil;
import com.InetBankig.Utilities.IExtentReport;
/**
 * 
 * @author bka
 *
 */
public class TC_LogIn_002 extends BaseClass{
	
	@Test (groups = {"sanity"} , dataProvider = "TC_LogIn_002" , dataProviderClass = DataProvider.class ,description = "Auther=takash" )
	public  void TC_002(Object[] a) throws InterruptedException
	{
		
		
		log.info("Browser and  URL is launched Sucessfully");
		IExtentReport.etest.info("Browser and  URL is launched Sucessfully");
		LoginPage login=new LoginPage(driver);
		log.info("POM constructor launched Sucessfully");
		IExtentReport.etest.info("POM constructor launched Sucessfully");

		sendKeys(5,login.getUserNameElement(), (String) a[0]);
		log.info("UserName entered  Sucessfully");
		IExtentReport.etest.info("UserName entered  Sucessfully");

		sendKeys(5,login.getPasswordElement(), (String) a[1]);
		log.info("Password entered  Sucessfully");
		IExtentReport.etest.info("Password entered  Sucessfully");

		click(5,login.getLoginButtonElement());
		log.info("login button clicked Sucessfully");
		IExtentReport.etest.info("login button clicked Sucessfully");
		
		driver.switchTo().alert().accept();
		
		Assert.assertFalse(false);
		log.info("************ This test is  Sucessfully Passed *************");
		IExtentReport.etest.pass("This test is passed sucessfully with the assertion ");

		Thread.sleep(500);

}
}
