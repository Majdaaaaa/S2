package TP.TP1.DesFruitsEtDesPaniers;

public class Fruit{
    public String nom; // le nom du fruit
    public int poids; // le poids du fruit en grammes
    //ici c un constructeur 
    public Fruit(String n, int p){ 
        //A COMPLETER
        this.nom=n;
        this.poids=p;
    }
    //E1Q6
    public static void afficher (Fruit f){
        String l= f.nom;
        int r= f.poids;
        System.out.println("Ce fruit est un(e) " + l +" et pese " + r + " grammes");
    }
    //E1Q7
    public static Fruit hybridation (Fruit f1, Fruit f2){
        String n= f1.nom + f2.nom;
        int p= f1.poids + f2.poids;
        Fruit f3= new Fruit(n, p);
        return f3;
    }


}