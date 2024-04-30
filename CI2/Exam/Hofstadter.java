public class Hofstadter {
    public static int f(int n){
        if(n>0){ //ic=100
            return n-m(f(n-1)); 
            //ic=101(appel de f)
            //ic=102 (retour de f)
            //ic=103 (appel de m)
            //ic=104 (retour de m)
        }
        return 1; //ic=105
    }

    public static int m(int n){
        if(n>0){ //ic=200
            return n-f(m(n-1)); //ic=201(appel de f)
            //ic=202 (appel de m)
            //ic=203 (retour de f)
            //ic=204 (retour de f)
        }
        return 0; //ic=205
    }
    public static void main(String[] args){
        for(int i=0;i<=5;i++){ //ic=0 (i) //ic=1 (saut cond.) //ic=4(incrementer i)
            System.out.println(f(i));//ic=2(appel de f) ic=3(retour de f )
        }
        //ic=5(exit)
    }
}
