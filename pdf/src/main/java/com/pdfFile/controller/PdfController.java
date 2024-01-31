package com.pdfFile.controller;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;


import com.pdfFile.createPdfService.PdfUtilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itextpdf.text.DocumentException;

@Controller
@RequestMapping("/api")
public class PdfController {


    @Autowired
    PdfUtilsService pdfUtilsService;

    @GetMapping("/create")
    public ResponseEntity<ByteArrayInputStream> createPdf() throws IOException, DocumentException, URISyntaxException {
        ByteArrayInputStream pdf = pdfUtilsService.pdfWriter();

        return ResponseEntity.ok()
                .header("hello", "world")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }


}
