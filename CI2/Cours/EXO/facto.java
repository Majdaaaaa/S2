public class facto{
    static int f(int n){
        int i=1, r=1; //ic=100 (set var 1) ic=101 (set var 2)
        while(i<=n){ //ic=102 (saut conditionnel )
            r = r*i;//ic=103(maj var 2)
            i = i+1; //ic=104 (maj var1)
        }//ic=105 (saut inconditionnel )
        return r; //ic=106 (maj val de retour )
    }//ic=107 (retour de f )

public static void main(String[] args){ 
    int x=4; //ic=0 (mise a jour mem[0]) 
    System.out.println("resultat : "+f(x)); //ic=1 (appel de f ) ic=2(retour de f et affichage )
  } 
//ic=3 (sortie du programme )
}