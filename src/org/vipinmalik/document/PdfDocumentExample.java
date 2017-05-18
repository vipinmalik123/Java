package org.vipinmalik.document;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfWriter;
import org.vipinmalik.document.DocumentElement;

public class PdfDocumentExample {
	protected Document doc;
	
	public PdfDocumentExample (){
		this.doc = new Document();
	}
	
	public void createPdfDocument (String filepath) {
		try {
			PdfWriter.getInstance(this.doc, new FileOutputStream(filepath));
			

			doc.open();
			
			WriteToDocument();
			
			doc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	public void WriteToDocument () {
		try {			
			doc.addAuthor("Vipin malik");
			
			DocumentElement elements = new  DocumentElement();
			
			doc.add(elements.getParaHeading("Introduction :"));
			
			doc.add(elements.getSimpleParagraph());
			
			doc.add(elements.getParaHeading("Summary :"));
			
			doc.add(elements.getSimpleParagraph());
			
			doc.add(elements.getParaHeading("Lorem ipsum dotor list :"));
			
			doc.add(elements.getList());
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
