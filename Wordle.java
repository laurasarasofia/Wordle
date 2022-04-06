import java.io.*;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * Wordle
 */
public class Wordle {

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException  {

        File myObj = new File("sanat.xml"); // Luo File muotoisen tiedoston
        SanojenKäsittely sanalista = new SanojenKäsittely(myObj); //Luo SanojenKäsittely objektin sanalista jonka attribuuttina on myObj
        

        Scanner lukija = new Scanner(System.in);
        System.out.println("Arvaa 5-kirjaiminen sana: ");
        String arvaus =lukija.nextLine();
        Pelilauta lauta =new Pelilauta(arvaus);
        lauta.tulostaLauta();

        VertaaSanat testi = new VertaaSanat(arvaus, sanalista.getSana());

        System.out.println(testi.vertaa());

        System.out.println(sanalista.getSana()); //tulostaa sanalistan metodin tuoman sanan
        System.out.println(sanalista.getSana()); //tulostaa sanalistan metodin tuoman sanan
        System.out.println(sanalista.getSana()); //tulostaa sanalistan metodin tuoman sanan
        System.out.println(sanalista.getSana()); //tulostaa sanalistan metodin tuoman sanan
        System.out.println(sanalista.getSana()); //tulostaa sanalistan metodin tuoman sanan
        System.out.println(sanalista.getSana()); //tulostaa sanalistan metodin tuoman sanan
        System.out.println(sanalista.getSana()); //tulostaa sanalistan metodin tuoman sanan



     

    }
}