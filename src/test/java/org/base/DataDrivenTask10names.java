package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.enums.ValuedEnum;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class DataDrivenTask10names {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jeyam\\OneDrive\\Desktop\\Datas.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheet = w.getSheet("sheet2");
		
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) 
		{
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				int type = cell.getCellType();
				
				
				
				switch (type) {
				
				case 1:
					
					String data = cell.getStringCellValue();
					System.out.println(data);
					break;

				case 2:
					if(DateUtil.isCellInternalDateFormatted(cell))
					{
						String dataInfo = new SimpleDateFormat("DD-MM-YYYY").format(cell.getDateCellValue());
						System.out.println(dataInfo);
						/*SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
						String dateInfo = dateFormat.format("dcv");
						System.out.println(dateInfo);*/
						
						
					}else {
						double d = cell.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String string = b.toString();
						System.out.println(string);
						
						
					}
				
				default:
					break;
				}
			}
			System.out.println("******************************");
		}
	}
}
