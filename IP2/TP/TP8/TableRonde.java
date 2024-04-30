public class TableRonde {
    private Cellule courant;
    public TableRonde(Robot r){
        this.courant=new Cellule(r,null, null);
    }

    public void affiche(){
        if(this.courant!=null)
            this.courant.affiche();
    }
    public void ajouteRob(Robot r){
        if(this.courant==null){
            
        }
    }

}
