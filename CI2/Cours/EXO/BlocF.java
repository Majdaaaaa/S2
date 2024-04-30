public class BlocF {
    private final int adresse_retour; 
    private int valeur_retour; 
    private int argument;
    private int variable1, variable2; 

    public BlocF(int adr, int arg){
        this.adresse_retour=adr;
        this.argument=arg; 
    }
    public int getVal(){
        return this.valeur_retour;
    }
    public int getVar1(){ 
        return this.variable1;
    }
    public int getVar2(){
        return this.variable2; 
    }
    public int getArg(){ 
        return this.argument;
    }
    public int getAdr(){
        return this.adresse_retour; 
    }
    public void setVar1(int v){ 
        this.variable1=v;
    }
    public void setVar2(int v){
        this.variable2=v; 
    }
    public void setVal(int v){ 
        this.valeur_retour=v;
    }

}
