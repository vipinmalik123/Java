package org.vipinmalik.document;

import com.lowagie.text.List;
import com.lowagie.text.Paragraph;

public class DocumentElement {
	
	static final String LOREM_IPSUM_TEXT = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit Goodman (1943). Donec ut massa. Nam"
			+ "quis tortor at leo congue accumsan. In nisl justo, consequat ac, dictum nec, hendrerit nec, nisl.1 Nulla ac"
			+ "erat et ligula pharetra nonummy. Cras consectetuer lorem et est. Suspendisse commodo euismod orci."
			+ "Vestibulum mollis nulla non dolor. Suspendisse consectetuer dictum ligula. Nam viverra lacinia lorem."
			+ "Proin arcu eros, convallis ut, sagittis eu, viverra vel, lacus. Pellentesque diam enim, tempus sed, rhoncus"
			+ "a, cursus in, metus. Morbi nibh purus, blandit sit amet, porttitor eu, pellentesque porttitor, felis. Quisque"
			+ "vitae magna a dolor euismod scelerisque";
	
	static final String[] LIST_ITEMS = {"Lorem ipsum dolor sit amet, consectetuer adipiscing elit.", 
										"Aliquam tincidunt mauris eu risus.",
										"Vestibulum auctor dapibus neque.",
										"Nunc dignissim risus id metus.",
										"Cras ornare tristique elit.",
										"Vivamus vestibulum nulla nec ante.",
										"Praesent placerat risus quis eros.",
										"Fusce pellentesque suscipit nibh."};
	
	public DocumentElement() {}
	
	public Paragraph getSimpleParagraph() {
		Paragraph simpleParagraph = new Paragraph(LOREM_IPSUM_TEXT);
		
		simpleParagraph.setIndentationLeft(20);
		simpleParagraph.setSpacingAfter(20);
		simpleParagraph.setFirstLineIndent(40);
		
		return simpleParagraph;
	}
	
	public Paragraph getParaHeading(String text) {
		Paragraph paraHeading = new Paragraph(text);
		
		return paraHeading;
	}
	
	public List getList() {
		List l = new List();
		
		l.setNumbered(true);
		l.setIndentationLeft(20);
		
		for (int idx = 0; idx < LIST_ITEMS.length; idx++) {
			l.add(LIST_ITEMS[idx]);
		}
		
		return l;
	}
}
