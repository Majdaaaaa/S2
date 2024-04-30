import java.util.Stack;

public class HofstadterTrad {
    //un BlocA qui a valeur de retour et adresse de retour et argument 
    static int[] mem=new int[1000];
    static int ic=0;
    static Stack<Bloc> p=new Stack<>();

    public static void main(String[] args) {
        while(true){
            switch(ic){
                //main
                case 0:mem[0]=0;ic++;break; //i 
                case 1: 
                if(mem[0]<=5){
                    ic++;
                }else{
                    ic=5;
                }break;
                case 2: p.push(new Bloc(ic++,mem[0]));ic=100;break;
                case 3:System.out.println(p.pop().getVal());ic++;break;
                case 4: mem[0]++;ic=1;break;
                case 5:System.exit(0);

                case 100:
                if(p.peek().getArg()>0){
                    ic++;
                }else{
                    ic=105;
                }
                case 101: p.push(new Bloc(ic++,p.peek().getArg()-1));ic=100;break; //appel de f
                case 102: p.push(new Bloc(ic++,p.pop().getVal()));ic=200;break; //appel m
                case 103: mem[1]=p.pop().getVal(); p.peek().setVal(p.peek().getArg()-mem[1]);ic++;break; //retour de m et set retour de 
                case 104: 
                
            }
        }
    }


}
