public class Cellule {
    private Robot rob;
    private Cellule suivant;
    private Cellule precedent;
    
    public Cellule(Robot rob,Cellule suivant,Cellule precedent){
        this.rob=rob;
        this.suivant=suivant;
        this.precedent=precedent;
    }
    
    public Cellule getPrec() {
        return precedent;
    }
    public void setPrec(Cellule precedent) {
        this.precedent = precedent;
    }
    public Cellule getSui() {
        return suivant;
    }
    public void setSui(Cellule suivant) {
        this.suivant = suivant;
    } 
    public Robot getRob() {
        return rob;
    }
    public void setRob(Robot rob) {
        this.rob = rob;
    }

    public void affiche(){
        Cellule tmp=this;
        do{
            tmp.rob.description();
            tmp=tmp.suivant;
        }while(tmp!=this && tmp!=null);
    }
 
}
