public class Cellule {
    Cellule prec,suiv;
    Enfant enf;
    public Cellule(Cellule prec,Cellule suiv,Enfant enf){
        this.prec=prec;
        this.suiv=suiv;
        this.enf=enf;
    }
    public Cellule(Enfant enf){
        this.prec=this;
        this.suiv=this;
        this.enf=enf;
    }
    public Cellule supprimer(String nom){
        Cellule tmp=this;
        do{
            Cellule tmp_sui=tmp.suiv;
            if(tmp_sui.enf.nom.equals(nom)){
                if(tmp==tmp.suiv){
                    return null;
                }else{
                    tmp.suiv=tmp_sui.suiv;
                    tmp.suiv.prec=tmp;
                    if(tmp_sui==this){ //ici verfie si ce qu'on veut supprimer est la cellule courante
                        return tmp_sui.suiv;
                    }else{
                        return this;
                    }
                }
            }
            else{
                tmp=tmp.suiv;
            }
        }while(tmp!=this);
        return this;
    }
    public void affiche(){
        Cellule tmp=this;
        do{
            System.out.println(this.enf.nom);
            tmp=tmp.suiv;
        }while(tmp!=this);
    }

    public void afficheRec(Cellule prem){
        System.out.println(this.enf.nom);
        if(this.suiv!=prem){
            this.suiv.afficheRec(prem);
        }
    }
    public Cellule laisserPasser() {
        if(this.suiv.enf.nbTob<this.enf.nbTob){
            Cellule actuelle=this;
            Cellule suivante=this.suiv;
            if(this.suiv!=actuelle){
                actuelle.suiv=suivante.suiv;
                suivante.prec=actuelle.prec;
                actuelle.prec=suivante;
                suivante.suiv=actuelle;
                suivante.prec.suiv=suivante;
                actuelle.suiv.prec=actuelle;
            }
            return suivante;
        }
        return this;
    }
}
