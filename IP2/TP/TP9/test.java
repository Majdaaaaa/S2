public class test {
    public static void main(String[] args) {
        Noeud a = new Noeud(6,null,new Noeud(8)); 
        Noeud b = new Noeud(9, new Noeud(2), a);
        Noeud c = new Noeud(5, b, null);
        Noeud d = new Noeud(1, new Noeud(4), null);
        Noeud e = new Noeud(7, new Noeud(0), d); 
        Noeud f = new Noeud(3, c, e);
        Arbre g = new Arbre(f); 
        g.afficheInfixe();
        System.out.println();
        g.affichePrefixe();
        System.out.println();
        g.afficheSuffixe();
        System.out.println();
        System.out.println(g.nbDeNoeuds());
        System.out.println(g.somme());
        System.out.println(g.profondeur());
        System.out.println(g.recherche(8));
        Arbre A=new Arbre(g);
        A.afficheInfixe();
        System.out.println();
        A.affichePrefixe();
        System.out.println();
        A.afficheSuffixe();
        System.out.println();
    }
}