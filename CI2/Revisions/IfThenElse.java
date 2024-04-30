import java.util.Scanner;

public class IfThenElse {
    public static void main(String [] args) {
        Scanner myInput = new Scanner( System.in ); //ic=0
        int n;//intialisation en dehors du while (faut c'est les variables static qu'on initialise en dehors du while)
        System.out.print( "Donnez-moi un nombre entier: " ); //ic=1
        n = myInput.nextInt();//ic=2
        if(n%2==0){ //ic=3
            System.out.println("pair"); //ic4
        }else{ 
            System.out.println("impair"); //ic=5
        }
        System.out.println("Au revoir !");//ic=6
    }
}//ic=7