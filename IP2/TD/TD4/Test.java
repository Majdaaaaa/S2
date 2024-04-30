package TD.TD4;

public class Test {
    public static void main(String[] args){
        //Q3
        Enclos e=new Enclos();
        //comme dans une pile le dernier qu'on ajoute est affiché en 1er 
        e.ajouter("Carnivore");
        e.ajouter("Herbivore");
        e.ajouter("Herbivore");
        // c a la 1ere cellule qu'on delegue tout le travil donc on cree nos fnctions dans cellules et on les applique autre part 
        System.out.println(e.taille());
        e.trans();
        e.afficher();
        //e.trans();
        //e.afficher();
        //ex2
        //Q1: toujours 1


    }
}
