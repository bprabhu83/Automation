package Techoil;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {

	@Test
	public Object [][] excelRead(String excelFile) throws InvalidFormatException, IOException {
		
		File file = new File("./TestData/"+excelFile+".xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);


		int Lastrowcount = sheet.getLastRowNum();

		int Lastcolcount = sheet.getRow(0).getLastCellNum();

		Object [][] data = new Object[Lastrowcount][Lastcolcount];

		for(int i=1;i<=Lastrowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<Lastcolcount;j++)
			{
				XSSFCell cell = row.getCell(j);
				//String output = cell.getStringCellValue();
				data[i-1][j] = cell.getStringCellValue();
				//System.out.println(output);
			}
		}
		workbook.close();
		return data;

	}
}
