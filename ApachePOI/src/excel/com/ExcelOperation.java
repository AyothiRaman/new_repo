package excel.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {

	public static void main(String[] args) throws IOException {

		String filePath = ".\\ExcelFiles\\list-national-capitals-748j.xlsx";

		FileInputStream input = new FileInputStream(filePath);

		XSSFWorkbook workBook = new XSSFWorkbook(input);

		XSSFSheet sheet = workBook.getSheetAt(0);

		/*
		 * int rows = sheet.getLastRowNum(); // get the last row on the sheet int cols =
		 * sheet.getRow(1).getLastCellNum();
		 * 
		 * // using for loop we can read the data
		 * 
		 * for (int r = 0; r <= rows; r++) { // represents rows in a excel
		 * 
		 * XSSFRow row = sheet.getRow(r);
		 * 
		 * for (int c = 0; c < cols; c++) { // represents column in a excel
		 * 
		 * XSSFCell cell = row.getCell(c);
		 * 
		 * // the type of data should be different in excel, so we can choose that type
		 * 
		 * switch (cell.getCellType()) { case STRING:
		 * System.out.println(cell.getStringCellValue()); break;
		 * 
		 * case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
		 * 
		 * case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break; }
		 * System.out.println(" |  ");
		 * 
		 * } System.out.println(); }
		 */

		// by using iterator we can read the data from the excel file

		Iterator iterator = sheet.iterator();

		while (iterator.hasNext()) { // it will check the data if it present or not
			XSSFRow row = (XSSFRow) iterator.next(); // it will return the row object

			Iterator cellIterator = row.cellIterator(); // it will capture all the cell in the rows

			while (cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIterator.next();

				switch (cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;

				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;

				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}

	}
}
