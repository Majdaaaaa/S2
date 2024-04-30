package Arbre;

public class Arbre {
    private Noeud sommet;
    public Arbre(){
        this.sommet=null;
    }

    public void afficheInfixe(){
        if(this.sommet!=null){
            this.sommet.afficheInfixe();
        }
    }
}
