package com.spicemoney.module6;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DomxmlParsing {
    public static void main(String[] args) {

        try {

            File file = new File("C:/Users/kumudini.khairnar_sp/document/Student.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Document Object represents the XML Structure in Java Program
            Document document = builder.parse(file);

            System.out.println("ROOT ELEMENT: " + document.getDocumentElement().getNodeName());

            NodeList nodes = document.getElementsByTagName("s1");
            System.out.println("Total Student Tags Found: " + nodes.getLength());

            for (int i = 0; i < nodes.getLength(); i++) {

                Node node = nodes.item(i);
                Element element = (Element) node;

                System.out.println(element.getElementsByTagName("id").item(0).getTextContent());
                System.out.println(element.getElementsByTagName("name").item(0).getTextContent());
                System.out.println(element.getElementsByTagName("std").item(0).getTextContent());
                System.out.println(element.getElementsByTagName("address").item(0).getTextContent());

                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Some Exception: " + e);
        }

    }
}
