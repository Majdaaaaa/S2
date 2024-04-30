public class BlocB {
    private int adresse_retour; 
    private int argument; 
    private int valeur_retour;
    // constructeur
    public BlocB(int adr, int arg){ 
        this.adresse_retour = adr; 
        this.argument = arg;
    }
    // getter utilisé par le code appelant
    public int getVal (){
        return this.valeur_retour;
    }
    // getters et setter utilisé par // le code appelé
    public int getAdr (){
        return this.adresse_retour;
    }

    public int getArg (){ 
        return this.argument;
    }
    public void setVar(int v){ 
        this.valeur_retour = v;
    }
}
