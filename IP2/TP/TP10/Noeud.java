public class Noeud {
    private int etiquette; 
    private Noeud gauche; 
    private Noeud droit;
    public int getEt(){
        return this.etiquette;
    }
    public boolean estFeuille(){
        return this.gauche==null && this.droit ==null;
    }

    public Noeud(int etiquette, Noeud g, Noeud d) { 
        this.etiquette = etiquette;
        this.gauche = g;
        this.droit = d;
    }
    public Noeud(int etiquette) {
        this(etiquette,null,null);
    }
    public void afficheInfixe() {
        if(this.gauche!=null){
            this.gauche.afficheInfixe();
        }
        System.out.print(this.etiquette+",");
        if(this.droit!=null){
            this.droit.afficheInfixe();
        }
    }

    public void affichePrefixe(){
        System.out.print(this.etiquette+",");
        if(this.gauche!=null){
            this.gauche.affichePrefixe();
        }
        if(this.droit!=null){
            this.droit.affichePrefixe();
        }
    }

    public void afficheSuffixe(){
        
        if(this.gauche!=null){
            this.gauche.afficheSuffixe();
        }
        if(this.droit!=null){
            this.droit.afficheSuffixe();
        }
        System.out.print(this.etiquette+",");
    }
    public int nbDeNoeuds() {
        int res=0;
        if(this.gauche!=null){
            res+=1+this.gauche.nbDeNoeuds();
        }
        if(this.droit!=null ){
            res+=1+this.droit.nbDeNoeuds();
        }
        return res;
    }
    public int somme() {
        int res=0;
        if(this.gauche!=null){
            res+=this.gauche.etiquette+this.gauche.somme();
        }
        if(this.droit!=null){
            res+=this.droit.etiquette+this.droit.somme();
        }
        return res;
    }
    public int profondeur() { //compte les trait 
        int res=0;
        int tmp=0;
        if(this.gauche!=null){
            res=1+this.gauche.profondeur();
        }
        if(this.droit!=null){
            tmp=1+this.droit.profondeur();
        }
        return Math.max(tmp,res);
    }

    public boolean recherche(int e){
        boolean g=false;
        boolean d=false;
        if(this.gauche!=null){
            if(this.gauche.etiquette==e ){
                g=true;
            }else{
                g=this.gauche.recherche(e);
            }   
        }
        if(this.droit!=null){
            if(this.droit.etiquette==e ){
                d=true;
            }else{
                d=this.droit.recherche(e);
            }
        }
        return g||d ;
    }

    public boolean rechercheV2(int e){
        boolean g=false;
        boolean d=false;
        if(this.etiquette==e){  //pas besoin de tester dans arbre 
            return true;
        }
        if(this.gauche!=null){
           g=this.gauche.rechercheV2(e);
        }
        if(this.droit!=null){
            d= this.droit.rechercheV2(e);
        }
        return d|| g;
    }
    
    public Noeud copieTotale(){
        Noeud sommet=this;
        //faut crée un nouveau noeud a chaque fois 
        Noeud g=this.gauche;
        Noeud d=this.droit;
        if(g!=null){
            //faire g=g.copieTotale
            sommet.gauche=g;
            g.copieTotale();
        }
        if(d!=null){
            sommet.droit=d;
            d.copieTotale();
        }
        return sommet;
    }

    public void affiche (int p){
        if(this.droit!=null){
            this.droit.affiche(p+1);
        }
        this.espace(p);
        if(this.gauche!=null){
            this.gauche.affiche(p+1);
        }
    }

    public void espace(int n){
        for(int i=0;i<n;i++){
            System.out.print(" ");
        }
        System.out.println(this.etiquette);
    }

}
