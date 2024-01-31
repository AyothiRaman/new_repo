package pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
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

public class Pdf {
	public static void main(String[] args) {
	

		File filePath = new File("C:\\Users\\SSLTP11229\\Desktop\\data.pdf");

		PDDocument document;
		try {
			document = PDDocument.load(filePath);
			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			String pageText = pdfTextStripper.getText(document);
			String[] lines = pageText.split("\\r?\\n\\v");

			String regexPattern = String.join("|", lines);
			regexPattern = "\\b(" + regexPattern + ")+";

			Pattern pattern = Pattern.compile(regexPattern);

			Matcher matcher = pattern.matcher(pageText);

			String result = matcher.replaceAll("$1");
			System.out.println(result);

			List<String> separator = new ArrayList<String>();
			List<String> secound_separator = new ArrayList<String>();

			String[] splited = result.split("\\v\n");

			for (int i = 97; i <= 126; i++) {

				separator.add(splited[i]);
			}

			for (int i = 241; i <= 270; i++) {

				secound_separator.add(splited[i]);

			}

			Workbook workbook = new XSSFWorkbook();

			// Create a sheet
			Sheet sheet = workbook.createSheet("Sheet1");

			StringBuilder sb = new StringBuilder();

			List<String> CollectedPage = new ArrayList<String>();
			for (int total = 0; total <= separator.size() - 1; total++) {
				sb.append(separator.get(total));
				sb.append(" " + secound_separator.get(total));
				CollectedPage.add(sb.toString());
				sb.setLength(0);

			}

			for (int i = 0; i < CollectedPage.size() - 1; i++) {
				String concated = CollectedPage.get(i).replaceAll("\\s+\\v", " ");
				
				String[] dd = concated.split("\\w+ \\w+ \\d+ \\Í (.*?) \\d+\\.\\d+");
				
				
				for(String k : dd) {
					System.out.println("hhhhhhhhhhhhhhhhh" + k);
					
				}

				Row row = sheet.createRow(i);

				// Merge words with spaces into a single word
				String mergedText = concated.replaceAll("\\s+([A-Za-z])", "$1");

				//System.out.println(mergedText);

				String text[] = mergedText.split(" ");

				for (int j = 0; j <= text.length - 1; j++) {
					Cell cell = row.createCell(j);
					cell.setCellValue(text[j]);
				}

			}
			try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\SSLTP11229\\Desktop\\Regexfile.xlsx")) {
				workbook.write(fileOut);
				System.out.println("Excel file written successfully.");
			} catch (IOException e) {
				System.err.println("Error writing Excel file: " + e.getMessage());
			}

			// Close the workbook
			try {
				workbook.close();
			} catch (IOException e) {
				System.err.println("Error closing the workbook: " + e.getMessage());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
