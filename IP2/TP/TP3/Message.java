package TP.TP3;

//exo2
public class Message{
    private Utilisateur u;
    private final String Message;
    
    Message(String Message,Utilisateur u){
        this.Message=Message;
        this.u=u;
    }
    
    void affichermes(){
        System.out.println(this.Message + " Par: "+ this.u.getPseudonyme());
    }
}