package pomdemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\share\\Demo.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);
	}

}
