public class Parite {
    public static boolean pair(int n) {
        if (n == 0) { // ic=100 (saut conditionnel)
            return true;// ic=101
        } else {
            return impair(n - 1);// ic=102 (appel) ic=103(retour) ic=104(return)
        }//ic=105 (sortie de pair )
    }

    public static boolean impair(int n) {
        if (n == 0) {
            return false;
        } else {
            return pair(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(pair(5)); // ic=0 (appel de pair) ic=1(retour de pair ) ic=2 (affichage) 
        System.out.println(impair(5));//ic=3(appel impair ) ic=4 (retour) ic=5 (affichage) 
    }//ic=6 sortie du programme 
}