public class Noeud {
    private Noeud gauche;
    private Noeud droit;
    public Noeud (Noeud g,Noeud d){
        this.gauche=g;
        this.droit=d;
    }
    public boolean estFeuille(){
        return this.gauche==null && this.droit ==null;
    }

    public void bourgeons() {
        if(this.estFeuille()){
            this.gauche=new Noeud(null,null);
            this.droit=new Noeud(null,null);
        }else{
            if(this.gauche!=null){
                this.gauche.bourgeons();
            }
            if(this.droit!=null){
                this.droit.bourgeons();
            }
        }
    }
    public void elagage() {
        if(this.gauche.estFeuille()){
            this.gauche=null;
        }
        if(this.droit.estFeuille()){
            this.droit=null;
        }
        this.gauche.elagage();
        this.droit.elagage();
    }
    //Correction 
    public void elagagCorr(){
        if(this.gauche!=null && !this.gauche.estFeuille()){
            this.gauche.elagagCorr();
        }else{
            this.gauche=null;
        }
        if(this.droit!=null && !this.droit.estFeuille()){
            this.droit.elagagCorr();
        }else{
            this.droit=null;
        }
    }

    public void croissance(){
        if(this.gauche!=null){
            this.gauche=new Noeud(this.gauche,null);
            this.gauche.gauche.croissance();
        }
        if(this.droit!=null){
            this.droit=new Noeud (null,this.droit);
            this.droit.droit.croissance();
        }
    }
    public void decroissance() {
    }
}
