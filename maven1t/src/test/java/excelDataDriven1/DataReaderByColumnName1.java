package excelDataDriven1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReaderByColumnName1
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\nstar\\Desktop\\XML data.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Infodata");
		XSSFRow	row=sheet.getRow(0);
		XSSFCell cell= null;
		
		int cellIndex = -1;
		
		
		/*row= sheet.getRow(1);
		cell=row.getCell(cellIndex);
		
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		row=sheet.getRow(2);
		cell=row.getCell(cellIndex);
		String value1 = cell.getStringCellValue();
		System.out.println(value1);*/
		for(int i=0; i <row.getLastCellNum(); i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase("email"))
			cellIndex=i;
			
		}
		
		for(int j=0;j<sheet.getLastRowNum()+1; j++) 
		{
			
			row= sheet.getRow(j);
			cell=row.getCell(cellIndex);
			
			String value = cell.getStringCellValue();
			System.out.println(value);
			
		}

		wb.close();
		fis.close();
	}
}
