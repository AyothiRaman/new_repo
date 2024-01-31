package com.pdfFile.createPdfService;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionURI;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import org.springframework.stereotype.Service;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class PdfServiceUtils {

    Document document = new Document(PageSize.A4);

    public  ByteArrayInputStream pdfWriter() throws IOException, DocumentException, URISyntaxException {


        PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\SSLTP11229\\Desktop\\text\\World.pdf"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        final byte[] bytes = out.toByteArray();
        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk(" WELCOME SUN ", font);

        document.add(chunk);

        // To add a Image
        Image img = Image.getInstance("C:\\Users\\SSLTP11229\\Desktop\\image\\sun.png");

        document.add(new Paragraph("The Sun is a 4.5 billion-year-old yellow dwarf star – " +
                "a hot glowing ball of hydrogen and helium – at the center of our solar system"));


        document.add(img);

//        float[] columnWidth ={200f,200f,200f,200f};
//        Table table = new Table(columnWidth);
//        table.addCell(new Cell().add("id"));
//        table.addCell(new Cell().add("first name"));
//        table.addCell(new Cell().add("last name"));
//        table.addCell(new Cell().add("email"));
//        table.addCell(new Cell().add("number"));

        PDBorderStyleDictionary borderULine = new PDBorderStyleDictionary();
        borderULine.setStyle(PDBorderStyleDictionary.STYLE_UNDERLINE);
        PDAnnotationLink txtLink = new PDAnnotationLink();
        txtLink.setBorderStyle(borderULine);
       // txtLink.setColour(colourBlue);

// add an action
        PDActionURI action = new PDActionURI();
        action.setURI("www.google.com");
        txtLink.setAction(action);

//
//        contentStream.beginText();
//        contentStream.moveTextPositionByAmount(400, y-30);
//        contentStream.drawString(txtLink);----error
//        contentStream.endText();






        document.close();
        System.out.println("Done");

        return new ByteArrayInputStream(bytes);

    }




//    public ByteArrayInputStream insertingTable() throws IOException, DocumentException, URISyntaxException {
//       // Document document = new Document();
//        PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\SSLTP11229\\Desktop\\files\\table.pdf"));
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        final byte[] bytes = out.toByteArray();
//
//        document.open();
//
//        PdfPTable table = new PdfPTable(3);
//        addTableHeader(table);
//        addRows(table);
//        addCustomRows(table);
//
//        document.add(table);
//        document.close();
//        return new ByteArrayInputStream(bytes);
//    }
    private ByteArrayInputStream addTableHeader(PdfPTable table) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        final byte[] bytes = out.toByteArray();

        Stream.of("column header 1", "column header 2", "column header 3")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    table.addCell(header);
                });
        return new ByteArrayInputStream(bytes);


    }

    private ByteArrayInputStream addRows(PdfPTable table) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        final byte[] bytes = out.toByteArray();

        table.addCell("row 1, col 1");
        table.addCell("row 1, col 2");
        table.addCell("row 1, col 3");

        return new ByteArrayInputStream(bytes);

    }
    private ByteArrayInputStream addCustomRows(PdfPTable table)
            throws URISyntaxException, BadElementException, IOException {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        final byte[] bytes = out.toByteArray();

        Path path = Paths.get(ClassLoader.getSystemResource("Java_logo.png").toURI());
        Image img = Image.getInstance(path.toAbsolutePath().toString());
        img.scalePercent(10);

        PdfPCell imageCell = new PdfPCell(img);
        table.addCell(imageCell);

        PdfPCell horizontalAlignCell = new PdfPCell(new Phrase("row 2, col 2"));
        horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(horizontalAlignCell);

        PdfPCell verticalAlignCell = new PdfPCell(new Phrase("row 2, col 3"));
        verticalAlignCell.setVerticalAlignment(Element.ALIGN_BOTTOM);
        table.addCell(verticalAlignCell);
        return new ByteArrayInputStream(bytes);

    }

    public void insertingText() throws IOException {

        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        contentStream.setFont(PDType1Font.COURIER, 12);
        contentStream.beginText();
        contentStream.showText("Hello World");
        contentStream.endText();
        contentStream.close();

        document.save("pdfBoxHelloWorld.pdf");
        document.close();

    }





   
}