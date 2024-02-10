package com.OrangeHRM.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_driven_testing {
public static String ddt(String sh,int r,int c)
{
	FileInputStream fis;
	Workbook book=null;
	try {
		fis=new FileInputStream("./excel/testdata.xlms");
		book = WorkbookFactory.create(fis);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 Sheet sheet = book.getSheet(sh);
	 Row ro = sheet.getRow(r);
	 Cell cel = ro.getCell(c);
	 String value = cel.toString();
	 return value;
}
}
