public class AppelFG {
    static int a = 2; //a faire avant le while
    static int b = 1; // lui aussi 
    public static void f(int i) { 
        int tmp=0; //ic=100
        if (i % 2 ==0){ //ic=101
            a=3*a; //ic=102
            b = 2 * b; //ic=103
        }else { 
            tmp = a; //ic=104
            a = b; //ic=205
            b = tmp; //ic=206
        }
    }//ic=107 (retour de f )
    public static int g(int x, int y) { 
        return x * a + y * b; //ic=200
    }//ic=201 (retour de g)
    public static void main(String[] args) { 
        int[]t= {2 ,3 ,3 ,4}; // de ic=0 a ic=4 (on fait une instruction par case) (ic=0 c'est pour allouer la memoire pour t)
        for (int i = 0; i < 4; i++) { //si plus a l'aise on peut traduire le for vers un while
            //ic=5(initialise i)     ic=6(condition)   ic=9(i++)
            f(t[i]); //ic=7(appel) ic=8(retour )
        }
        System.out.println(g(1,6)); 
         //ic=10(appel de g) ic=11(gere le retour de g et l'affichage mais peut etre fais en deux fois et si c le cas faut faire une nouvelle variable pour le retour de g mais c nul )
    } //ic=12(sortie du main System.exit(0))
}
