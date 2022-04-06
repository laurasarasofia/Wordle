public class VertaaSanat {
    String arvaus;
    String vastaus;

    public VertaaSanat(String arvaus, String vastaus){
        this.arvaus=arvaus;
        this.vastaus=vastaus;
    }

    public String getVastaus(){
        return this.vastaus;
    }

    public char[] arvausListaksi(){
        char[] arvausLista = new char[5];
   
        for (int i = 0; i <arvaus.length(); i++) {
            arvausLista[i] = arvaus.charAt(i);
        }
        return arvausLista;
    }

    public  char[] vastausListaksi(){
        char[] vastausLista = new char[5];

        for (int i = 0; i <vastaus.length(); i++) {
            vastausLista[i] = vastaus.charAt(i);
        }
        return vastausLista;

    }

    public boolean vertaa(){
        char[] arvaus = arvausListaksi();
        char[] vastaus = vastausListaksi();
        boolean onko=false;
        for(int i=0; i<5; i++){
            if(arvaus[i]==vastaus[i]){
                onko=true;
            }
        }

        return onko;
    }
    
}
