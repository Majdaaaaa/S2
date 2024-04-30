public class BlocR extends Bloc  {
    private int valeurDeRetour;

    public BlocR(int adresseDeRetour){
        super(adresseDeRetour);
    }
    public int getVal(){
        return this.valeurDeRetour;
    }
    public void setVal(int valeurDeRetour){
        this.valeurDeRetour=valeurDeRetour;
    }
    
}