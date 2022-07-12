package ExcelSheetRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\Users\\Nikil\\eclipse-workspace\\TestCase (2).xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("26 MAR B Trace");
		
		System.out.println(mysheet.getRow(1).getCell(3).getNumericCellValue());

	}

}
