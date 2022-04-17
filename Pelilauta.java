public class Pelilauta {
    String sana;
    String vastaus;
    String[][] lauta = new String[6][5];
    int kierros;

    public Pelilauta(String sana, int kierros, String vastaus) {
        this.sana = sana;
        this.kierros = kierros;
        this.vastaus=vastaus;
    }

    public String[][] muodostaLauta() {

        //PelinTila tila = new PelinTila(sana);

        String[] kirjaimet = new String[sana.length()];


        for (int i = 0; i < sana.length(); i++) {
            kirjaimet[i] = String.valueOf(sana.charAt(i));
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                lauta[i][j] = " ";
            }
        }
        if (kierros == 0) {
            for (int i = 0; i < sana.length(); i++) { // arvaus yksi
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailu =testi.vertaaLisaa();
                if(vertailu[i]==true){
                    lauta[0][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                }else{
                    lauta[0][i]=kirjaimet[i];
                }
            }
        }
        if(kierros==1){
            for (int i = 0; i < sana.length(); i++) { // arvaus kaksi
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailu =testi.vertaaLisaa();
                if(vertailu[i]==true){ //vertaa sanasta tehtyä listaa vertailu-listaan, ja kaikki vertailulistan true kirjaimet tulostetaan vihreänä
                    lauta[1][i] = Vari.GREEN + kirjaimet[i] + Vari.RESET;
                }else{
                    lauta[1][i]=kirjaimet[i];
                }
            }

        }
        if(kierros==2){
            for (int i = 0; i < sana.length(); i++) { // arvaus kolme
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailu =testi.vertaaLisaa();
                if(vertailu[i]==true){ //vertaa sanasta tehtyä listaa vertailu-listaan, ja kaikki vertailulistan true kirjaimet tulostetaan vihreänä
                    lauta[2][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                }else{
                    lauta[2][i]=kirjaimet[i];
                }
            }
        }
        if(kierros==3){
            for (int i = 0; i < sana.length(); i++) { // arvaus neljä
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailu =testi.vertaaLisaa();
                if(vertailu[i]==true){
                    lauta[3][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                }else{
                    lauta[3][i]=kirjaimet[i];
                }
            }

        }
        if(kierros==4){
            for (int i = 0; i < sana.length(); i++) { // arvaus viisi
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailu =testi.vertaaLisaa();
                if(vertailu[i]==true){
                    lauta[4][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                }else{
                    lauta[4][i]=kirjaimet[i];
                }
            }

        }
        if(kierros==5){
            for (int i = 0; i < sana.length(); i++) { // arvaus kuusi
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailu =testi.vertaaLisaa();
                if(vertailu[i]==true){
                    lauta[5][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                }else{
                    lauta[5][i]=kirjaimet[i];
                }
            }

        }

        return lauta;

    }

    public void tulostaLauta() {

        String[][] lauta = muodostaLauta();

        System.out.println(lauta[0][0] + "|" + lauta[0][1] + "|" + lauta[0][2] + "|" + lauta[0][3] + "|" + lauta[0][4]);
        System.out.println("---------");
        System.out.println(lauta[1][0] + "|" + lauta[1][1] + "|" + lauta[1][2] + "|" + lauta[1][3] + "|" + lauta[1][4]);
        System.out.println("---------");
        System.out.println(lauta[2][0] + "|" + lauta[2][1] + "|" + lauta[2][2] + "|" + lauta[2][3] + "|" + lauta[2][4]);
        System.out.println("---------");
        System.out.println(lauta[3][0] + "|" + lauta[3][1] + "|" + lauta[3][2] + "|" + lauta[3][3] + "|" + lauta[3][4]);
        System.out.println("---------");
        System.out.println(lauta[4][0] + "|" + lauta[4][1] + "|" + lauta[4][2] + "|" + lauta[4][3] + "|" + lauta[4][4]);
        System.out.println("---------");
        System.out.println(lauta[5][0] + "|" + lauta[5][1] + "|" + lauta[5][2] + "|" + lauta[5][3] + "|" + lauta[5][4]);
        System.out.println("---------");
    }
}
