public class Prog {
    static int f(int a ,int b ){ 
        if(a>b){ //ic=200
            return a+b;
        }else{
            return a-b;
        }
    }//ic=201(sortie de f)
    static int g(int a, int b){ 
        return(2*a+3*b); //ic=100
    }//ic=101 (sortie de g)
    public static void main(String[] args){
        System.out.println(f(4,g(-2,5))); //ic=0(appel de g) ic=1(appel de f) ic=2(retour de g) ic=3(retour f)

    }
}
