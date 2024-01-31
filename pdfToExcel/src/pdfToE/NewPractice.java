package pdfToE;

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
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File filePath = new File("C:\\\\Users\\\\SSLTP11229\\\\Desktop\\data.pdf");

		PDDocument document;
		try {
			document = PDDocument.load(filePath);
			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			String pageText = pdfTextStripper.getText(document);
			// System.out.println(pageText);
			String[] lines = pageText.split("\\r?\\n\\v");

//				for (String sun : lines) {
//					System.out.println(sun);
//				}

			String regexPattern = String.join("|", lines);
			regexPattern = "\\b(" + regexPattern + ")+";

			Pattern pattern = Pattern.compile(regexPattern);

			Matcher matcher = pattern.matcher(pageText);

			String result = matcher.replaceAll("$1");
			// System.out.println(result);

			List<String> separator = new ArrayList<String>();
			List<String> secound_separator = new ArrayList<String>();

			String[] splited = result.split("\\v\n");
			for (int i = 97; i <= 126; i++) {
				// System.out.println(splited[97]);
				separator.add(splited[i]);
			}
			// System.out.println(splitedd);
			for (String sun : separator) {
				// System.out.println(sun);
			}

			for (int i = 241; i <= 270; i++) {

				secound_separator.add(splited[i]);
				// splited[126]
			}

			for (String sun : secound_separator) {
				// System.out.println(sun);
			}
			// System.out.println(splited[126]);

			ArrayList<String> newList = new ArrayList<>();

			Workbook workbook = new XSSFWorkbook();

			// Create a sheet
			Sheet sheet = workbook.createSheet("Sheet1");

			// Create a row
//		        Row row = sheet.createRow(0);
//		        
//		        // Create a cell and set a string value
//		        Cell cell = row.createCell(0);

			StringBuilder sb = new StringBuilder();
//				int k=0;
//		        String[] values1 = separator.get(0).split("\\s+");
//		        for(int i =0;i<values1.length-1;i++) {
//		        	if(k==0) {
//		        		sb.append(values1[4]);
//			        	sb.append(values1[5]);		
//			        	k++;
//		        	}
//		        
//		        System.out.println(values1[i]);
//		        }
//		        System.out.println(sb.toString());
			// sb.append(separator.get(0));
			// sb.insert(separator.get(0).length(), secound_separator.get(0));
			// System.out.println(sb.toString());
			List<String> CollectedPage = new ArrayList<String>();
			for (int total = 0; total <= separator.size() - 1; total++) {
				sb.append(separator.get(total));
				sb.append(" " + secound_separator.get(total));
				CollectedPage.add(sb.toString());
				sb.setLength(0);
				// sb.insert(separator.get(total).length(), secound_separator.get(total));

			}
			// System.out.println(CollectedPage);
			String concated = CollectedPage.get(0).replaceAll("\\s+\\v", "");
			
	       
			
		

			        // Merge words with spaces into a single word
			      //  String mergedText = concated.replaceAll("([A-Za-z]+)\\s+([A-Za-z]+)\\s+([A-Za-z]+\\s+)", "$1$2$3");
			        
			        String mer = concated.replaceAll("\\s+([A-Za-z])", "$1");
			
		
			        String text[]=mer.split(" ");
	        		//concated.replaceAll("([A-Za-z]+)\\s+([A-Za-z]+)\\s+([A-Za-z]+\\s+)", "$1$2$3");

	     
	        for(int j=0;j<=text.length-1;j++) {
	        	Cell cell=row.createCell(j);
	        	cell.setCellValue(text[j]);
	        }
		
			
			try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\SSLTP11355\\Desktop\\Regexfile.xlsx")) {
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
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	

}
}
