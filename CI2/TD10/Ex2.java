public class Ex2 {
    
    public static boolean est_pair(int n){
        return (n%2==0); //ic=200 
    }//ic=201

    public static void binaire_inverse(int n){
        boolean tmp=false; //ic=100 (set variable )
        while(n!=0){ //ic=101
            tmp=est_pair(n); //ic=102(appel de pair ) //ic=103 (retpur de pair et modif tmp)

            if(tmp){ //ic=104 (saut cond.)
                System.out.print(0); //ic=105
            }else{
                System.out.print(1); //ic=106
            }
            n=n/2; //ic=107
        }
        System.out.println(); //ic=108
    }//ic=109 

    public static void main(String[] args) {
        binaire_inverse(3); //ic=0 (appel b) ic=1 (retour b)
        binaire_inverse(6);//ic=2 (appel ) ic=3 (retour )
    } //ic=4 (sortie )
}
