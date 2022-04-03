import java.io.*;
import javax.xml.*;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import java.lang.*;
import org.w3c.dom.NodeList;

public class SanojenKäsittely {
    File file;

    public SanojenKäsittely(File file){
        this.file=file;
    }

    public void tulostaSana () throws SAXException, IOException, ParserConfigurationException{
        int min = 0;  

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();

        NodeList list = doc.getElementsByTagName("sana");

        int max =list.getLength();
    
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        int b = (int)(Math.random()*(max-min+1)+min);  
        System.out.println(doc.getElementsByTagName("sana").item(b).getTextContent());
    }

}
