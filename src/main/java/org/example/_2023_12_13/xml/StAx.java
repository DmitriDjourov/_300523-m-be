package org.example._2023_12_13.xml;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StAx {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser
                = factory.createXMLStreamReader
                (new FileInputStream("E:\\_300523-m-be\\src\\main\\java\\org\\example\\_2023_12_13\\xml\\1.xml"));

        while (parser.hasNext()) {
            int event = parser.next();
            if(event == XMLStreamConstants.START_ELEMENT) {
                System.out.println(parser.getLocalName());
            }
        }
    }
}