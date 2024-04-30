package TP.TP2;

public class Test {
    public static void main (String[] args){
        //Q2: 
        //static: l'attribut appartient a la classe et non a un objet specifique
        //final: une fois une valeur donné elle est pas modifiable 
        Etudiant e1 = new Etudiant("Luke", "Skywalker", 8.25);
        Etudiant e2 = new Etudiant("Leia", "Organa", 11.75); 
        Etudiant e3= new Etudiant("Majda", "Benmalek", 14.25);
        System.out.println("nb d’etudiants: "+Etudiant.nombreDEtudiant);
        System.out.println("somme des notes: "+Etudiant.sommeDesNotes);
        //Q7
        e1.afficher(); // Skywalker Luke: 8.25 
        e2.afficher(); // Organa Leia: 11.75
        Etudiant.afficher2(e1);
        System.out.println(e1.estAdmis());
        System.out.println(Etudiant.moyenne());
        System.out.println(e1.meilleurQueLaMoyenne());
        e2.modifierNote(19.5);
        e2.afficher();
        System.out.println("moyenne: "+Etudiant.moyenne());
        e3.afficher();
        //EXO2
        Trio t1= new Trio(e1,e2,e3);
        t1.premier().afficher();
       // System.out.println(t1.classement("Luke","Skywalker"));
    }
    

}
