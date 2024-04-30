package exercice3;

public class Arbre {
    private Noeud sommet;

    void nommeEspece(){
        if(sommet!=null){
            sommet.nommeEspece();
        }
    }
    
}
