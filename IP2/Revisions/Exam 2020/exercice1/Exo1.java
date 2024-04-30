package exercice1;

public class Exo1 {
    public static int tableauImpaire(int[] t) {
        int res = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0 && t[i] > res) {
                res = t[i];
            }
        }
        return res;
    }

    public static int tableauSimilaire(int[] t1, int[] t2) {
        int res = 0;
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t2.length; j++) {
                if (t1[i] == t2[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    public static char[] tableauAlter(char[] ta,char[] tb){
        char[] tc=new char[ta.length+tb.length]; 
        if(ta.length == tb.length){
            for(int i=0;i<ta.length;i++){
                if(i%2==0){
                    tc[i]=ta[i];
                }else{
                    tc[i]=tb[i-1];
                }
            }
        }
        return tc;
    }

    public static void printa(char[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] t = { 2, 3, 9, 43, 23 };
        System.out.println(tableauImpaire(t));
        int[] t2 = { 2, 1, 0, 4, 3 };
        System.out.println(tableauSimilaire(t, t2));
        char[] ta = { 'a', 'b', 'c' };
        char[] tb = { 'r', 't', 'y' };
        printa(tableauAlter(ta, tb));
    }
}