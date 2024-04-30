package exercice1;

public class Noeud{
    private boolean nidIci;
    private int distanceSommet;
    private Noeud filsG;
    private Noeud filsD;

    public int nbEtage() { //ici il compte les noeuds (voire tp10 pour compter les trait)
        int res=0;
        int res2=0;
        if(this.filsG!=null){
            res=this.filsG.nbEtage();
        }
        if(this.filsD!=null){
            res2=this.filsG.nbEtage();

        }
        return 1+Math.max(res,res2);
    }

    public void setAllDistances(int p){
        //travail sur le noeud courant 
        this.distanceSommet=p;
        if(this.filsG!=null){
            //appel recursif a gauche 
            this.filsG.setAllDistances(p+1);
        }
        if(this.filsD!=null){
            //appel recursif a droite 
            this.filsD.setAllDistances(p+1);
        }
    }

    public void recensement(int[] t){
        if(this.nidIci){
            t[this.distanceSommet]++;
        }        
        if(this.filsG!=null){
            this.filsG.recensement(t);
        }
        if(this.filsD!=null){
            this.filsD.recensement(t);
        }
    }


}