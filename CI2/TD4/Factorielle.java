public class Factorielle {
    static int n=100; //ic=0 
    public static void main(String[] args){
        int res=1; //psq multiplication pas de 0  //ic=1
        while(n>1){ //saut conditionnel ic=2
            res*=n; //ic=3
            n--; //ic=4
            System.out.println(res);
        }
        System.out.println(res); //ic=5  //res=0 car les valeurs deviennent trop grandes 
    } 
    //ic=6 System.exit(0);
}
