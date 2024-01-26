package com.SwagLab.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is the generic class to read data from external resource file
 * @author tamkeen
 * 
 */

public class FileLib {
	
	
	/**
	 * This is the generic method to read data from property file 
	 * @author tamkeen
	 * @param key
	 * @throws IOException 
	 */
	
	public String getPropertyFile(String key) throws IOException {
		
		FileInputStream f= new FileInputStream("./src/test/resources/testdata/testSwag.txt");
		
		Properties p =new Properties();
		p.load(f);
	String key1 = p.getProperty(key);
		return key1;
	}
	
/**
 * This method is to read data from excel file 
 * @author tamkeen
 * @param sheet
 * @param row
 * @param cell
 * @throws IOException 
 * @throws EncryptedDocumentException 
 */
	public String getExcelFile(String sheet,int row, int cell) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream f1= new FileInputStream("./src/test/resources/testdata/testdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(f1);
		String data= wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
		
	}
}
