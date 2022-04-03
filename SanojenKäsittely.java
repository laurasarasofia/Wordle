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

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();  //rivit 20-23 käsittelee sanat.xml tiedostoa käytettävään muotoon

        NodeList list = doc.getElementsByTagName("sana"); //muodostetaan NodeList lista sanat.xml sanoista
        int min = 0; 
        int max =list.getLength(); //kertoo sanojen määrän
    
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName()); //Tulostaa juuren nimen (ei tarpeellinen toiminnan kannalta)

        int b = (int)(Math.random()*(max-min+1)+min);  //arpoo random numeron, jota käytetään sanalistasta random sanan valintaan
        System.out.println(doc.getElementsByTagName("sana").item(b).getTextContent()); //tulostaa sanalistasta random sanan
    }

}
