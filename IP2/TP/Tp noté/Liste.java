public class Liste {
    Cellule premiere;

    public boolean estTriee(){
        if(this.premiere!=null){
            return this.premiere.estTriee();
        }else{
            return true; //puisque vide 
        }
    }
    //Corection 
    public boolean estTrieeCorr(){
        if(this.premiere!=null){
            return this.premiere.estTriee();
        }else{
            return true; 
        }
    }

    public int moyenne(){
        if(this.premiere!=null){
            return this.premiere.moyenne();
        }else{
            return 0;
        }
    }
    //Correction 
    public int moyenneCorr(){
        if(this.premiere==null){
            return -1;
        }
        return this.premiere.moyenneCorr();
    }

    public boolean aTripletPythagoricien(){
        if(this.premiere!=null){
            return this.premiere.aTripletPythagoricien();
        }else{
            return false;
        }
    }

    public static Liste tri(Liste l){
        Liste l2=new Liste();
        l2.premiere.ajout(Cellule.tri(l2.premiere));
        return l2;
    }

    public void inverse(){
        if(this.premiere!=null){
            this.premiere=this.premiere.inverse(null);
        }
    }

}