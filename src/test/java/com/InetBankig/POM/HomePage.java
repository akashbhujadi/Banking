package com.InetBankig.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver localDriver ;
	
	
	
	
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	@CacheLookup
	private WebElement newCustomerElement;
	
	@FindBy(xpath="//input[@name='name']")
	@CacheLookup
	private WebElement customerNameElement;
	
	@FindBy(xpath="//input[@value='m']")
	@CacheLookup
	private WebElement maleGenderElement;
	
	@FindBy(xpath="//input[@value='f']")
	@CacheLookup
	private WebElement femaleGenderElement;
	
	@FindBy(xpath="//input[@id='dob']")
	@CacheLookup
	private WebElement dobElement;
	
	@FindBy(xpath="//textarea[@name='addr']")
	@CacheLookup
	private WebElement addressElement;
	
	@FindBy(xpath="//input[@name='city']")
	@CacheLookup
	private WebElement cityElement;
	
	@FindBy(xpath="//input[@name='state']")
	@CacheLookup
	private WebElement stateElement;
	
	@FindBy(xpath="//input[@name='pinno']")
	@CacheLookup
	private WebElement pinElement;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	@CacheLookup
	private WebElement mobileElement;
	
	@FindBy(xpath="//input[@name='emailid']")
	@CacheLookup
	private WebElement emailElement;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	private WebElement passwordElement;
	
	@FindBy(xpath="//input[@name='sub']")
	@CacheLookup
	private WebElement submitElement;
	
	public WebElement getNewCustomerElement() {
		return newCustomerElement;
	}

	public WebElement getCustomerNameElement() {
		return customerNameElement;
	}

	public WebElement getMaleGenderElement() {
		return maleGenderElement;
	}

	public WebElement getFemaleGenderElement() {
		return femaleGenderElement;
	}

	public WebElement getDobElement() {
		return dobElement;
	}

	public WebElement getAddressElement() {
		return addressElement;
	}

	public WebElement getCityElement() {
		return cityElement;
	}

	public WebElement getStateElement() {
		return stateElement;
	}

	public WebElement getPinElement() {
		return pinElement;
	}

	public WebElement getMobileElement() {
		return mobileElement;
	}

	public WebElement getEmailElement() {
		return emailElement;
	}

	public WebElement getPasswordElement() {
		return passwordElement;
	}

	public WebElement getSubmitElement() {
		return submitElement;
	}

	public HomePage (WebDriver rempetDriver)
	{
		localDriver=rempetDriver;
		PageFactory.initElements(rempetDriver, this);
	}

}
