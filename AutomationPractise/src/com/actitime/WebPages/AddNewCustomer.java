package com.actitime.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.SuperTestScript;

public class AddNewCustomer {

	@FindBy(name="name")
	private WebElement customerNameTextField;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
	
	public AddNewCustomer()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	
	public void enterCustomerName(String customerName)
	{
		customerNameTextField.sendKeys(customerName);
		
	}
	public void clickOnCreateButton()
	{
		createCustomerButton.click();
	}
	
	
}
