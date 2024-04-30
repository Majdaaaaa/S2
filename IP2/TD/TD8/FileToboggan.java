public class FileToboggan {
    private int nbMax;
    private Cellule courant;
    public FileToboggan(int nbMax){
        this.nbMax=nbMax;
        this.courant=null;
    }
    public void ajouter(String nom,int nb) {
        if(courant==null){
            this.courant=new Cellule(new Enfant(nom,nb));
        }else{
            Cellule nc=new Cellule(courant.prec,courant,new Enfant(nom,nb));
            nc.prec.suiv=nc; 
            nc.suiv.prec=nc;
        }
    }
    public void supprimer(String nom){
        if(courant!=null){
            this.courant.supprimer(nom);
        }
    }
    public void affiche(){
        if(this.courant!=null){
            this.courant.affiche();
        }
    }
    public void afficheRec(){
        if(this.courant!=null){
            this.courant.afficheRec(this.courant);
        }
    }
    public Enfant unTour(){
        if(this.courant==null){
            return null;
        }else{
            Enfant actuel=this.courant.enf;
            actuel.nbTob++;
            this.courant=this.courant.suiv;
            if(actuel.nbTob==this.nbMax){
                this.supprimer(actuel.nom);
                return actuel;
            }
            return null;
        }
    }
    public boolean estVide() {
        return this.courant==null;
    }
    public void laisserPasser() {
        if(this.courant!=null){
            this.courant=this.courant.laisserPasser();
        }
    }

    

}


