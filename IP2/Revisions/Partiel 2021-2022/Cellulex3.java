public class Cellulex3 {
    private int val;
    private Cellulex3 suivant;
    private Cellulex3 precedent ;

    public int milieu(Cellulex3 c2){
        Cellulex3 tmp1=this;   
        Cellulex3 tmp2=c2;
        while(true){
            if(tmp1==tmp2){
                return tmp1.val;
            }
            if(tmp1.suivant==tmp2){
                return(tmp1.val+tmp2.val/2);
            }
            tmp1=tmp1.suivant;
            tmp2=tmp2.suivant;
        }
    }


}
