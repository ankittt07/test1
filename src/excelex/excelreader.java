package excelex;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelreader {

	public static void main(String[] args) 
	{
	
		try
		{
			FileInputStream fs = new FileInputStream("C:\\\\Users\\\\ankit\\\\Desktop\\\\studentdata.xls");
			
			HSSFWorkbook book = new HSSFWorkbook(fs);
			//HSSFSheet sheet = book.getSheetAt(0);
			HSSFSheet sheet = book.getSheet("Sheet1");
			
			int sc,rc,cc;
			//sc = book.getNumberOfSheets();
			rc = sheet.getPhysicalNumberOfRows();
			//cc = sheet.getRow(0).getPhysicalNumberOfCells();
			
			//System.out.println(sc);
			//System.out.println(rc);
			//System.out.println(cc);
			
			for(int i=0; i<rc; i++)
			{
				HSSFRow row = sheet.getRow(i);
				
				HSSFCell cell = row.getCell(0);
				System.out.print(cell.getStringCellValue()+"\t");
				
				cell = row.getCell(1);
				System.out.println(cell.getStringCellValue());
				
			}
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}
}

