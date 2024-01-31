package writeDataOnExcel.com;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataOnXcel {
	
	// first we need to create Workbook-->sheet-->Row-->cell
	
	
	XSSFWorkbook workBook = new XSSFWorkbook();
	
	XSSFSheet sheet = workBook.createSheet("Countries Information");
	
}
