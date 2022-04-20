import java.io.*;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * Wordle
 */
public class Wordle {

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

        File myObj = new File("sanat.xml"); // Luo File muotoisen tiedoston
        SanojenKäsittely sanalista = new SanojenKäsittely(myObj); // Luo SanojenKäsittely objektin sanalista jonka
                                                                  // attribuuttina on myObj

        Scanner lukija = new Scanner(System.in);

        String vastaus = sanalista.getSana();

        for (int i = 0; i < 6; i++) {
            System.out.println("Kierros " + i+1  + " Arvaa 5-kirjaiminen sana: ");
            String arvaus = lukija.nextLine();
            if (sanalista.onkoListassa(arvaus) == true) {
                Pelilauta lauta = new Pelilauta(arvaus, i-1, vastaus);
                lauta.tulostaLauta();
                VertaaSanat testi = new VertaaSanat(arvaus, vastaus);
                if (testi.vertaa() == true) {
                    i = 6;
                    System.out.println("Arvasit oikein!");
                } else if (i < 5) {
                    continue;
                } else {
                    System.out.println("Arvaukset loppu! oikea vastaus: " + Vari.CYAN + vastaus + Vari.RESET);
                    break;
                }
            }else{
                System.out.println("Arvaus ei ole listassa.");
                //break;
            }
        }

    }
}