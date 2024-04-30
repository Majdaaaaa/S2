

public class Liste{
    private Cellule first;
    //le constructeur de liste est implicite mais il est null si on devrait le faire:
    public Liste(){
        this.first=null;
    }

    public void afficher(){
        if(this.first!=null){
            this.first.afficher();
        }
    }

    public void addDebut(Element e){
        Cellule ePrime=new Cellule(e); 
        if(this.first==null){
            this.first=ePrime;
        }else{
            this.first=new Cellule(e,this.first);
        }
    }

    public void addFin(Element e){
        Cellule ePrime=new Cellule(e);
        if(this.first==null){
            this.first=ePrime;
        }else{
            this.first.addFin(ePrime);
        }
    }

    public void addEnI(Element e,int i){
        if(i<=0 || this.first==null ){
            this.first=new Cellule(e, this.first);
        }else{
            this.first.addEnI(e,i);
        }
    }

    public void addAvantX(Element E,Element x){
        if(this.first.getEl()==x){
            this.first=new Cellule(E, this.first);
        }else if(this.first==null){
            this.first=new Cellule(E);
        }else{
            this.first.addAvantX(E,x);
        }
    }

    public void removeTout(){ //suffit de supprimer le 1er de la liste 
        if(this.first!=null){ //faut pas faire le teste 
            this.first=null; //IDIOTE 
        }
    }

    public void removeI(int i ){
        if(i<=0 || this.first==null){
            this.first=null;
        }else{
            this.first.removeI(i);
        }
    }

    public Liste pair(){
        if(this.first==null){
            return new Liste();
        }else{
            return this.first.pair();
        }
    }
}
