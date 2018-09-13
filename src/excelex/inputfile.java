package excelex;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class inputfile {

	public static void main(String[] args) {
		try
		{
		FileInputStream fs=new FileInputStream("D:\\input.xls");
		HSSFWorkbook book=new HSSFWorkbook(fs);
		HSSFSheet sheet=book.getSheet("sheet 1");
		int rc;
		rc=sheet.getPhysicalNumberOfRows();
		System.out.println(rc);
		HSSFRow row=sheet.getRow(0);
		HSSFCell cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());

	}
		catch (Exception e) {
			// TODO: handle exception
		}

}
}
