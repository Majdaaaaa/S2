package TD.TD67;

public class Element {
    private int valeur;
    private Element suivant;
    private Element precedent;

    public Element (int valeur, Element suivant,Element precedent){
        this.valeur=valeur;
        this.suivant=suivant;
        this.precedent=precedent;
    }

    public void setPre(Element e){
        this.precedent=e;
    }
    public void setSuiv(Element e){
        this.suivant=e;
    }
    public Element getSuiv(){
        return this.suivant;
    }
    public int longueur(){
        Element tmp=this;
        int res=0;
        while(tmp!=null){ //demander pour ca 
            res++;
            tmp=tmp.suivant;
        }
        return res;
    }
    //version recursive
    public int longueurRec(){
        if(this.suivant!=null){
            return 1+this.suivant.longueurRec();
        }else{
            return 1;
        }
    }

    public void afficher(){
        Element tmp=this;
        while(tmp!=null){
            System.out.println(tmp.valeur);
            tmp=tmp.suivant;
        }
    }

    public void afficherInverse(){
        Element tmp=this;
        while(tmp!=null){
            System.out.println(tmp.valeur);
            tmp=tmp.precedent;
        }
    }

    public void afficherInvRec(){
        System.out.println(this.valeur);
        if(this.precedent!=null){
            this.precedent.afficherInvRec();
        }
    }

    public void ajouterDebut(Element e){
        this.precedent=e;
        e.precedent=null;
    }

    public void ajouterAvantRec(Element e,int v){
        if(this.suivant==e){
            Element n=new Element(v,e,this);
            this.suivant=n;
            e.precedent=n;
        }else if(this.suivant!=null){
            this.suivant.ajouterAvant(e,v);
        }
    }

    public void ajouterAvant(Element e,int v){
        Element tmp=this;
        while (tmp!=null){
            if(tmp==e){
                Element n=new Element (v,e,e.precedent);
                tmp.suivant=e;
                e.precedent=n;
                break; //s'arrete apres avoir fait le if  arrete le while psq break arrete que les boucle 
            }
            tmp=tmp.suivant;
        }
    }

    public Element supprimerRec(Element e){
        if(this.suivant==null){
            return null;
        }else if(this.suivant !=null){
            return this.suivant.supprimer(e);
        }else{
            this.suivant=this.suivant.suivant;
            if(this.suivant.suivant!=null){
                this.suivant.suivant.precedent=this;
            }
            return this;
        }
    }

    public Element supprimer(Element e){
        Element tmp=this;
        Element r=null;
        while(tmp!=e){
            if(tmp.suivant==e){
                tmp.suivant=tmp.suivant.suivant;
                tmp.suivant.precedent=tmp;
                r=tmp;
                break;
            }
        }
        tmp=tmp.suivant;
        return r;
    }
    
    public int somme(){
        Element tmp=this;
        int res=0;
        while(tmp!=null){
            res+=tmp.valeur;
            tmp=tmp.suivant;
        }
        return res;
    }

    public int sommeRec(){
        int res=this.valeur;
        if(this.suivant!=null){
            res+=this.suivant.sommeRec();
        }
        return res;
    }

    public boolean estTriee(){
        if(this.suivant!=null){
            return this.valeur<this.suivant.valeur && this.suivant.estTriee();
        }else{
            return true;
        }
    }

    
}
