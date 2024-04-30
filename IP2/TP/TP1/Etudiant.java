package TP.TP1;

public class Etudiant{
    String nom,prenom; // les nom et prenom de l’etudiant
    int num; // le numero d’etudiant
    int note; // la note de l’etudiant (sur 20)

    public Etudiant(String nom,String prenom ,int num,int note){
        this.nom=nom;
        this.prenom=prenom;
        this.num=num;
        this.note=note;
    }
    public static void afficher(Etudiant etu){
        System.out.println("Nom: "+etu.nom+" Prénom: "+etu.prenom+" (Numero d'étudiant "+ etu.num+") : Note "+etu.note);
    }
    public static boolean estAdmis (Etudiant etu){
        if (etu.note>=10){
            return true;
        }else if(etu.note<10){
            return false;
        }
        return true;
    }
    public static String mention(Etudiant etu){
        if(etu.note>=16 && etu.note<=20){
            return "Trés bien";
        }else if(etu.note>=14 && etu.note<16){
            return "Bien";
        }else if(etu.note>=12 && etu.note<14){
            return "Assez bien";
        }else if(etu.note>=10 && etu.note<12){
            return "Passable";
        }else if (etu.note>=0 && etu.note<10){
            return "Ajourné";
        }else{
            return "Note invalide";
        }

    }
    
} 