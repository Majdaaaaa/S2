public class BlocA {
    private int adresse_retour; 
    private int argument1; 
    private int argument2;
    // constructeur
    public BlocA(int adr, int arg1, int arg2){ 
        this.adresse_retour = adr; 
        this.argument1 = arg1;
        this.argument2 = arg2;
    }
    //getters utilisés par le code appelant
    public int getAdr (){
    return this.adresse_retour;
    }
    public int getArg1 (){ 
        return this.argument1;
    }
    public int getArg2 (){ 
        return this.argument2;
    }
}
