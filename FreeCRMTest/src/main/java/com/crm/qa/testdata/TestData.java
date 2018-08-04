package com.crm.qa.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {

	public static void main(String[] args) throws Exception {
	File f= new File("C:/Users/user/Desktop/MortalName.xlsx");
	FileInputStream fi= new FileInputStream(f);;
	Workbook w= new WorkbookFactory().create(fi);;
	Sheet s=w.getSheet("Sheet1");
	Row r=s.getRow(1);
	Cell c=r.getCell(r.getLastCellNum());
	String name=c.getStringCellValue();
	System.out.println(name);
	}

}
