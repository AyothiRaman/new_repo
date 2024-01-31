
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewPdfReader {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\SSLTP11229\\Desktop\\data.pdf";
		int startPage = 0; // The page containing the table
		int endPage = 1; // The same page since it's just one page
		int startColumn = 0; // Starting column index (0-based)
		int endColumn = 13; // Ending column index (0-based)

		try {
			extractTableContent(filePath, startPage, endPage, startColumn, endColumn);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void extractTableContent(String filePath, int startPage, int endPage, int startColumn, int endColumn)
			throws IOException {

		try (PDDocument document = PDDocument.load(new File(filePath))) {
			PDFTextStripper pdfTextStripper = new PDFTextStripper();

			pdfTextStripper.setStartPage(startPage);
			pdfTextStripper.setEndPage(endPage);

			String pageText = pdfTextStripper.getText(document);
			String[] lines = pageText.split("\\r?\\n\\v");

			String regexPattern = String.join("|", lines);
			regexPattern = "\\b(" + regexPattern + ")\\s+";

			Pattern pattern = Pattern.compile(regexPattern);

			Matcher matcher = pattern.matcher(pageText);

			String result = matcher.replaceAll("$1");
			// System.out.println(result);

			List<String> separator = new ArrayList<String>();
			List<String> secound_separator = new ArrayList<String>();
			
			

			String[] splited = result.split("\\v\n");

			for (int i = 97; i <= 126; i++) {
				separator.add(splited[i]);
			}

			for (String sun1 : separator) {
				System.out.println(sun1);
			}

			for (int i = 241; i <= 270; i++) {

				secound_separator.add(splited[i]);

			}
			
			

			for (String sun2 : secound_separator) {
				System.out.println(sun2);
			}

			Workbook workbook = new XSSFWorkbook();

			Sheet sheet = workbook.createSheet("Sheet1");

			

			Cell cell = null;

			for (int i = 0; i <=secound_separator.size()-1; i++) {
				String[] str = secound_separator.get(i).split("\\s+");
				Row row = sheet.createRow(i);

				 int iterations = 10;
				for (int j = 0; j <= str.length-iterations; j++) {

					cell = row.createCell(j);

					cell.setCellValue(str[j]);
				}

				System.out.println(secound_separator.get(i));
			

			}

			try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\SSLTP11229\\Desktop\\output.xlsx")) {
				workbook.write(fileOut);
				System.out.println("Excel file written successfully.");
			} catch (IOException e) {
				System.err.println("Error writing Excel file: " + e.getMessage());
			}

			
			try {
				workbook.close();
			} catch (IOException e) {
				System.err.println("Error closing the workbook: " + e.getMessage());
			}
		}
	}

}
