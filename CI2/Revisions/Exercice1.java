public class Exercice1 {
    
    public static void f(int x,int y ){
        x++;
        if(y%x==0){
            System.out.println("dans f, x = "+x+" et y = "+ y);
        }
    }

    public static void f(int[]x, int[] y){
        for(int i=0;i<x.length;i++){
            x[i]++;
        }
        if(x.length==y.length){
            for(int i=0;i<x.length;i++){
                y[i]=y[i]%x[i];
            }
        }
    }
    public static void main(String[] args) {
        int x=3;
        int y=8;
        int[] u={1,2,3};
        int[] v={4,5,6};
        System.out.println("dans main, x = "+x+" y = "+y);
        f(x,y);
        System.out.println("apres f, dans main, x = "+x+" et y = "+y);
        f(u,v);
        v=u;
        f(u,v);
        for(int j=0;j<u.length;j++){
            System.out.println(u[j]+" ");
        }
        
    }
}
