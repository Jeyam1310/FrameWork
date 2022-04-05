package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExample {
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\Users\\jeyam\\OneDrive\\Desktop\\Datas.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fis);
	
	Sheet sheet = w.getSheet("sheet1");
	
	Row row = sheet.getRow(3);
	System.out.println("*******************************");
	//For getting particular cell values using cell's index position
	Cell cell = row.getCell(1);
	
	System.out.println("Total number of cell in row1:"+cell);
	System.out.println("*******************************");
	//For checking how many rows 
	int rows = sheet.getPhysicalNumberOfRows();
	System.out.println("Total number of rows in sheet:"+rows);
	System.out.println("*******************************");
	//For checking in rows how many cell's are in
	int cells = row.getPhysicalNumberOfCells();
	System.out.println("Total number of cell in rows:"+cells);
	System.out.println("*******************************");
	//To get all cell particular
	Row row2 = sheet.getRow(3);
	//Iterate cells
	for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
		Cell cell2 = row2.getCell(i);
		System.out.println(cell2);
		
	}
	System.out.println("*******************************");
	//Iterate all Rows
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row3 = sheet.getRow(i);
		//Get the each row
		for (int j = 0; j < row3.getPhysicalNumberOfCells(); j++) {
			//Get the each cell 
			Cell cell2 = row3.getCell(j);
			System.out.println(cell2);
		}
		
	}
	
	

}
	
	
	
}
