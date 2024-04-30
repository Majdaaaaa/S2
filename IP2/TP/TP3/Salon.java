package TP.TP3;

//exo3
public class Salon{
    //Q1
    private Utilisateur[] tabUtilisateurs;
    private Message[] tabMessage;
    int indexLibreMessage;
    int indexLibreUtilisateur;
    Salon(Utilisateur[] tabUtilisateurs, Message[] tabMessage,int indexLibreMessage,int indexLibreUtilisateur){
        this.tabUtilisateurs=new Utilisateur[10];
        this.tabMessage=new Message[10];
        this.indexLibreMessage=0;
        this.indexLibreUtilisateur=0;
    }
    //Q2
    boolean estPresent (Utilisateur u){
        boolean res=false;
        boolean res2=true;
        for(int i=0;i<this.tabUtilisateurs.length;i++){
            if(this.tabUtilisateurs[i]==(u)){
                return res2;
            }else{
                return res;
            }
        }
        return true;
    }


}