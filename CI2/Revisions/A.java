public class A {
    static int a = 5; static int b = 3; 
    static void f(int x, int y){ 
        do g(a+b, 12);  //ic=100(appel) ic=101 (retour)
        while(x < 2*a && b < y); //ic=102
    }//ic=103(sortie )
    static void g(int z, int w){
        if(z < w){ //ic=200
            a += b;
        } else{
            b=-b;
        }
    }
    public static void main(String[] args){
        f(7,11); //ic=0 ic=1
        System.out.println("a="+a+" b="+b);//ic=2
    }//ic=3
}

