public class Test {
    public static void main(String[] args) {
        Robot r1=new Robot('A',"Coucou");
        Robot r2=new Robot('B', "null");
        Robot r3=new Robot('C', "LOLO");
        //System.out.println(r1.finiDeParler());
        //System.out.println(r1.parle(6));
        //System.out.println(r1.finiDeParler());
        TableRonde t=new TableRonde(r1);
        t.affiche();
        t.ajouteRob(r2);
        t.ajouteRob(r3);
        t.affiche();
    }
}
