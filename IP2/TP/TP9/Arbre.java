public class Arbre {
    private Noeud sommet;
    public Arbre(Noeud sommet) { 
        this.sommet = sommet;
    } 
    /*public Arbre(){
        this(null);
    }*/

    public Arbre(Arbre A){
        this(A.sommet.copieTotale());
    }

    public Noeud getSom(){
        return this.sommet;
    }
   
    public void afficheInfixe(){
        if(this.sommet!=null){
            this.sommet.afficheInfixe();
        }
    }
    public void affichePrefixe(){
        if(this.sommet!=null){
            this.sommet.affichePrefixe();
        }
    }
    public void afficheSuffixe(){
        if(this.sommet!=null){
            this.sommet.afficheSuffixe();
        }
    }

    public int nbDeNoeuds(){
        if(this.sommet!=null){
            return this.sommet.nbDeNoeuds();
        }else{
            return 0;
        }
    }

    public int somme(){
        if(this.sommet!=null){
            return this.sommet.getEt()+this.sommet.somme();
        }else{
            return 0;
        }
    }

    public int profondeur(){
        if(this.sommet!=null){
            return this.sommet.profondeur();
        }else{
            return 0;
        }
    }

    public boolean recherche(int e){
        if(this.sommet.getEt()==e){
            return true;
        }else if(this.sommet==null){
            return false;
        }else{
            return this.sommet.rechercheV2(e);
        }
    }
}
