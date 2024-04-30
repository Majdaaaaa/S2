public class Arbre{
    private Noeud racine;
    public Arbre(){
        this.racine=null;
    }
    public Arbre (Noeud n){
        this.racine=n;
    }

    public void bourgeons (){
        if(this.racine!=null){
            this.racine.bourgeons();
        }
    }

    public void elagage(){
        if(this.racine!=null){
            this.racine.elagage();
        }else if(this.racine.estFeuille()){
            this.racine=null;
        }else{ //pour racine==null
            return;
        }
    }

    public void croissance(){
        if(this.racine!=null){
            this.racine.croissance();
        }
    }

    public void decroissance(){
        if(this.racine!=null){
            this.racine.decroissance();
        }
    }
}