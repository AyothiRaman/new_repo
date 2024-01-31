package com.pdfFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.createPdfService.PdfUtilsService","com.controller.PdfController"})
public class PdfApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(PdfApplication.class, args);
	}

	

}
