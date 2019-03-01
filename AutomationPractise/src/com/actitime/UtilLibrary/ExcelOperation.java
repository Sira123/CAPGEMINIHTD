package com.actitime.UtilLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation
{

	public static String readData(String sheetName, int rowNum ,int cellNum)
	{
		try{
        FileInputStream fis=new FileInputStream(".//src//resource//testdata//testdata.xlsx");
        Workbook w1=WorkbookFactory.create(fis);
       String data=w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
        return data;
		}
		catch(Exception rv)
		{
			
			System.out.println("exception occured");
			return "";
			
		}
		
	}
	
	public static void writeData(String sheetName, int rowNum, int cellNum, String data)
	{
	 	try
	 	{
		FileInputStream fis=new FileInputStream(".//src//resource//testdata//testdata.xlsx");
        Workbook w1=WorkbookFactory.create(fis);
        w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
        FileOutputStream fos=new FileOutputStream(".//src//resource//testdata//testdata.xlsx");
        w1.write(fos);
	 	}
	 	catch(Exception rv)
	 	{
	 		
	 		System.out.println("exception occured");
	 	}
     
	}
	
	public static long readNumericData(String sheetName, int rowNum, int cellNum)
	{
        try{
		FileInputStream fis=new FileInputStream("G:\\QspidersPanjaGutta\\testdata.xlsx");
        Workbook w1=WorkbookFactory.create(fis);
       long i = (long)w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue(); 
       return i;
        }
        catch(Exception rv)
        {
        	return 0;
        	
        }
	}
}