package TD.TD4;

public class Cellule {
    private Animal a;
    private Cellule suivant;


    Cellule(Animal a,Cellule c){
        this.a=a;
        this.suivant=c;
    }

    Cellule(Animal a){
        this(a,null);
    }

    public int taille(){
        Cellule tmp=this;
        int res=0;
        while(tmp!=null){
            res++;
            tmp=tmp.suivant;
        }
        return res;
    }

    public void trans(){ //possible aussi de ne pas faire ca sue cellule mais dans animal 
        Cellule tmp=this;
        while(tmp!=null){
            if(tmp.a.getRegime().equals("Herbivore")){
                tmp.a.setRegime("Carnivore");
                tmp=tmp.suivant;
            }else if(tmp.a.getRegime().equals("Carnivore")){
                tmp.a.setRegime("Herbivore");
                tmp=tmp.suivant;
            } 
        } 
    }
    
    public void afficher(){
        Cellule tmp=this;
        while(tmp!=null){
            System.out.println(tmp.a.getRegime());
            tmp=tmp.suivant;
            //tmp changent a chaque fois ce qui nous aide a parcourrir tout l'enclos
        }
    }
    //exo2
    public void repHerbivore (){
        Cellule tmp=this;
        while(tmp.suivant!= null){
            if(tmp.estHerbivore() && tmp.suivant.estHerbivore()){ //fonction a créer
                Animal bebe =new Animal ("Herbivore");
                Cellule c= new Cellule (bebe,tmp.suivant);
                tmp.suivant=c;
                tmp=tmp.suivant.suivant; //pas aller au suivant1 mais a l'autre 
            }else{
                tmp=tmp.suivant;
            }
        }
    }

    public boolean  estHerbivore(){
        return true; //pas vraiment ca mais juste pour enlever le rouge 
    }


}
