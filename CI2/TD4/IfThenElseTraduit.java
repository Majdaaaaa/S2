import java.util.Scanner;

public class IfThenElseTraduit {
    //voir feuille de td
    public static void main(String[] args){
        int ic=0;
        int[] mem=new int[100000];
        while(true){
            switch(ic){
                case 0: mem[0]= new Scanner(System.in);ic++;break;
                case 1: System.out.print("...");ic++;break;
                case 2: mem[1]=mem[0].nextInt();ic++;break;
                case 3: if(mem[1]%2==0){
                    ic++;break;
                }else{
                    ic+=2;break;
                }
                case 4: System.out.print("pair");ic+=2;break;
                case 5: System.out.print("impair");ic++;break;
                case 6: System.out.print("Au revoir");ic++;break;
                case 7: System.exit(0);
            }
        }
    }
}
