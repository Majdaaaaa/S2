package TP.TP5;

public class Test {
    public static void main(String[] args){
        Cellule c=new Cellule(1);
        Cellule c1=new Cellule(2,c);
        Cellule c2=new Cellule(3,c1);
        ListeDEntiers l=new ListeDEntiers();
        ListeDEntiers l1=new ListeDEntiers();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        
        
        
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l.description();
        System.out.println();
        l1.description();
        System.out.println();
        System.out.println(l.taille());
        System.out.println(l.somme());
        System.out.println(l.egal(l1));
        l.ajouter_en_i(2, 0);
        l.description();


    }
}
