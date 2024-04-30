package TD.TD3;

public class FileDAttente {
    Client[] clientsPossibles;
    int premierPlaceLibre;

    public FileDAttente(){
        this.clientsPossibles=new Client[10];
        this.premierPlaceLibre=0; //si on met pas ca java initilise par defaut a 0 mais autre language non 
    }

    public int getTaille(){
        return this.premierPlaceLibre; 
    }

    public boolean ajouterClient(Client x){
        if(x==null){  //c bien mais ici inutile car dans egal on verifie ca 
            return false;
        }
        if(this.premierPlaceLibre>=this.clientsPossibles.length){
            return false;  
        }
        for(int i=0;i<this.premierPlaceLibre;i++){  //i< a pas la longeur du tableau car meme en faisant 10 de taille le tableau peut etre vide, si on fait avec le tableau faut verifier si la case est libre 
            if(!(this.clientsPossibles[i].egal(x))){ //if(..()==false) --> if(!..())   if(..()==true) --> if(..())  
                return false;
            }
            this.clientsPossibles[this.premierPlaceLibre]=x;
            this.premierPlaceLibre++;
        }
        return true;
    }

    public void desiste(Client x){
        int pos=0;
        for(;pos<this.premierPlaceLibre;pos++){
            if(this.clientsPossibles[pos].egal(x)){
                break; //le for s'arrete 
            }
            if(pos==this.clientsPossibles.length){ 
                return; //sort du if (un return sans rien ca sort juste )
            }
            for(int i=pos+1;i<this.premierPlaceLibre;i++){
                this.clientsPossibles[i-1]=this.clientsPossibles[i]; //decaler le tableau de 1 
            }
            this.clientsPossibles[this.premierPlaceLibre-1]=null;
            this.premierPlaceLibre--;
        }
    }
    
    public Client extraitPremier(){
        if(this.getTaille()==0){
            return null;
        }
        Client res=this.clientsPossibles[0];
        desiste(res);
        return res;
    }

    public void afficher (){
        for(int i=0;i<premierPlaceLibre;i++){
             System.out.println((i+1) +"."+ this.clientsPossibles[i]);
        }
    }
}
