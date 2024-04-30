package TD.TD3;

public class Client{
    private final String nom;
    private final String prenom;

    public Client (String n,String p){
        this.nom=n;
        this.prenom=p;
    }
    //on fait des getters quand les variables sont privées et c'st grace au getters qu'on peut y accéder en dehors de la class 
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    //tester si deux client sont égaux 
    public boolean egal(Client c){
        if(c==null){
            return false;
        }
        return this.prenom.equals(c.prenom) && this.nom.equals(c.nom); // ca retourne direct un boolean 
    }

}