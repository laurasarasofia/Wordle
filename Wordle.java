import java.io.*;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * Wordle
 */
public class Wordle {

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException  {

        File myObj = new File("sanat.xml"); // Luo File muotoisen tiedoston
        SanojenKäsittely sanalista = new SanojenKäsittely(myObj); //Luo SanojenKäsittely objektin sanalista jonka attribuuttina on myObj
        sanalista.tulostaSana(); //kutsuu sanalistan metodia



     

    }
}