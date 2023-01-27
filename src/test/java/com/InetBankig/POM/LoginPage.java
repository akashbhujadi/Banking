package com.InetBankig.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 private WebDriver localDriver ;
	
	public LoginPage (WebDriver rempetDriver)
	{
		localDriver=rempetDriver;
		PageFactory.initElements(rempetDriver, this);
	}
	
	
	@FindBy(xpath="//input[@name='uid']")
	@CacheLookup
	private WebElement userNameElement;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	private WebElement PasswordElement;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	@CacheLookup
	private WebElement loginButtonElement;
	
	@FindBy(xpath="//input[@name='btnReset']")
	@CacheLookup
	private WebElement resetButtonElement;

	public WebElement getUserNameElement() {
		return userNameElement;
	}

	
	public WebElement getPasswordElement() {
		return PasswordElement;
	}

	

	public WebElement getLoginButtonElement() {
		return loginButtonElement;
	}

	

	public WebElement getResetButtonElement() {
		return resetButtonElement;
	}

	
		
	
	
}


