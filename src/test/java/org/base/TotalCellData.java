package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TotalCellData {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jeyam\\OneDrive\\Desktop\\Datas1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			//For getting all cell values
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
			//But at a time one by one run will possibile
			//if run both in below steps we get above answer otherwise individually
			
			/*//For getting coloumn values=cell0
			Cell cell2 = row.getCell(0);
			System.out.println(cell2);*/
			
			//For getting coloumn values=cell1
			/*Cell cell = row.getCell(1);
			System.out.println(cell);*/
			}
		}
}

