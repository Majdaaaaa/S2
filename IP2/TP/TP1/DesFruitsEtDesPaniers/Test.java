package TP.TP1.DesFruitsEtDesPaniers;

public class Test {
    //E1Q5
    public static void afficher (Fruit f){
        String l= f.nom ;
        int r= f.poids;
        System.out.println("Ce fruit est un(e) " + l +" et pese " + r + " grammes");
    }

    public static void main(String[] args){
        //FRuit
        Fruit f = new Fruit("Pamplemousse", 330); 
        Fruit g = new Fruit("Pamplemousse", 330); 
        Fruit r= new Fruit("Fraise", 100);
        Fruit h = f;
        System.out.println("Test Termine");
        afficher(f);
        Fruit.afficher(f);
        Fruit.afficher(Fruit.hybridation(f,r));
        //Panier
        Panier t=new Panier();
        Panier p=new Panier(f,t);
        Panier d=new Panier(g,p);
        Panier j=new Panier(r,d);
        //Panier.afficher(j);
        Fruit m= new Fruit("Melon",500);
        //Panier.hybridPanier(m, j);
    } 
}