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

    public char[] listaksi(String sana){
        char[] lista = new char[5];
        for(int i=0; i<5; i++){
            lista[i]=sana.charAt(i);
        }

        return lista;
    }


    public boolean vertaa(){

        boolean onko=false;
        if(arvaus.equals(vastaus)==true){
            onko=true;
        }

        return onko;
    }

    public boolean[] vertaaLisaa(){
        boolean[] indeksit = new boolean[5];
        char[] arvaus= listaksi(this.arvaus);
        char[] vastaus=listaksi(this.vastaus);
        boolean onko=false;
        for(int i=0; i<5; i++){
            if(arvaus[i]==vastaus[i]){
                onko=true;
                indeksit[i]=onko;
            }
        }
        return indeksit;
    }
    public void sisaltaakoKirjaimen(){
        char[] arvaus= listaksi(this.arvaus);
        char[] vastaus=listaksi(this.vastaus);
    
    }

    
}
