package utilities;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class XMLReader {
	
	private Document doc;
	private String fileName;
	
	public XMLReader(String fileName){
		
		this.fileName = fileName;
		
	}

	
	public String getLocator(String locator){
		SAXReader reader = new SAXReader();
		try {
			doc = reader.read(fileName);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String data = doc.selectSingleNode("//"+locator.replace(".", "/")).getText().trim();
		return data;
	}
	
}
