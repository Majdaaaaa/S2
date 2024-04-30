package TP.TP1.DesFruitsEtDesPaniers;
//E1Q8
public class Panier {
    public Fruit[] contenu;
    //public Fruit F;
    //Constructeur 
    public Panier(Fruit[] f){
        contenu=f;
    }
    public Panier(){
        contenu=new Fruit[0];
    }
    public Panier (Fruit f,Panier p){
        Fruit[] pp =new Fruit[p.contenu.length + 1];
        for (int i=0; i<p.contenu.length;i++){
            pp[i]=p.contenu[i];
        }
        pp[p.contenu.length]=f;  
    }
    //E1Q9
    public static void afficher(Panier p){
        System.out.println("Ce panier contient: ");
        for(int i=0;i<p.contenu.length;i++){
            Fruit.afficher(p.contenu[i]);
        }
    }
    //Q1E10
    public static void hybridPanier(Fruit f,Panier p){
        
    }
    
}