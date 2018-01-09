package design_patterns.creational_patterns.abstract_factory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AbstractFactoryEverydayDemo {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();  //it's abstract factory
        DocumentBuilder builder = abstractFactory.newDocumentBuilder(); //it's factory
        Document doc = builder.parse(bais);

        doc.getDocumentElement().normalize();

        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        System.out.println(abstractFactory.getClass());
        System.out.println(builder.getClass());
    }
}
