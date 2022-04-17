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

        String vastaus=sanalista.getSana();

        for(int i=0; i<6; i++){
            System.out.println("Arvaa 5-kirjaiminen sana: ");
            String arvaus =lukija.nextLine();
            Pelilauta lauta =new Pelilauta(arvaus,i);
            lauta.tulostaLauta();
            VertaaSanat testi = new VertaaSanat(arvaus, vastaus);
            if(testi.vertaa()==true){
                i=6;
                System.out.println("Arvasit oikein!");
            }
            else{
                continue;
            }
        }
        System.out.println("hei");
        


        String arvaus =lukija.nextLine();
        //Pelilauta lauta =new Pelilauta(arvaus);
        //lauta.tulostaLauta();

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