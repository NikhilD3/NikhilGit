package ExcelSheetRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\Users\\Nikil\\eclipse-workspace\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int totalnumberofrows = mysheet.getLastRowNum(); // will give total row count
		int rowscount = totalnumberofrows;
		System.out.println(rowscount);
		
		short totalnumberofcells = mysheet.getRow(totalnumberofrows).getLastCellNum();
		int cellcount = totalnumberofcells-1;
		System.out.println(cellcount);
		
		for(int i=0;i<=rowscount;i++) // rows count outer loop
		{
			for(int j=0;j<=cellcount;j++) // cell count inner loop
			{
				Cell cellvalue = mysheet.getRow(i).getCell(j);
				CellType celldatatype = cellvalue.getCellType();
				
				if(celldatatype==CellType.STRING)
				{
					String value = cellvalue.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(celldatatype==CellType.NUMERIC)
				{
					double value = cellvalue.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(celldatatype==CellType.BOOLEAN)
				{
					boolean value = cellvalue.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(celldatatype==CellType.BLANK)
				{
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println();
		}

	}

}
