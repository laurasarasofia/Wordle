import java.io.*;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * Wordle
 */
public class Wordle {

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException  {

        System.out.println("hello");
        File myObj = new File("sanat.xml"); // Specify the filename
        SanojenKäsittely sanalista = new SanojenKäsittely(myObj);
        sanalista.tulostaSana();



     

    }
}