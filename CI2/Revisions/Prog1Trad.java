import java.util.Stack;

public class Prog1Trad {
    static int[] mem=new int[1000];
    static Stack<Bloc3> p =new Stack<Bloc3>();
    static int ic=0;
    public static void main(String[] args) {
        mem[2]=24;//a
        while(true){
            switch(ic){
                case 0:mem[0]=1;ic++;break;//i
                case 1:mem[1]=0;ic++;break;//s
                case 2:if(mem[0]<7){
                    ic++;
                }else{
                    ic=6;
                }break;
                case 3:p.push(new Bloc3(ic+1, mem[0]));ic=100;break; 
                case 4:mem[1]=mem[1]+p.pop().getVal();ic++;break;
                case 5:mem[0]++;ic=2;break;
                case 6: System.out.println("s ="+mem[1]);
                case 7:System.exit(0);
                //f()
                case 100:p.peek().setVar1(0);ic++;break;
                case 101:if(mem[2]%p.peek().getArg1()==0){
                    ic++;
                }else{
                    ic+=2;
                }break;
                case 102:p.peek().setVar1(p.peek().getArg1());ic++;break;
                case 103:p.peek().setVal(p.peek().getVar1());ic++;break;
                case 104:ic=p.peek().getAdresse();break;
            }
        }
    }
}
