package org.vipinmalik.document;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

public class PdfWithTableBackgroundExample extends PdfDocumentExample {

	public void WriteToDocument () {
		try {			
			doc.addAuthor("Vipin malik");
			
			DocumentElement elements = new  DocumentElement();
			
			PdfPTable table = new PdfPTable(2);
			
			table.setTotalWidth(900);
			
			float[] widths = {(float)150, (float)750};
			
			table.setWidths(widths);
			
			PdfPCell cell = new PdfPCell();
			
			cell.addElement(elements.getParaHeading("Introduction"));
			
			table.addCell(cell);
			
			cell = new PdfPCell();
			
			cell.addElement(elements.getSimpleParagraph());
			
			table.addCell(cell);
			
			doc.add(table);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}