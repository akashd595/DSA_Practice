package com.dsa.xml;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.StringWriter;

public class XmlFileReader {
    public NodeList readXML(String filePath, String tagName, String subTagName, String tagAttr) {
        NodeList elementsByTagName = null;
        try {
            // Get XML file object.
            File fXmlFile = new File(filePath);

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName(tagName);

            for (int i = 0; i < nodeList.getLength(); i++) {

                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    if (element.getAttribute("name").equalsIgnoreCase(tagAttr)) {
                        elementsByTagName = element.getElementsByTagName(subTagName);
                        System.out.println("elementsByTagName " +elementsByTagName.toString());
                        return elementsByTagName;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return elementsByTagName;
    }

    public static void main(String[] args) {
        XmlFileReader xmlFileReader = new XmlFileReader();
        System.out.println("inside main");
        NodeList toolLogExtChilds = xmlFileReader.readXML("G:\\TheGoat\\BackEnd\\DSA_Practice\\src\\main\\java\\com\\dsa\\xml\\test.xml",
                "arr", "str", "toolLogExt");
    }
    public void read(){
        NodeList nodeList = null;
        NamedNodeMap attrs;
        Node attribute=null,attr=null,firstNode=null;
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("G:\\TheGoat\\BackEnd\\DSA_Practice\\src\\main\\java\\com\\dsa\\xml\\readXml.xml");
            document.getDocumentElement().normalize();
            nodeList = document.getElementsByTagName("arr");
            int len = 0;
            int count = 0;
            for(int s = 0; s<nodeList.getLength(); s++){
                firstNode = nodeList.item(s);
                attrs = firstNode.getAttributes();
                for(int i=0; i<attrs.getLength(); i++){
                    attr = attrs.item(i);
                    if(attr.getNodeName().intern() == "".intern()){
                        System.out.println("something");
                    }
                }

            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
