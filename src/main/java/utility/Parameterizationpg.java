package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//D:\Arise\June-19\SwagLab1\src\test\resources
public class Parameterizationpg 
{

	public static String parameter1(String Sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Arise\\June-19\\SwagLab1\\src\\test\\resourcesTestData.xlsx");
		String value=WorkbookFactory.create(file).getSheet(Sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		return value;
	}
	
	public static double parameter2(String Sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Arise\\June-19\\SwagLab1\\src\\test\\resourcesTestData.xlsx");
		double value=WorkbookFactory.create(file).getSheet(Sheetname).getRow(rowno).getCell(cellno).getNumericCellValue();
		return value;
	}
}
