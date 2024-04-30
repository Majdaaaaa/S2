public class Syracuse {
    static int n=100; //ic=0
    public static void main (String[] args){
        int i=0; //ic=1
        while(n!=1){ //ic=2 saut conditionnel vers ic=8
            if(n%2==0){ //ic=3 saut conditionnel: si n impaire saut vers ic=5
                n/=2; //ic=4
            }else{
                n=3*n+1; //ic=5
            }
            i++; //ic=6
        }//ic=7 saut inconditionnel vers ic=2  
        System.out.println("Le temps de vol de est: "+i); //ic=8
    }//ic=9 
}
