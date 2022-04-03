import java.io.*;
import javax.xml.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;

/**
 * Wordle
 */
public class Wordle {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        System.out.println("hello");
        File myObj = new File("sanat.xml"); // Specify the filename
        SanojenKäsittely sanalista = new SanojenKäsittely(myObj);
        sanalista.tulostaSana();



     

    }
}