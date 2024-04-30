package TP.TP4;

public class Groupe {
    private Cellule chefdeFile; //le 1er 
    public Groupe(){
        this.chefdeFile=null;
    }

    public void prendreTete(Robot r){
        if((chefdeFile==null) && r.nomCorrect()){
            //chefdeFile=new Cellule(r);
        }else{
            prendreTete(r);
        }
    }
}
