public class Page {
    //les 3 sont censées etre en private
    String adress;
    Page precedent;
    Page suivant; 


    public void setSuiv(Page suiv){
        this.suivant=suiv;
    }
    public Page getPrec(){
        return this.precedent;
    }
    public Page(String adress){
        this.adress=adress;
    }
    public Page(String adress,Page precedent,Page suivant){
        this.adress=adress;
        this.precedent=precedent;
        this.suivant=suivant;
    }

    public void afficher(){ //affiche tout les precedent
        Page tmp=this;
        while(tmp.precedent!=null){
            System.out.print("<-"+tmp.adress);
            tmp=tmp.precedent;
        }
        System.out.print("<-"+tmp.adress+"->");
    }
    public void afficher2(){//affiche les suivant
        Page tmp=this;
        while(tmp!=null){
            System.out.print("->"+tmp.adress);
            tmp=tmp.suivant;
        }
    }

    //Correction
    public void afficherCorr(){
        String res="";
        Page tmp=this.precedent;
        while(tmp!=null){
            res=tmp.adress+"<-"+res;
            tmp=tmp.precedent;
        }
        res+=this.adress;
        tmp=tmp.suivant;
        while(tmp!=null){
            res+="->"+tmp.adress;
            tmp=tmp.suivant;
        }
        System.out.println(res);
    }

    //Correction suppcourante
    public Page supprimeCourantCorr(){
        Page prec=this.precedent;
        Page suiv=this.suivant;
        Page res=null;
        if(prec!=null){
            prec.suivant=this.suivant;
            res=prec;
        }
        if(suiv!=null){
            suiv.precedent=prec;
            res=suiv;
        }
        return res;
    }
    public int taille() {
        Page tmp=this;
        int res=0;
        while(tmp.precedent!=null){ 
            tmp=tmp.precedent;
        }//on parcours jusqu'a 1er 
        while(tmp.suivant!=null){ //puis du 1er on avance au dernier en incrementant res 
            res+=1;
            tmp=tmp.suivant;
        }
        return res;
    }

    //Correction 
    public int tailleCorr(){
        Page tmp=this;
        while(tmp.precedent!=null){ 
            tmp=tmp.precedent;
        }
        int res=0;
        while(tmp!=null){
            res++;
            tmp=tmp.suivant;
        }
        return res;
    }

    public static boolean disjoint(Page n1,Page n2){
        Page tmp1=n1;
        Page tmp2=n2;
        boolean res=false;
        while(tmp1.precedent!=null && tmp2.precedent!=null){ //debile psq ils peuvent ne pas etre de la meme taille
            tmp1=tmp1.precedent;
            tmp2=tmp2.precedent;
        }
        while(tmp1.suivant!=null && tmp2.suivant!=null){
            if(tmp1.adress.equals(tmp2.adress)){
                res=true;
            }
        }
        return res;
    }

    //Correction 
    public static boolean disjointCorr(Page p1,Page p2){
        Page tmp1=p1;
        Page tmp2=p2;
        while(tmp1.precedent!=null){
            tmp1=tmp1.precedent;
        }
        while(tmp2.precedent!=null){
            tmp2=tmp2.precedent;
        }
        while(tmp1!=null){
            Page tmp3=tmp2;
            while(tmp3!=null){
                if(tmp1.adress.equals(tmp3.adress)){
                    return false;
                }
                tmp3=tmp3.suivant;
            }
            tmp1=tmp1.suivant;
        }
        return true;
    }
    public int compte(String s) {
        Page tmp=this;
        int res=0;
        while(tmp.precedent!=null){ 
            tmp=tmp.precedent;
        }//on parcours jusqu'a 1er 
        while(tmp.suivant!=null){
            if(tmp.adress.equals(s)){
                res++;
            }
            tmp=tmp.suivant;
        }
        return res;
    }
    public boolean contient(String s) {
        Page tmp=this;
        boolean res=false;
        while(tmp.precedent!=null){ 
            tmp=tmp.precedent;
        }//on parcours jusqu'a 1er 
        while(tmp.suivant!=null){
            if(tmp.adress.equals(s)){
                res=true;
                break; //arrete la boucle des qu'on trouve ce qu'on cherche 
            }
            tmp=tmp.suivant;
        }
        return res;
    }
    public void inverse() {
        Page tmp=this;
        while(tmp.precedent!=null){ 
            tmp=tmp.precedent;
        }//on parcours jusqu'a 1er 
        Page une=tmp;
        Page deux=tmp.suivant;
        une.suivant=deux.suivant.suivant;
        deux.precedent=null;
        deux.suivant=une;
        une.precedent=deux;
    }






}
