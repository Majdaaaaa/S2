import java.util.ArrayList;

public class Toboggan {
    FileToboggan file;

    public Toboggan(FileToboggan file) {
        this.file = file;
    }

    public int jouer(){
        int res=0;
        while(!file.estVide()){
            file.unTour();
            res++;
        }
        return res;
    }

    public ArrayList<Enfant> jouer2(){
        ArrayList<Enfant> l=new ArrayList<Enfant>(); //ArrayList c comme les list qu'on fait mais qui est crée de base 
        while(!file.estVide()){
            Enfant e=file.unTour();
            if(e!=null){
                l.add(e);
            }
        }
        return l;
    }

    public void laisserPasser(){
        if(this.file!=null){
            this.file.laisserPasser();
        }
    }
    



}
