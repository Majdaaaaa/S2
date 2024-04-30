public class Basique {
    static void h(){ 
        System.out.println("Entree h"); //ic=200
        g();//ic=201(appel) ic=202(retour)
        System.out.println("Sortie h");//203
    }//204(sortie de g donc retour a l'adresse de retour )
    static void g(){ 
        System.out.println("Entree g"); //300
        f();//301 302
        System.out.println("Sortie g");//303
    }//304
    static void f(){ 
        System.out.println("Milieu f");//ic=100
    }//ic=101
    public static void main(String[] args){
        System.out.println("Entree main"); //ic=0
        f();//ic=1(appel) ic=2(retour)
        h();//ic=3(appel) ic=4(retour)
        System.out.println("Sortie main");//ic=5
    }//ic=6(sortie)
}
