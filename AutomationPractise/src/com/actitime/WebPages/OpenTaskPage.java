package com.actitime.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.SuperTestScript;

public class OpenTaskPage {
	
	
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustomersLink;
	
	
	public OpenTaskPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public String retrieveTitleOfWebPage()
	{
	
		String data = SuperTestScript.driver.getTitle();
		return data;
		
	}
	public void clickOnProjectsAndCustomersLink()
	{
		projectAndCustomersLink.click();
	}
	
	public void clickOnLogoutButton(){
		
		logoutButton.click();
		
		
	}
	

}
