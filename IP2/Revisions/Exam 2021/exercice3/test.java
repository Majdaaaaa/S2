package exercice3;

public class test {
    public static void main(String[] args) {
        int[] fg={-1,5,3,-1,-1,9,-1,8,6,-1};

        int[] etiq={23,2,3,5,7,11,13,37,41,19};
        int [] fd={-1,4,0,-1,-1,-1,2,1,-1,-1};
        Arbre a=Arbre.build(etiq, fg, fd);
        a.affichePref();
    }
}
