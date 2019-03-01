package com.actitime.ProjectsAndTask_Scripts;

import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.SuperTestScript;
import com.actitime.UtilLibrary.ValidationOperation;
import com.actitime.WebPages.ActiveProjectsAndCustomersPage;
import com.actitime.WebPages.AddNewCustomer;
import com.actitime.WebPages.LoginPage;
import com.actitime.WebPages.OpenTaskPage;

public class CreateCustomerTC_02 extends SuperTestScript
{
     @Test
	public void testCreateCustomerTC_02()
	{
		
    	 
    	 //Step 1 fetch neccessary data
    String username=ExcelOperation.readData("TC_02",1,0);
    String password=ExcelOperation.readData("TC_02",1,1);
    String customerName=ExcelOperation.readData("TC_02",1,2);
    String expectedResult=ExcelOperation.readData("TC_02",1,3);
    //Step 2
    LoginPage lp=new LoginPage();
    OpenTaskPage otp=new OpenTaskPage();
    ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
    AddNewCustomer anc=new AddNewCustomer();
    //Step 3 
    lp.enterUsername(username);
    lp.enterPassword(password);
    lp.clickOnLoginButton();
    otp.clickOnProjectsAndCustomersLink();
    apcp.clickOnAddNewCustomer();
    anc.enterCustomerName(customerName);
    anc.clickOnCreateButton();
    String actualResult = apcp.getSuccessMessage();
    otp.clickOnLogoutButton();
    //Step 4
    String status=ValidationOperation.verify(expectedResult, actualResult);
    //Step 5
    ExcelOperation.writeData("TC_02",1,4,actualResult);
    ExcelOperation.writeData("TC_02",1,5,status);
    
    
    	 
	}
	
}
