package Tempp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {

	public static void main(String [] hj) throws Exception {
		readDta(0);
		
	}
	public static void readDta(int CellNO) throws Exception {
		FileInputStream fi= new FileInputStream("C:\\Users\\user\\Desktop\\MkPlayers.xlsx");
		/*Workbook wk=new WorkbookFactory().create(fi);
		Sheet s=wk.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		String str= c.getStringCellValue();
		System.out.println(str);
		int lastCell= s.getRow(0).getLastCellNum();
		System.out.println(lastCell);
		int lastRow= s.getLastRowNum();
		System.out.println(lastRow);*/
		XSSFWorkbook hsss=new XSSFWorkbook(fi);
		XSSFSheet sheet=hsss.getSheet("Sheet1");
		Iterator<Row> rowit= sheet.iterator();
		ArrayList<String> listt= new ArrayList<String>();
		
		
		rowit.next();
		while (rowit.hasNext()) {
			//System.out.println(rowit.next().getCell(CellNO));
			listt.add(rowit.next().getCell(CellNO).toString());
			System.out.println("List::"+listt);
			
			
		}
	}

}
