public class BlocA extends Bloc{
    private boolean valeurRetour; 
    private int argument;
    public BlocA(int adr, int arg) {
        super(adr);
        this.argument=arg;
    }

    public int getArg(){
        return this.argument;
    }

    public boolean getVal(){
        return this.valeurRetour;
    }

    public void setVal(boolean val){
        this.valeurRetour=val;
    }
}
