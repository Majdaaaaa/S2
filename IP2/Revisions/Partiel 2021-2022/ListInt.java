public class ListInt{
    private Cellule first;
    //EXO1
    public static boolean mergeTest(ListInt l1,ListInt l2){
        if(l1==null || l2==null){ //tester si les argument sont pas null 
            return false;
        }else{
            return Cellule.mergeTest(l1.first,l2.first); //on teste pas si les first sont null car on est en static donc on teste ca dans Cellule 
        }
    }

    //EXO2
    //V1
    public void resetPreRec(){
        if(this.first!=null){
            this.first.resetPreRec(null);
        }
    }
    //V2
    public void resetPreRec2(){
        if(this.first!=null){
            this.first.setPrec(null);
            this.first.resetPreRec2();
        }
    }

    
    public void printBackwardRec(){
        if(this.first!=null){
            Cellule c =this.first.dernier();
            c.printBackwardRec();
        }
    }

    //EXO3

}
