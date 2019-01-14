package com.qa.freelance.firstcry.com.ExcelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.freelance.firstcry.com.Base.TestBase;

public class DataProvider extends TestBase{

	
public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelSheet\\testdata.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	
/*	//use getTestData(String sheetName) method in TestNGs @DataProvider--->respective test case data provider method.
	//pass sheet name to getTestData(String sheetName) method .
	//in test case, Number of Parameters should be same as number of column in excel file .
	// we are getting the data from Excel Sheet and storing it in 2D object array i.e Object[][].
	//it will take whole row data one by one from 2nd row (like 1,0 1,1 1,2...so on)...then 3rd row...then 4th row ..and so on
	//return type should be 2D Object[][] array because in excel sheet any kind of data is available like string, int etc.
	//in @DataProvider method also return type should be 2D Object[][] array .
	//and then in @Test(DataProvider ="method name") annotation you have to give the respective testcase data provider method
	
*/
	//for getting data from excel sheet
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException   
	{
		FileInputStream file = null;
		try {
			
			file = new FileInputStream(TESTDATA_SHEET_PATH);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			
			book = WorkbookFactory.create(file);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" + sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
}
