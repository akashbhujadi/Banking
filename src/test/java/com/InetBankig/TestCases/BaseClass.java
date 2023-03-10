package com.InetBankig.TestCases;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.InetBankig.Utilities.IExtentReport;
import com.InetBankig.Utilities.ReadConfig;
import com.aventstack.extentreports.model.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	  ReadConfig readConfig=new ReadConfig();
	
	
	public static WebDriver driver;
	 String URL=readConfig.getURl();
	 String suserName=readConfig.getuserName();
	 String spassword=readConfig.getpassword();
	 String title=readConfig.gettitle();
	public static Logger log;

	
	
	@Parameters("browser")
	 @BeforeClass
	  public void launchBrowser(@Optional("chrome")String browser) throws InterruptedException
	 {
		 switch(browser.toLowerCase())
		 {
		 case "chrome" :
			 	WebDriverManager.chromedriver().setup();
			 	driver=new ChromeDriver();
			 	break;
			 			
		 case "firefox" :
	 			WebDriverManager.firefoxdriver().setup();
	 			driver=new FirefoxDriver();
	 			break;
	 			
		 case "edge" :
	 			WebDriverManager.edgedriver().setup();
	 			driver=new EdgeDriver();
	 			break;	
	 	default:
	 		System.out.println("Enter z Browser name from chrome , edge , firefox only");	 		
		 }	
		 
		driver.get(URL);
	 	driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 log=Logger.getLogger("Banking");
		//PropertyConfigurator.configure("log4j.properties");
		DOMConfigurator.configure("log4j.xml");
		
		

	 }
	
	
	@AfterClass
	  public void tearDown() 
	  {
		driver.close();
		 
	  }
		
	
	public static void adblocker() throws FindFailed
	{
		Screen ss=new Screen();
		try
		{
			Pattern closeButton=new Pattern("./sikuli/close.png");
			ss.click(closeButton);
		}
		catch(Exception e)
		{
			Pattern crosButton=new Pattern("./sikuli/cross.png");
			ss.click(crosButton);
			
		}
	}
	
	public static void click(int time,WebElement element )
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
		
	}
	
	public static void sendKeys(int time,WebElement element , String string  )
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(string);
		
	}
	
	public static void checkBox( int time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	
	public static void enterDOB(int time,WebElement element ,String day,String month,String year)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(day);
		element.sendKeys(month);
		element.sendKeys(year);
	}
	
	public  static String GenerateMobileno() {
		String Mobileno = RandomStringUtils.randomNumeric(10);
		return Mobileno;

	}

	public static String generateEmail() {
		RandomStringUtils rm = new RandomStringUtils();
		String email = rm.randomAlphabetic(5) + "@gmail.com";
		return email;
	}

	public static String GeneratePassword() {
		String password = RandomStringUtils.randomAlphanumeric(8);
		return password;
	}

}
