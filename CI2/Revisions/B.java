public class B {
    public static void main(String[] args){
        int i = 0; //ic=0
        int tmp = 1; //ic=1
        while(i<10){ //ic=2
            tmp *= v(i); //ic=3(appel) ic=4(retour=tmp) //ic=5
            i++;//ic=6
        } 
        System.out.println(tmp);//ic=7
    }//ic=8
    static int u(int n){
        return 2+n;//ic=200
    }//ic=201
    static int v(int n) {
        return u(n);//ic=100 ic=101
    }//ic=102(sortie)
}

