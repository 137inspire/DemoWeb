package UsingExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./resource/Book1.xlsx");
	Workbook wBook=WorkbookFactory.create(fis);
	 String s1data = wBook.getSheet("sheet1").getRow(7).getCell(3).getStringCellValue();
	
	 System.out.println(s1data);
	 wBook.getSheet("sheet1").getRow(7).getCell(2).setCellValue(s1data);
	 Sheet s1 = wBook.getSheet("sheet1");
	 double a = s1.getRow(5).getCell(5).getNumericCellValue();
	 double b = s1.getRow(5).getCell(6).getNumericCellValue();
	 System.out.print(a+"+"+b);
	 double c=a+b;
	 System.out.println(" = "+c);
	 s1.getRow(2).getCell(4).setCellValue(0);
	 s1.getRow(5).getCell(7).setCellValue(0);
}
}

