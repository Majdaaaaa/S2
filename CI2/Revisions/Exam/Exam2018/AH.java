package Exam2018;

public class AH {
    static int a=4;

    static int f(int x,int y){
        System.out.println("appel de f("+x+","+y+")");
        while(x<y){
            x+=a*y;
        }
        return x-y;
    }

    static int g(int z){
        System.out.println("appel de g("+z+")");
        if(z<51){
            return f(z-a,z+a)/a;
        }
        return g(z/a);
    }

    public static void main(String[] args) {
        for(int i=41;i<60;i+=10){
            System.out.println(g(i));
        }
    }
}
