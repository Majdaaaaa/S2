package TP.TP2;

public class Etudiant{
    final String prenom; //prenom
    final String nom; //nom
    double note; //note de l'etudiant 

    static int nombreDEtudiant =0;
    static double sommeDesNotes=0;
    //Q3
    public Etudiant (String prenom, String nom,double note) {
        this.prenom=prenom;
        this.nom=nom;
        this.note=note;
        nombreDEtudiant++;
        sommeDesNotes=sommeDesNotes+note;
        if(nombreDEtudiant<0){
            nombreDEtudiant=0;
        }
    }
    //Q6
     void afficher() { //methode non static 
        System.out.print(this.prenom+" ");
        System.out.print(this.nom+": ");
        System.out.print(this.note+" ");
        System.out.println();
    }
    //Q6.b
     static void afficher2(Etudiant e){ //methode static 
        System.out.println(e.prenom+" " + e.nom +": " + e.note);
    }
    //Q8
     boolean estAdmis(){
        if(this.note>0){
            return true;
        }else{
            return false;
        }
    }
    //Q9
     static double moyenne(){
        return sommeDesNotes/nombreDEtudiant;
    }
    //Q1
     boolean meilleurQueLaMoyenne(){
        if(this.note>= moyenne()){
            return true;
        }else{
            return false;
        }
    }
    //Q11
     void modifierNote(double nouvelleNote){
        sommeDesNotes=sommeDesNotes-this.note;
        this.note=nouvelleNote;
        sommeDesNotes=sommeDesNotes+this.note;
    }
}