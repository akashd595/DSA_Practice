package com.dsa.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class XMLReaderExample {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("G:\\TheGoat\\BackEnd\\DSA_Practice\\src\\main\\java\\com\\dsa\\xml\\readXml.xml");

            System.out.println(document.getDocumentElement().getNodeName());
            Element rootElement = document.getDocumentElement();

            // Example: Accessing elements and attributes
            NodeList nodeList = rootElement.getElementsByTagName("book");
//            System.out.println("1");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
//                System.out.println("2"+nodeList.getLength());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String attributeValue = element.getAttribute("id");
                    String elementText = element.getTextContent();
                    System.out.println("Attribute: " + attributeValue);
                    System.out.println("Text: " + elementText);
                }
//                System.out.println("XML Content:");
//                System.out.println(getStringFromDocument(document));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getStringFromDocument(Document doc) {
        try {
            DOMSource domSource = new DOMSource(doc);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.transform(domSource, result);
            return writer.toString();
        } catch (TransformerException e) {
            e.printStackTrace();
            return null;
        }
    }


}
