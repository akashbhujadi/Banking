package com.InetBankig.TestData;

import com.InetBankig.Utilities.ExcelDataProviderUtil;

public class DataProvider {
	
	@org.testng.annotations.DataProvider
	public Object[][] TC_LogIn_002 () throws Exception
	{
		Object [][] data=ExcelDataProviderUtil.getExcelData("LoginData", "Sheet1");
		return data;			
	}


}
