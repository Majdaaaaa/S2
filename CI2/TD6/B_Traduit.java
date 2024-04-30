import java.util.Stack;

public class B_Traduit{
    public static void main(String[] args){
        int[] mem=new int[1000];
        Stack <BlocB> P=new Stack<BlocB>();
        int ic=0;
        while(true){
            switch(ic){
                case 0: mem[0]=0;ic++;break; //i
                case 1: mem[1]=1;ic++;break; //tmp
                case 2: if(mem[0]<10){
                    ic++;
                }else{

                }
                case 3:
                case 4: //retour de v 
                case 5:
                case 6:
                case 7:System.out.println(mem[1]);
                case 8:
                case 100:
                case 101:
                case 102:
                case 200:
                case 201: //sortie de v 
            }
        }
    }
}