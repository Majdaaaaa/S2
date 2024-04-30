package TP.TP1;

public class Test2{
    public static void main (String[] args){
        Etudiant m=new Etudiant("Majda","Benmalek",22467898,13);
        Etudiant.afficher(m); 
        System.out.println(Etudiant.estAdmis(m));
        System.out.println(Etudiant.mention(m));
    }
}