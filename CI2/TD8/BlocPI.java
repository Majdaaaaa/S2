public class BlocPI {
    private int adresseDeRetour;
    private int arg;
    private boolean val;

    public BlocPI(int adr,int arg){
        this.adresseDeRetour=adr;
        this.arg=arg;
    }
    public void setVal(boolean val){
        this.val=val;
    }
    public boolean getVal(){
        return this.val;
    }
    public int getAdr(){
        return this.adresseDeRetour;
    }
    public int getArg(){
        return this.arg;
    }
}
