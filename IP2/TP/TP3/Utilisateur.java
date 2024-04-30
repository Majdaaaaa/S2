package TP.TP3;

import java.util.Scanner;
//exo1
//Q1
public class Utilisateur{
    private String pseudo;
    private String motDePasse;
    private final String adresseMail;
    //Q2
    //tout ce qui n'as de "public" ou "private" est public par defaut 
    Utilisateur(String pseudo,String motDePasse,String adresseMail ){
        this.pseudo=pseudo;
        this.motDePasse=motDePasse;
        this.adresseMail=adresseMail;
    }
    //Q3.a
    boolean testMotDePasse (String c){
        /*if(this.motDePasse.equals(c)){
            return true;
        }else{
            return false;
        }*/
        return (this.motDePasse.equals(c));
    }
    //Q3.b
    void changerMotDePasse(String motdePasse,String nouveauMotDePasse){
        if(testMotDePasse(motdePasse)==true){
            this.motDePasse=nouveauMotDePasse;
        }
    }
    //Q4.a
    String getPseudonyme(){
        return this.pseudo;
    }
    //Q4.b
    void setPseudonyme(){
        Scanner console = new Scanner(System.in);
        String a=this.getPseudonyme();
        System.out.println("Vous souhaitez changer de pseudo "+this.pseudo+" ?");
        System.out.print("Veuillez entrez votre mot de passe: "); 
        motDePasse=console.next();
        if(motDePasse.equals(this.motDePasse)){
            System.out.print("Entrez votre nouveau pseudo: ") ;
            pseudo=console.next();
            if(pseudo.equals(a)){
                System.out.print("Veuillez rentrez un pseudo different de l'actuel: ");
                pseudo=console.next();
                System.out.println("Bravo!!! voici votre nouveau pseudo: "+this.pseudo);
            }else{
                System.out.println("Bravo!!! voici votre nouveau pseudo: "+this.pseudo);
            }
        }
    }

    
//pour l'index faut decaler 


}