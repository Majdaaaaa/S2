package exercice2;

public class test {
    public static void main(String[] args) {
        A l=new A();
        l.ajout(4);
        l.ajout(3);
        l.ajout(2);
        l.ajout(1);
        l.ajout(0);
        l.afficheListe();
        l.affichePastMilieu();
        System.out.println(l.isListe());
    }
}
