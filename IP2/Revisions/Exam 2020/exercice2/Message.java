public class Message {
    private Cellule tete;
    public Message(){
        this.tete=null;
    }
    //boucle suivant=CharAti+1
    
    public void build(String s){
        this.tete=new Cellule(s.charAt(0));
        this.tete.build(s);
    }
    public boolean a_pour_prefixe(Cellule m){
        if(this.tete==null){
            return false;
        }
        return this.tete.a_pour_prefixe(m);
    }
}
