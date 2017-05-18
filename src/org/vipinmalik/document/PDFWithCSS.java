package org.vipinmalik.document;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringBufferInputStream;

import org.w3c.tidy.Tidy;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.exceptions.CssResolverException;

public class PDFWithCSS {

	public void createPDF() throws DocumentException, CssResolverException {

		try {
			// step 1
			Document document = new Document();

			// step 2
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("docstore/PDFFromHTML.pdf"));

			writer.setInitialLeading(12.5f);

			// step 3
			document.open();
			
			String htmlstring = convertHtmlToXhtml(readFromFile("resources/test.html"));

			ByteArrayInputStream html = new ByteArrayInputStream(htmlstring.getBytes());
			
			String cssString = readFromFile("resources/reit_common_print.css");

			ByteArrayInputStream css = new ByteArrayInputStream(cssString.getBytes());

			XMLWorkerHelper.getInstance().parseXHtml(writer, document, html, css);

			// step
			document.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private String readFromFile (String filePath) {
		String htmlString = "";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			StringBuilder builder = new StringBuilder();
			
			String line = reader.readLine();
			
			while (line != null) {
				builder.append(line);
				line = reader.readLine();
			}
			
			htmlString = builder.toString();
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return htmlString;
	}
	
	public static String convertHtmlToXhtml(String html) {
	    Tidy tidy = new Tidy(); 
	    tidy.setXHTML(true); 
	    tidy.setDocType("omit");
	    InputStream inputStream = new StringBufferInputStream(html);
	    OutputStream outputStream = new ByteArrayOutputStream();
	    tidy.parse(inputStream, outputStream); 
	    return outputStream.toString();
	}
}