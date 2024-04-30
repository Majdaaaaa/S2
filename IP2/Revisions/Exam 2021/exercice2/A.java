package exercice2;
//Liste
public class A {
    private B tete;
    public A(){
        this.tete=null;
    }
    public void ajout(int x){
        B l=new B(x,tete);
        tete=l;
    }
    public void afficheListe(){
        if(this.tete!=null){
            this.tete.affiche();
        }
    }
    //affiche la position de la tortue quand le lievre arrive 
    //si la liste est vide retourne nulle psq aucun ne vas nulle part 
    //la liste a un element retourne que l'element psq ils ont null part ou aller 
    //si ya des des trucs la tortue vas au millieu 
    public void affichePastMilieu(){
        if(tete==null){
            System.out.println(0);
        }else{
            tete.affichePastMilieu(tete,tete);
        }
    }

    public boolean isListe(){
        if(tete==null){
            return false;
        }
        return B.isListe(tete,tete);
    }
}
