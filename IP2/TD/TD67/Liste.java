package TD.TD67;

public class Liste{
    private Element premier;
    private Element dernier;

    /*public Liste(){
        this.premier=null;
        this.dernier=null;
    }*/
    public int longueur(){
        if(this.premier!=null){
            return this.premier.longueur();
        }else{
            return 0;
        }
    }

    public void afficher(){
        if(this.premier!=null){
            this.premier.afficher();
        }
    }

    public void afficherInverse(){
        if(this.dernier!=null){
            this.dernier.afficherInverse();
        }
    }

    public void ajouterDebut(int v){
        if(this.premier==null){
            Element e=new Element(v,null,null);
            this.premier=e;
            this.dernier=e;
        }else{
            Element e=new Element(v,this.premier,null);
            this.premier.setPre(e);
            this.premier=e;
            
        }
    }

    public void ajouterFin(int v){
        if(this.dernier==null){
            Element e=new Element(v,null,null);
            this.premier=e;
            this.dernier=e;
        }else{
            Element e=new Element (v,null,this.dernier);
            this.dernier.setSuiv(e);
            this.dernier=e;
        }
    }

    public void ajouterAvant(Element e,int v){
        if(this.premier==e){
            ajouterDebut(v);
        }else if(this.premier!=null){
            this.premier.ajouterAvant(e,v);
        }
    }

    public void supprimer(Element e){
        if(this.premier==e){
            this.premier=this.premier.getSuiv();
            if(this.premier==null){
                this.dernier=null;
            }
        }else if(this.premier!=null){
            Element precedentDeE=this.premier.supprimer(e);
            if(precedentDeE!=null && precedentDeE.getSuiv()==null){
                this.dernier=precedentDeE;
            }
        }
    }

    public int somme(){
        if (this.premier!=null){
            return this.premier.somme();
        }else{
            return 0;
        }
    }

    public boolean estTriee(){
        if(this.premier==null){
            return true;
        }
        return this.premier.estTriee();
    }
}