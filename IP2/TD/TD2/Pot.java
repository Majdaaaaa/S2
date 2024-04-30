package TD.TD2;

public class Pot {
    private Confiture c;
    private int quantite;
    private int id;
    private static int nv_id=0; // static car on doit l'appeler pour toute la classe et pas pour un objet 

    public Pot(Confiture c,int quantite){
        this.c=c;
        this.quantite=quantite;
        this.id=nv_id;
        nv_id++;
    }

    public String description(){
        return "C'est un pot de Confiture de " + this.c.description()+" de "+ this.quantite +"g.";
    }
    public static int getNvId(){ //nous donne le nombre de pot creer 
        return nv_id;
    }

}
