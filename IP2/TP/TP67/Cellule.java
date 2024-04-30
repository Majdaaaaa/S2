package TP.TP67;

public class Cellule {
    private Cellule precedente;
    private Cellule suivante;
    private boolean noire;
    private boolean prochainEtat;

    public Cellule getPre(){
        return this.precedente;
    }
    public Cellule getSuiv(){
        return this.suivante;
    }
    public void setSuiv(Cellule c){
        this.suivante=c;
    }
    public boolean getNoire(){
        return this.noire;
    }


    public Cellule(boolean noire){
        this.noire=noire;
        this.precedente=null;
        this.suivante=null;
        this.prochainEtat=false;
    }

    public void afficher(){
        if(this.noire==true){
            System.out.print("#");
        }else if(this.noire==false){
            System.out.print("-");
        }
    }

    public void ajouterAuDebut(Cellule c){
        this.precedente=c;
        c.suivante=this;
    }

    public void ajouterALaFin(Cellule c){
        this.suivante=c;
        c.precedente=this;
    }

    public void affiche(){
        Cellule tmp=this;
        while(tmp.suivante!=null){
            tmp.afficher();
            tmp=tmp.suivante;
        }
        tmp.afficher();
    }

    public void prochaineEtape(){
        Cellule tmp=this;
        while(tmp.suivante!=null){
            if(tmp.precedente==null){
                if(tmp.noire==tmp.suivante.noire && tmp.noire!=true){
                    tmp.prochainEtat=false;
                }else{
                    tmp.prochainEtat=true;
                }

            }else{
                if(tmp.suivante.noire==tmp.precedente.noire && tmp.noire==tmp.suivante.noire){
                    tmp.prochainEtat=false;
                }else{
                    tmp.prochainEtat=true;
                }
            }
            tmp=tmp.suivante;
        }
        if(tmp.noire==tmp.precedente.noire && tmp.noire!=true){
            tmp.prochainEtat=false;
        }else{
            tmp.prochainEtat=true;
        }        
    }

    public void maj(){
        Cellule tmp=this;
        while(tmp.suivante!=null){
            tmp.noire=tmp.prochainEtat;
            tmp=tmp.suivante;
        }
        tmp.noire=tmp.prochainEtat;
    }
}