public class BlocR extends Bloc {
    private int valeurDeRetour;
    
    public BlocR(int adr){
        super(adr);
    }
    public int getVal() {
        return valeurDeRetour;
    }
    public void setVal(int valeurDeRetour) {
        this.valeurDeRetour = valeurDeRetour;
    }
}
