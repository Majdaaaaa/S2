 
public class Cellule {
    private Employe emp;
    private Cellule suivant;

    public Cellule(Employe emp){
        this.emp=emp;
    }
    public Cellule (Employe emp, Cellule suivant ){
        this.emp=emp;
        this.suivant=suivant;
    }
    public Employe getEmp(){
        return this.emp;
    }
    public Cellule getSui (){
        return this.suivant;
    }
 
    public void affiche(){  //fct recursive 
        this.emp.description();
        if(suivant!=null){
            this.suivant.affiche();
        }
    }

    public boolean appartient(String n){ //recursive aussi c comme une boucle qui tourne a chaque fois pour verifier si un employer est la ou pas 
        if(this.emp.getNom().equals(n)){
            return true;
        }else if(this.suivant==null){
            return false;
        }else{
            return this.suivant.appartient(n);
        }
    }

    public void demission(String n){
        if(this.suivant!=null){
            if(this.suivant.emp.getNom().equals(n)){
                this.suivant=this.suivant.suivant;
            }else{
                this.suivant.demission(n);
            }
        }
    }

    public boolean augmente(String n, int M){
        if(this.emp.getNom().equals(n)){
            this.emp.augmente(M);
            return true;
        }else if(this.suivant !=null){
            return this.suivant.augmente(n,M);
        }else{
            return false;
        }
    }

    public Cellule choixSalaire(int min,int max){
        Cellule tmp=this;
        Cellule res=null;
        while(tmp!=null){
            if(tmp.emp.getSal()>=min && tmp.emp.getSal()<= max ){
                res=new Cellule(tmp.emp,res);
            }
            tmp=tmp.suivant;
            //suivant est une cellule l'oublie pas 
        }
        return res;
    }
    //version recursive 
    public Cellule choixSalaire2 (int min,int max){
        Cellule suivantRes=null;
        if(this.suivant!=null){
            suivantRes=this.suivant.choixSalaire2(min, max);
        }
        if(this.emp.getSal()>=min && this.emp.getSal()<=max){
            return new Cellule (this.emp,suivantRes);
        }
        return suivantRes;
    }

    public boolean croissante(){
        if(this.suivant==null){
            return true;
        }else{
            return this.emp.getSal()<= this.suivant.emp.getSal() && this.suivant.croissante();
        }
    }

    public void ajoute(Employe e){
        if(this.suivant==null){
            this.suivant=new Cellule(e);
        }else if(this.suivant.emp.getSal()<e.getSal()){
            this.suivant.ajoute(e);
        }else{
            this.suivant=new Cellule (e,this.suivant);
        }
    }

}
