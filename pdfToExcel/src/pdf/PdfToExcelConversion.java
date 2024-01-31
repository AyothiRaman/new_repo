package pdf;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.TableView.TableRow;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfToExcelConversion {

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
			String[] lines = pageText.split("\\r?\\v");

			String regexPattern = String.join("|", lines);
			regexPattern = "\\b(" + regexPattern + ")\\s+";

			Pattern pattern = Pattern.compile(regexPattern);

			Matcher matcher = pattern.matcher(pageText);

			String result = matcher.replaceAll("$1");
			
			
			
			
			
			
			//System.out.print(result);
			

			 //String[] stringArray = result.split("\t");

			 String fin =
			 result.replaceAll("(\\d+)\\??([^\\d]+)([A-Za-z]+)([A-Za-z]+\\d+\\.\\d+\\+\\d+\\.\\d+)([A-Za-z]+\\d+\\.\\d+%)([A-Za-z]+\\d+(,\\d{3})*(\\.\\d{3})*)\\+\\d+%([A-Za-z]+\\d+(,\\d{3})*(\\.\\d{3})*)",
			 "");
			 
			 
			String fin1 = result.replaceAll("\\s", "");
			
			String[] values = fin.split("(?<!UnitedStatesNorthAmerica)(?=[?+$%])|(?<=[?+$%])");

		     // Print the values
		     for (String value : values) {
		         System.out.print(value);
		     }
			
			
			// System.out.println(fin1);

			//String re = "(\\d+)\\??([^\\d]+)([A-Za-z]+)([A-Za-z]+\\d+\\.\\d+\\+\\d+\\.\\d+)([A-Za-z]+\\d+\\.\\d+%)([A-Za-z]+\\d+(,\\d{3})*(\\.\\d{3})*)\\+\\d+%([A-Za-z]+\\d+(,\\d{3})*(\\.\\d{3})*)";

			String re ="/t";
			Pattern pattern1 = Pattern.compile(re);
			Matcher matcher1 = pattern1.matcher(fin1);

			// System.out.println(matcher1);

			// System.out.println(matcher1.group(1));
//            while (matcher1.find()) {
//                System.out.println("Rank2023: " + matcher1.group(1));
//                System.out.println("Rank2022: " + matcher1.group(2));
//                System.out.println("Nation: " + matcher1.group(3));
//                System.out.println("BrandRegion: " + matcher1.group(4));
//                System.out.println("IndexScore2023: " + matcher1.group(5));
//                System.out.println("BrandValue2023(USDbn): " + matcher1.group(6));
//                System.out.println("BrandValueChange: " + matcher1.group(7));
//                System.out.println("BrandValue2022(USDbn): " + matcher1.group(8));
//                System.out.println("------------------------------");
//            }
            
            

			// System.out.println(result);

//            for (int i = 0; i < result.length(); i++) {
//            	
//                String[] columns = lines[i].split("\\s+");
//                if (columns.length > endColumn) {
//                    for (int j = startColumn; j <= endColumn; j++) {
//                        System.out.print(columns[j] + "\t");
//                    }
//                    System.out.println();
//                }
//            }
		}
	}

}