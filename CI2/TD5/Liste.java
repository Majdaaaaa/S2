public class Liste {
    private Cellule tete;

    public Liste(){
        this.tete=null;
    }

    public boolean estVide(){
        return (tete==null);
    }

    public void ajouter(int x){
        if (this.estVide()){
            tete=new Cellule(x);
        }else{
            tete.ajouter(x);
        }
    }
}
