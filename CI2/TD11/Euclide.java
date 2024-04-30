public class Euclide {
    public static int pgcdMaVer(int a ,int b ){
        int r=0;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
            pgcdMaVer(a,b);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(pgcdMaVer(3,6));
    }
}
