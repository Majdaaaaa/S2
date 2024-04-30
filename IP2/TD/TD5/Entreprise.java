public class Entreprise {
    private Cellule premier;
    
    //constructeur par defaut
    public Entreprise(Cellule premier){
        this.premier=premier;
    }
    public void affiche(){
        if(this.premier!=null){
            this.premier.affiche(); //applique la fonction a la 1ere cellule 
        }
    }

    public boolean appartient(String n){
        if(this.premier==null){
            return false;
        }else if (this.premier.getEmp().getNom().equals(n)){
            return true;
        }else{
            return this.premier.appartient(n);
        }
    } 

    public void ajout(Employe emp){
        if(this.premier==null){
            this.premier= new Cellule(emp);
        }else if(!this.appartient(this.premier.getEmp().getNom())){
            this.premier=new Cellule(emp,this.premier);
        }
    }

    public void demission(String n){
        if(this.premier==null){
            return;
        }else if ( this.premier.getEmp().getNom().equals(n) ) {
            this.premier=this.premier.getSui();
        }else{
            this.premier.demission(n);
        }
    }

    public boolean augmente(String nom,int montant){
        if(this.premier==null || montant <= 0){
            return false;
        }
        return this.premier.augmente(nom,montant);
    }

    public Entreprise choixSalaire(int min,int max){
        Cellule c=null;
        if(this.premier!=null){
            c= this.premier.choixSalaire(min,max);
        }
        return new Entreprise(c);
    }
    
    public boolean croissante(){
        if(this.premier==null){
            return true;
        }else{
            return this.premier.croissante();
        }
    }

    public void ajoute(Employe e){
        if(this.premier==null || this.premier.getEmp().getSal() >= e.getSal()){
            this.premier=new Cellule (e,this.premier);
        }else{
            this.premier.ajoute(e);
        }
    }

}
