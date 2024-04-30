package TD.TD4;

public class Enclos{
    private Cellule debut; //1er de l'enclos 

    public Enclos(){
        this.debut=null;
    }
    //Q2
    public void ajouter(String regime){  //changer le 1er de la liste 
        Animal a = new Animal(regime); 
        Cellule c=new Cellule(a,this.debut);    //this.debut = l'ancier 1er      c = le nouveau 1er 
        this.debut=c; 
    }
    //Q4
    public int taille(){
        if(this.debut==null){
            return 0;
        }
        return this.debut.taille();
    }
    //Q5
    public void trans(){
        if(this.debut!=null){
            this.debut.trans();
        }
    }
    //Q6
    public void afficher(){
        if(this.debut!=null){
            this.debut.afficher();
        }
    }


}