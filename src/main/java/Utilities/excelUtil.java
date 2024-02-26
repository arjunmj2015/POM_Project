package Utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excelUtil {
	
     public static String  TESTDATA_SHEET_PATH ="C:\\Users\\2174174\\eclipse-workspace\\POMproject\\src\\main\\java\\Utilities\\dataProvider.xlsx";
     
     static Workbook book;
     static Sheet sheet;
     
     public static Object[][] getTestData(String sheetName) {
    	 FileInputStream  file = null;
    	 try {
    		file =new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
    	 try {
    		 book=WorkbookFactory.create(file);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	 sheet=book.getSheet(sheetName);
    	 Object[][] data=new Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];
    	 int row=sheet.getLastRowNum()+1;
    	 int col=sheet.getRow(0).getLastCellNum();
    	 for(int i=1;i<row;i++) {
    		 for(int j=0;j<col;j++) {
    			 data[i][j]=sheet.getRow(i).getCell(j).toString();
    		 }
    	 }
    	 return data;
    	 

    	
    	 
     }
     
     
     
     
}
