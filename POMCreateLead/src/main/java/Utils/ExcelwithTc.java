package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelwithTc {

	public static String[][] runExcelData(String filename) throws IOException {
		XSSFWorkbook book=new XSSFWorkbook("./Data/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		int cellNum = sheet.getRow(0).getLastCellNum();
		String[][] data1=new String[rowNum][cellNum];
			for (int i = 1; i <=rowNum; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j <cellNum; j++) {
					
					String value = row.getCell(j).getStringCellValue();
					System.out.println(value);
					data1[i-1][j]=value;
				}
				
			
		}
			book.close();

			return data1;
	}

}
