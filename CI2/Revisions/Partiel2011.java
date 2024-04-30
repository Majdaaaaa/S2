public class Partiel2011 {
    public static void main (String [] args){
        int[] t=new int[20]; //ic=0 
        t[0]=1; //ic=1
        t[1]=1;//ic=2
        int l=2; //ic=3
        while(l<20){ //ic=4  
            t[l]=2*t[l-1]+t[l-2]; //ic=5
            l++;//ic=6
        }
        System.out.println("Nombre(19)="+t[19]); //ic=7


    }//ic=8
}