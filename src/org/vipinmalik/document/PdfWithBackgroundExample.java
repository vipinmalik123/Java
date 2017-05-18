package org.vipinmalik.document;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PatternColor;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfPatternPainter;
import com.lowagie.text.pdf.PdfWriter;
import org.vipinmalik.document.PdfDocumentExample;

public class PdfWithBackgroundExample extends PdfDocumentExample {
	
	public void createPdfDocument(String filepath) {
		try {
			PdfWriter writer = PdfWriter.getInstance(this.doc, new FileOutputStream(filepath));
			
			Background event = new Background();
			
			writer.setPageEvent(event);
			
			doc.open();
			
			WriteToDocument();
			
			doc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	public class Background extends PdfPageEventHelper {
        @Override
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte canvas = writer.getDirectContentUnder();
            
            Rectangle rect = document.getPageSize();
            
            PdfPatternPainter line = canvas.createPattern(2, rect.getHeight());
            line.setColorFill(new Color(0xFF, 0xd1, 0xb3));
            line.setColorStroke(new Color(0xFF, 0xE0, 0xCC));
            line.rectangle(0, rect.getBottom(), 2, rect.getHeight());
            line.fillStroke();
            
            canvas.saveState();
            canvas.setColorFill(new PatternColor(line));
            canvas.rectangle(rect.getLeft(), rect.getBottom(), rect.getWidth(), rect.getHeight());
            canvas.fillStroke();
            canvas.restoreState();
        }
    }

}
