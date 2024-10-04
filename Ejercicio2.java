package ejercicioXpath;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Ejercicio2 {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			 factory.setNamespaceAware(true); // never forget this!
			 DocumentBuilder builder = factory.newDocumentBuilder();
			 Document doc = builder.parse("C://Trastero//tienda.xml");
			 
			 
			 XPathFactory xpathFactory = XPathFactory.newInstance();
			 XPath xpath = xpathFactory.newXPath();
			 
			 XPathExpression expr = xpath.compile("//producto[@id='p2']/precio/text()");
			 Object result = expr.evaluate(doc, XPathConstants.STRING);
			 String nodes =(String) result;
			System.out.println(nodes);
			 
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	


