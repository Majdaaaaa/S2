public class Test {
    public static void main (String[] args){
        Liste l=new Liste();
        Liste r=new Liste ();
        Element e=new Element(3);
        Element e1=new Element(5);
        Element e2=new Element(4);
        Element e3=new Element(0);
        Element e4=new Element(2);
        l.addDebut(e);
        l.addDebut(e1);
        l.addFin(e2);
        l.addFin(e1);
        l.addEnI(e3, 2);
        l.addAvantX(e4, e2);
        //l.removeTout();
        //l.afficher();
        l.removeI(4);
        System.out.println();
        l.afficher();
        System.out.println();
        l.pair().afficher();
    }
}
