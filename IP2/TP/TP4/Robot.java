package TP.TP4;

public class Robot{
    private final char nom; 
    private int energie;
    private final String texte; //ce qu'il doit dire 

    public Robot(char nom, String paroles ){
        this.nom=nom;
        //une energie random entre 10 et 20
        energie= 10 + (int)(Math.random() *11);
        texte=paroles;
    }
   
    public void description(){
        System.out.println("Robot "+this.nom+" dit "+this.texte+" quand il parle et a "+this.energie+" points d'enrgie");
    }
   
    public boolean nomCorrect(){
        if(this.nom=='a'|| this.nom=='b'|| this.nom=='c'|| this.nom=='d'|| this.nom=='e'|| this.nom=='f'|| this.nom=='g'|| this.nom=='h'|| this.nom=='i'|| this.nom=='j'|| this.nom=='k'|| this.nom=='l'|| this.nom=='m'|| this.nom=='n'|| this.nom=='o'|| this.nom=='p'|| this.nom=='q'|| this.nom=='r'|| this.nom=='s'|| this.nom=='t'|| this.nom=='u'|| this.nom=='v'|| this.nom=='a'|| this.nom=='w'|| this.nom=='x'|| this.nom=='y'|| this.nom=='z' ){
            return true;
        }else{
            return false;
        }
    }
   
    public char getNom(){
       return this.nom; 
    }
    public int getEnergie(){
        return this.energie;
    }
    public String getTexte(){
        return this.texte;
    }
}