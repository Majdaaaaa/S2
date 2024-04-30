package TP.TP5;

public class Cellule{
    private int valeur;
    private Cellule suivante;
    //1.2. c fonder car on declare la cellule qui viens apres cette cellule la 
    //1.Q3
    public Cellule(int b){
        this(b,null);
    }
    //1.Q4
    public Cellule(int valeur,Cellule suivant){
       this.valeur=valeur;
       this.suivante=suivant;
    }
    //1.Q7
    public int getVal(){
        return this.valeur;
    } 
    public Cellule getSuivante(){
        return this.suivante;
    }
    //2.Q1
    public void description(){
        Cellule tmp=this;
        System.out.print(tmp.valeur +" ");
        tmp=tmp.suivante;
        if(tmp==null){
        }else{
            tmp.description();
        }
        //System.out.println();
    }

    //2.Q3
    public int taille(){
        if(this.suivante==null){
            return 1;
        }else{
            return 1+suivante.taille();
        }
    }
    public int somme(){
        if(this.suivante==null){
            return this.valeur;
        }else{
            return this.valeur+suivante.somme();
        }
    }
    //2.Q4
    public boolean egal(Cellule arg){
        if(this.valeur!=arg.valeur){
            return false;
        }
        if(this.suivante!=null && arg.suivante!=null){
            return this.suivante.egal(arg.suivante);
        }
        return true;
    }
    //2.Q5
   public void ajouter_en_i(int i,int v){
        if(this.suivante != null && (i>1)){
            suivante.ajouter_en_i(i-1, v);
        }else{
            this.suivante=new Cellule (v,suivante);
        }
   }
    //2.Q6
}