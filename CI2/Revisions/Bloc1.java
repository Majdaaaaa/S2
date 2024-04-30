public class Bloc1 {
    private int valeurDeRetour; private int adresseRetour;
    public Bloc1(int adr) { 
        this.adresseRetour = adr;
    }
    public int getAdresse () { 
        return this.adresseRetour;
    }
    public int getVal () {
        return this.valeurDeRetour;
    }
    public void setVal(int valeurDeRetour) { 
        this.valeurDeRetour = valeurDeRetour;
    }
}
