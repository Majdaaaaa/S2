public class Cellule {
    private int cle;
    private Cellule suivant;

    public Cellule(int cle){
        this.cle=cle;
    }
    public Cellule (int cle,Cellule suivant){
        this.cle=cle;
        this.suivant=suivant;
    }

    public void ajouter (int x){
        Cellule tmp=this;
        while(tmp.suivant!=null){
            tmp=tmp.suivant;
        }
        tmp.suivant=new Cellule (x);
    }
}
