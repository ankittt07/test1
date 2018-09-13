package excelex;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelread {

	public static void main(String[] args) {
		
	try {
		FileInputStream fs=new FileInputStream("C:\\Users\\ankit\\Desktop\\product.xls");
		HSSFWorkbook book=new HSSFWorkbook(fs);
		HSSFSheet sheet = book.getSheet("Sheet1");
	    int rc;
		rc = sheet.getPhysicalNumberOfRows();
		WebDriver driver=new ChromeDriver();
		for(int i=1; i<rc; i++)
		{
			HSSFRow row = sheet.getRow(i);
			
			HSSFCell cell = row.getCell(1);
			System.out.print(cell.getStringCellValue()+"\t");
			
			driver.get(cell.getStringCellValue());
			
			cell = row.getCell(0);
			
			System.out.println(cell.getStringCellValue());
						
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.id("nav-search")).click();
			
			
			
			
			
		}
		
	} catch (Exception e) {
		
	}	

}
}
