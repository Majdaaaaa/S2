public class Cellule {
    private int val;
    private Cellule suivant;
    private Cellule precedent;

    public void setPrec(Cellule c){
        this.precedent=c;
    }

    //EXO1
    public static boolean mergeTest(Cellule l1,Cellule l2){
        boolean res=false;
        if(l1.suivant!=null && l2.suivant!=null ){
            if(l1.suivant.suivant==l2.suivant.suivant){
                res=true;
            }
            mergeTest(l1.suivant,l2.suivant);
        }
        return res;
    }

    public void print(){
        System.out.println(val);
    }

    public static boolean mergeTestIt(Cellule l1,Cellule l2){
        //faut tester si les Cellules sont egaux pas leur valeurs 
        Cellule tmp1=l1;  //parcours l1
        while(tmp1!=null){
            Cellule tmp2=l2; //parcours l2
            while(tmp2!=null){
                if(tmp2==tmp1){
                    return true;
                } 
                tmp2=tmp2.suivant;
            }
            tmp1=tmp1.suivant;
        }
        return false;
    }

    //EXO2
    //V1
    public void resetPreRec(Cellule c){
        this.precedent=c;
        if(this.suivant !=null){
            this.suivant.resetPreRec(this); //fait l'appel avec le precedent en argument
        }
    }
    //V2
    public void resetPreRec2(){
        if(this.suivant !=null){
            this.suivant.precedent=this;
            this.suivant.resetPreRec2();
        }
    }

    public void resetPreIt(){
        Cellule tmp=this;
        while(tmp.suivant!=null){
            tmp.suivant.precedent=tmp;
            tmp=tmp.suivant; 
        }        
    }

    public void printBackwardRec(){
        System.out.println(this.val);
        if(this.precedent!=null){
            this.precedent.printBackwardRec();
        }
    }

    public Cellule dernier() { //renvoie la derniere cellule de la liste 
        if(this.suivant==null){
            return this;
        }else{
            return this.suivant.dernier();
        }
    }

    public void printBackwardIt(){ 
        Cellule tmp=this;//this=la derniere cellule
        while(tmp.precedent!=null){
            System.out.println(this.val);
            tmp=tmp.precedent;
        }
    }

    //EXO3
    
}
