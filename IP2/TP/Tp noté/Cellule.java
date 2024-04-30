public class Cellule {
    Cellule suivant;
    int valeur;

    public Cellule(Cellule cellule, int valeur) {
        this.suivant=cellule;
        this.valeur=valeur;
    }
    public Cellule ajout(Cellule c){
        if(this.valeur>c.valeur){
            return new Cellule(this,c.valeur);
        }
        Cellule tmp=this;
        while(tmp.suivant!=null && tmp.suivant.valeur<c.valeur){
            tmp=tmp.suivant;
        }
        tmp.suivant=new Cellule(tmp.suivant,c.valeur);
        return this;

    }
    public boolean estTriee() {
        boolean res=false;
        if(this.suivant!=null){
            if(this.valeur<this.suivant.valeur && this.suivant.valeur<this.suivant.suivant.valeur){ 
                res=true;
                this.suivant.estTriee();
            }
        }
        return res;
    }
    //Correction 
    public boolean estTrieeCorr(){
        if(this.suivant==null){
            return true;
        }
        return this.valeur<=this.suivant.valeur && this.suivant.estTrieeCorr();
    }

    public int moyenne() {
        Cellule tmp=this;
        int taille=0;
        int moyenne=this.valeur;
        while(tmp.suivant!=null){
            taille++;
            moyenne=moyenne+tmp.suivant.valeur;
            tmp=tmp.suivant;
        }
        moyenne=moyenne/taille;
        return moyenne;
    }

    public int moyenneCorr(){
        int res=0;
        int nb_val=0;
        Cellule tmp=this;
        while(tmp!=null){
            res=tmp.valeur;
            nb_val++;
            tmp=tmp.suivant;
        }
        return res/nb_val;
    }
    public boolean aTripletPythagoricien() {
        Cellule tmp=this;
        boolean res=false;
        while(tmp.suivant.suivant!=null){
            if(tmp.valeur*2+tmp.suivant.valeur*2==tmp.suivant.suivant.valeur*2){ // je ne sais plus quel est le signe de la puissance du coup on considere que c'est *
                res=true;
            }
        }
        return res;
    }
    //Correction 
    public boolean aTripletPythagoricienCorr(){
        if(this.suivant==null || this.suivant.suivant==null){
            return false;
        }
        int this_val=this.valeur;
        int suiv_val=this.suivant.valeur;
        int suiv_suiv_val=this.suivant.suivant.valeur;
        if((this_val*this_val+suiv_val*suiv_val)==(suiv_suiv_val*suiv_suiv_val)){
            return true;
        }
        return this.suivant.aTripletPythagoricienCorr();
    }
    public static Cellule tri(Cellule l2) {
        Cellule tmp=l2;
        Cellule tmp2=l2;
        while(tmp.suivant!=null){
            while(tmp2.suivant!=null){              //deux boucles et les valeurs de tmp sont comparées a ceux de tmp2 et le plus grand est renvoyer 
                if(tmp.valeur>tmp2.valeur){
                    tmp2=tmp;
                }else{
                    return tmp;
                }
                tmp2=tmp2.suivant;
            }
            tmp=tmp.suivant;
        }
        return null;
    }

    public Cellule inverse(Cellule acc){
        Cellule tmp=this.suivant;
        this.suivant=acc;
        if(tmp!=null){
            return tmp.inverse(this);
        }
        return this;
    }

}
