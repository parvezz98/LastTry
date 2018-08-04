package Tempp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadAgain {
@Test
public void hy() throws Exception {
	FileInputStream fi= new FileInputStream("C:\\Users\\user\\Desktop\\MkPlayers.xlsx");
	/*Workbook wk= new WorkbookFactory().create(fi);
	Sheet sh=wk.getSheet("Sheet1");
	Row r= sh.getRow(1);
	Cell c=r.getCell(1);
	String strr=c.getStringCellValue();
	System.out.println(strr);
			*/
	XSSFWorkbook xw=new XSSFWorkbook(fi);
	XSSFSheet sht=xw.getSheet("Sheet1");
	Iterator<Row> rowit=sht.iterator();
	ArrayList<String> arlst= new ArrayList<String>();
	while (rowit.hasNext()) {
		arlst.add(rowit.next().getCell(0).toString());
	
		
	}
	System.out.println(arlst);
}
}
