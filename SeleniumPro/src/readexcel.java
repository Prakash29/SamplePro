import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class readexcel {

	public static void main(String[] args) throws IOException 
	{
	
		 FileInputStream fs =new FileInputStream("‪D:\\demo.xlsx");
		 
HSSFWorkbook WK=new HSSFWorkbook(fs);
HSSFSheet sheet = WK.getSheetAt(0);
Iterator<Row> rowIterator = sheet.iterator();

while (rowIterator.hasNext())
{
    // Get Each Row
    Row row = rowIterator.next();
	}

	}}
