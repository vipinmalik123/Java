package org.vipinmalik.base;

import java.util.Scanner;

import org.vipinmalik.document.HTMLToPDF;
import org.vipinmalik.document.PDFWithCSS;
import org.vipinmalik.document.PdfDocumentExample;
import org.vipinmalik.document.PdfWithBackgroundExample;
import org.vipinmalik.document.PdfWithTableBackgroundExample;

import com.itextpdf.text.DocumentException;
import com.itextpdf.tool.xml.exceptions.CssResolverException;

public class baseController {
	public static void main (String[] args) {
		System.out.println("Hi... Please choose an option");
		
		System.out.println("Type 1 - To create a simple pdf file.");
		
		System.out.println("Type 2 - To create a simple pdf file with pattern background.");
		
		System.out.println("Type 3 - To create a simple pdf file with a table having pattern background.");
		
		System.out.println("Type 4 - To create a simple pdf file from HTML.");
		
		System.out.println("Type 5 - To create a simple pdf file from HTML with external css.");
		
		Scanner sc = new Scanner(System.in);
		
		Integer choice = sc.nextInt();
		
		sc.close();
		
		if (choice == 1) {
			String pdfFilePath = "docstore/helloWorld.pdf";
			
			PdfDocumentExample pdfDoc = new PdfDocumentExample();
			
			pdfDoc.createPdfDocument(pdfFilePath);
		} else if (choice == 2) {
			String pdfFilePath = "docstore/PDFWithBackground.pdf";
			
			PdfWithBackgroundExample pdfDoc = new PdfWithBackgroundExample();
			
			pdfDoc.createPdfDocument(pdfFilePath);
		} else if (choice == 3) {
			String pdfFilePath = "docstore/PDFWithTableBackground.pdf";
			
			PdfWithTableBackgroundExample pdfDoc = new PdfWithTableBackgroundExample();
			
			pdfDoc.createPdfDocument(pdfFilePath);
		} else if (choice == 4) {
			String pdfFilePath = "docstore/PDFFromHTML.pdf";
			
			String htmlFilePath = "resources/test.html";
			
			HTMLToPDF pdfDoc = new HTMLToPDF();
			
			System.out.println("Selected : 4");
			
			pdfDoc.convertHTMLToPDF(pdfFilePath, htmlFilePath);
		} else if (choice == 5) {
			PDFWithCSS pdfDocNew = new PDFWithCSS();
			
			System.out.println("Selected : 5");
			
			try {
				pdfDocNew.createPDF();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CssResolverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		} else {
			System.out.println("Incorrect Choice.");
		}
	}

}