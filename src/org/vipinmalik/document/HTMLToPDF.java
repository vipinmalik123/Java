package org.vipinmalik.document;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.html.simpleparser.HTMLWorker;
import com.lowagie.text.html.simpleparser.StyleSheet;
import com.lowagie.text.pdf.PdfWriter;

public class HTMLToPDF {
	Document doc;
	
	public void convertHTMLToPDF (String filepath, String sourceFilePath) {
		try {
			this.doc = new Document();
			
			PdfWriter.getInstance(this.doc, new FileOutputStream(filepath));

			doc.open();
			
			String htmlString = readFromFile(sourceFilePath);
			
			HTMLWorker worker = new HTMLWorker(doc);
			
			StyleSheet sh = new StyleSheet();
			
			// add styles
			
			worker.setStyleSheet(sh);
			
			worker.parse(new StringReader(htmlString));
			
			doc.close();
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
}