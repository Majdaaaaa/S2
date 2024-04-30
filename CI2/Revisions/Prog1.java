public class Prog1 {
    static int a = 24; //faire en dehors du while 
    public static int f(int x){ 
        int tmp = 0;//ic=100
        if(a % x == 0){ //ic=101
            tmp=x;//ic=102
        }
        return tmp;//ic=103
    }

public static void main(String[] arg){ 
    int i=1; //ic=0
    int s = 0; //ic=1
    while(i < 7){//ic=2
        s = s + f(i);//ic=3(appel de f) ic=4(retour de f)
        i++; //ic=5
    }
    System.out.println("s = "+ s);//ic=6
    }
}
