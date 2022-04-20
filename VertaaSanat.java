public class VertaaSanat {
    String arvaus;
    String vastaus;

    public VertaaSanat(String arvaus, String vastaus){
        this.arvaus=arvaus;
        this.vastaus=vastaus;
    }

    public String getVastaus(){ //palauttaa vastauksen, ei käytetä
        return this.vastaus;
    }

    public char[] listaksi(String sana){ //muuttaa annetun sanan Char listaksi, joissa yhdekssä indeksissä yksi kirjain
        char[] lista = new char[5];
        for(int i=0; i<5; i++){
            lista[i]=sana.charAt(i);
        }

        return lista;
    }


    public boolean vertaa(){ //vertaa onko objektin vastaus ja arvaus samat ja palauttaa boolean arvon

        boolean onko=false;
        if(arvaus.equals(vastaus)==true){
            onko=true;
        }

        return onko;
    }

    public boolean[] vertaaLisaa(){ //palauttaa boolean listan, joissa oikeiden kirjainten kohdalla true ja muissa false
        boolean[] indeksit = new boolean[5];
        char[] arvaus= listaksi(this.arvaus); //muuttaa arvauksen ja vastauksen char listaksi
        char[] vastaus=listaksi(this.vastaus);
        boolean onko=false;
        for(int i=0; i<5; i++){
            if(arvaus[i]==vastaus[i]){ //vertaa arvauksen indeksiä ja vastauksen indeksiä keskenäään
                onko=true;          //jos samat muuttaa trueksi
                indeksit[i]=onko;
            }
        }
        return indeksit;  //palauttaa boolean listan, jossa indekseissä kerrottu onko true tai false
    }
    public boolean[] sisaltaakoKirjaimen(){//testaa sisältääkö vastaus arvauksen kirjaimia
        char[] arvaus= listaksi(this.arvaus); //muuttaa arvauksen char listaksi
        boolean onko=false;
        boolean [] indeksit=new boolean[5];

        for(int i=0; i<5; i++){
            if(vastaus.contains(String.valueOf(arvaus[i]))==true){
                onko=true;
                indeksit[i]=onko;
            }
        }

        return indeksit;
    
    }

    
}
