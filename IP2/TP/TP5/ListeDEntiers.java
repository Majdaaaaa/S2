package TP.TP5;

public class ListeDEntiers {
    private Cellule premier;
    //1.1. representer une liste vide: premier=null
    //1.Q5
    public ListeDEntiers(){
        this.premier=null;
    }
    //1.Q6
    public void add(int x){
        Cellule l=new Cellule(x,premier);
        premier=l;
    }

    //2.Q1
    public void description(){
        if(premier==null){
            System.out.println("la liste est vide");
        }else{
            this.premier.description();
        }
    }

    //2.Q3
    public int taille(){
        if(premier==null){
            return 0;
        }else{
            return premier.taille();
        }
    }
    public int somme(){
        if(premier==null){
            return 0;
        }else{
            return premier.somme();
        }
    }
    //2.Q4
    public boolean egal(ListeDEntiers arg){
        if(this.premier==null || arg.premier==null){
            return false;
        }else if(this.premier==null && arg.premier==null){
            return true;
        }else if(this.taille()!=arg.taille()){
            return false;
        }else if(this.somme()!=arg.somme()){
            return false;
        }else{
            return this.premier.egal(arg.premier);
        }
    }
    //2.Q5
    public void ajouter_en_i(int i,int v){
        if(this.premier==null){
            Cellule c=new Cellule(v);
        }else{
            this.premier.ajouter_en_i(i,v);
        }
    }
    //2.Q6
    /*public boolean supprimer_en_i(int i){
        if(this.premier==null){
            return false;
        }else{
            return this.premier.supprimer_en_i(i);
        }
    }*/
}
