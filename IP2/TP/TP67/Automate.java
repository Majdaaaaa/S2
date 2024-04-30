package TP.TP67;

public class Automate {
    private Cellule debut;
    private Cellule fin;

    Automate (String str){
        for(int i=0;i<str.length();i++){
            if(i==0){
                if(str.charAt(i)=='#'){
                    this.ajouterAuDebut(true);
                }else if(str.charAt(i)=='-'){
                    this.ajouterAuDebut(false);
                }
            }else{
                if(str.charAt(i)=='#'){
                    this.ajouterALaFin(true);
                }else if(str.charAt(i)=='-'){
                    this.ajouterALaFin(false);
                }
            }
        }
    }

    public void ajouterAuDebut(boolean c){
        Cellule C=new Cellule (c);
        if(this.debut==null){
            this.debut=C;
            this.fin=C;
        }else{
            this.debut.ajouterAuDebut(C);
            this.debut=C;
        }
    }
    public void ajouterALaFin(boolean c){
        Cellule C=new Cellule (c);
        if(this.fin==null){
            this.debut=C;
            this.fin=C;
        }else{
            this.fin.ajouterALaFin(C);
            this.fin=C;
        }
    }

    public void affiche(){
        if(this.debut!=null){
            this.debut.affiche();
        }
    }

    public void prochaineEtape(){
        if(this.debut!=null){
            this.debut.prochaineEtape();
        }
    }

    public void maj(){
        if(this.debut!=null){
            this.debut.maj();
        }
    }

    public void uneEtape(){
        if(this.debut!=null){
            this.debut.prochaineEtape();
            this.debut.maj();
        }
    }

    public void nEtape(int n){
        if(this.debut!=null){
            for(int i=0;i<n;i++){
                this.affiche();
                this.uneEtape();
                System.out.println();
            }
            this.affiche();
        }

    }
}