//import java.util.Scanner;

public class IfThenElseTrad {
    public static void main(String[] args){
        //faut pas oublier d'initialiser le tableau memoire 
        int ic=0;
        int[] mem=new int[100000];
        while (true){
            switch(ic){
                //case 0: mem[0] = new Scanner(System.in) ;ic++;break;
                case 1:System.out.print( "Donnez-moi un nombre entier: " );
                //case 2: mem[1]=mem[0].nextInt();ic++;break;
                case 3: if(mem[1]%2==0){
                    ic++;break;
                }else{
                    ic+=2;break;
                }
                case 4: System.out.println("pair");ic+=2;break;
                case 5:System.out.println("impair");ic++;break;
                case 6: System.out.println("Au revoir !");ic++;break;
                case 7: System.exit(0);break;

            }
        }
    }
}
