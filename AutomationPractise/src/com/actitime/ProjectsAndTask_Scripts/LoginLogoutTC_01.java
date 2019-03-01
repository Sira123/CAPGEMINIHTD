package com.actitime.ProjectsAndTask_Scripts;

import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.SuperTestScript;
import com.actitime.UtilLibrary.ValidationOperation;
import com.actitime.WebPages.LoginPage;
import com.actitime.WebPages.OpenTaskPage;

public class LoginLogoutTC_01 extends SuperTestScript
{
	@Test
	public void testLoginLogoutTC_01()
	{
		//STEP 1 FETCH ALL NECCESARY DATA
	String username=ExcelOperation.readData("TC_01",1,0);
	String password=ExcelOperation.readData("TC_01",1,1);
	String expectedResult=ExcelOperation.readData("TC_01",1,2);
	//Step 2 create all neccesary page Objects
	LoginPage lp=new LoginPage();
	OpenTaskPage otp=new OpenTaskPage();
	
	//Step 3 convert testcase into testSCript
	lp.enterUsername(username);
	lp.enterPassword(password);
	lp.clickOnLoginButton();
	String actualResult = otp.retrieveTitleOfWebPage();
	otp.clickOnLogoutButton();
	//STep 4 validate the TestScript
	
	String status = ValidationOperation.verify(expectedResult, actualResult);
	//Step 5 write data into Excel
	ExcelOperation.writeData("TC_01",1,3,actualResult);
	ExcelOperation.writeData("TC_01",1,4,status);
	
	
	
	
	
	
		
		
	}

}
