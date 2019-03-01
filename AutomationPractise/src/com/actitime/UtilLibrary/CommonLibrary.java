package com.actitime.UtilLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonLibrary {
	
	
	public static void selectDropdownByIndex(WebElement dropdownAddress, int indexNumber)
	{
	   Select s1=new Select(dropdownAddress);
	   s1.selectByIndex(indexNumber);
	}
	
	public static void selectDropdownByVisibleText(WebElement dropdownAddress, String visibleText)
	{
		  Select s1=new Select(dropdownAddress);
		   s1.selectByVisibleText(visibleText);
	}
	
	public static void selectDropdownByValue(WebElement dropdownAddress, String value)
	{

		  Select s1=new Select(dropdownAddress);
		  s1.selectByValue(value);
	}
	
	public static void movingTheCursorToDesiredLocation(WebElement elementLocation)
	{
		Actions a1=new Actions(SuperTestScript.driver);
		a1.moveToElement(elementLocation).build().perform();
		
	}
	public static void clickOnOkButtonOnAlertPopup()
	{
	   SuperTestScript.driver.switchTo().alert().accept();
		
	}

	
	public static void clickOnCancelButtonOnAlertPopup()
	{
		SuperTestScript.driver.switchTo().alert().dismiss();
	}
	
	public static String getTheTextFromPopup()
	{
	  return SuperTestScript.driver.switchTo().alert().getText();
	}
	
	public static void takeScreenshot(String testScriptmethodName)
	{
		EventFiringWebDriver efw=new EventFiringWebDriver(SuperTestScript.driver);
		File source=efw.getScreenshotAs(OutputType.FILE);
		File target=new File(".//src//resource//failedTestScriptScreenshots//"+testScriptmethodName+".jpg");
		
			try {
				FileUtils.moveFile(source,target);
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
			
			}

		
	}

}
