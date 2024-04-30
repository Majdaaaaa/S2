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

    public static Noeud test(){
        Noeud[] n=new Noeud[10];
        n[4]=new Noeud (4);
        n[1]=new Noeud(1,n[4],null);
        n[0]=new Noeud(0);
        n[7]=new Noeud(7, n[0], n[1]);
        n[8]=new Noeud(8);
        n[6]=new Noeud(6,null,n[8]);
        n[2]=new Noeud(2);
        n[9]=new Noeud (9,n[6],n[2]);
        n[5]=new Noeud(5, null, n[9]);
        n[3]=new Noeud(3,n[5],n[7]);
        return n[3];
    }

    public void affichePenche(){
        this.sommet.affiche(0);
    }
    
}
