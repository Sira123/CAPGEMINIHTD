package com.actitime.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.SuperTestScript;

public class ActiveProjectsAndCustomersPage {
	
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;

	@FindBy(className="successmsg")
	private WebElement successMessage;
	
	public ActiveProjectsAndCustomersPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnAddNewCustomer()
	{
		addNewCustomerButton.click();
	}
	
	public String getSuccessMessage()
	{
		return successMessage.getText();
	}
	
}





