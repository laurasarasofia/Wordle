public class Pelilauta {
    String sana;
    //char[][] lauta;

    public Pelilauta(String sana) {
        this.sana = sana;
    }

    public char[][] muodostaLauta(){
        char [][] lauta = new char[6][5];
        char [] kirjaimet = new char[sana.length()];
        for (int i = 0; i < sana.length(); i++) {
            kirjaimet[i] = sana.charAt(i);
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                lauta[i][j] = ' ';
            }
        }
        for (int i =0; i<sana.length();i++){ //arvaus yksi
            lauta[0][i]=kirjaimet[i];
        }

        return lauta;

    }

    public void tulostaLauta() {
        
        char[][] lauta = muodostaLauta();

        System.out.println(lauta[0][0] + "|" + lauta[0][1] + "|" + lauta[0][2]+ "|" +lauta[0][3] + "|" + lauta[0][4]);  
        System.out.println("---------");
        System.out.println(lauta[1][0] + "|" + lauta[1][1] + "|" + lauta[1][2]+ "|" +lauta[1][3] + "|" + lauta[1][4]);  
        System.out.println("---------");
        System.out.println(lauta[2][0] + "|" + lauta[2][1] + "|" + lauta[2][2]+ "|" +lauta[2][3] + "|" + lauta[2][4]); 
        System.out.println("---------");
        System.out.println(lauta[3][0] + "|" + lauta[3][1] + "|" + lauta[3][2]+ "|" +lauta[3][3] + "|" + lauta[3][4]); 
        System.out.println("---------");
        System.out.println(lauta[4][0] + "|" + lauta[4][1] + "|" + lauta[4][2]+ "|" +lauta[4][3] + "|" + lauta[4][4]); 
        System.out.println("---------");
        System.out.println(lauta[5][0] + "|" + lauta[5][1] + "|" + lauta[5][2]+ "|" +lauta[5][3] + "|" + lauta[5][4]); 
        System.out.println("---------");
    }
}
