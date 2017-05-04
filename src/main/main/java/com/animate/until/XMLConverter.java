package com.animate.until;

import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 *
 * Created by Administrator on 2017/1/17.
 */
public class XMLConverter {

    /*
    java读取xml文件的四种方法
    第一种 DOM 实现方法
    第二种，DOM4J实现方法
    第三种 JDOM实现方法
    第四种SAX实现方法
     */

    public static void readDOM(String fileName, String parentNodeName, String nodeName, String attribute) {
        try {
            File file = new File(fileName);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            NodeList nl = doc.getElementsByTagName(parentNodeName);
            System.out.println(nl.getLength());
            for(int i=0; i<nl.getLength(); i++) {
                String key = doc.getElementsByTagName(nodeName).item(i).getAttributes().getNamedItem(attribute).getNodeName();
                String value = doc.getElementsByTagName(nodeName).item(i).getAttributes().getNamedItem(attribute).getNodeValue();
            }
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void readDOM4J(String fileName, String parentNodeName, String nodeName, String attribute) {
        try {
            File file = new File(fileName);
            SAXReader reader = new SAXReader();
            org.dom4j.Document doc = reader.read(file);
            Element root = doc.getRootElement();
            Element foo;
            for (java.util.Iterator i = root.elementIterator(parentNodeName); i.hasNext();) {
                foo = (Element) i.next();
                System.out.print("车牌号码:" + foo.elementText("NO"));
                System.out.println("车主地址:" + foo.elementText("ADDR"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
