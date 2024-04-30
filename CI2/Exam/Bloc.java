
public class Bloc {
    private final int adresse_retour; 
    private int valeur_retour; 
    private int argument;
    
    public Bloc(int adr, int arg){
        this.adresse_retour=adr;
        this.argument=arg; 
    }
    public int getVal(){
        return this.valeur_retour;
    }
  
    public int getArg(){ 
        return this.argument;
    }
    public int getAdr(){
        return this.adresse_retour; 
    }
    public void setVal(int v){ 
        this.valeur_retour=v;
    }

}