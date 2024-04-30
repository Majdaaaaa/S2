import java.util.Stack;

public class ATrad {
    public static void main(String[] args){
        int ic=0;
        int[] mem=new int[10000];
        Stack<BlocA> p=new Stack<BlocA>();
        mem[0]=5;//a
        mem[1]=3;//b
        while(true){
            switch(ic){
                case 0:p.push(new BlocA(ic+1,7,11));ic=100;break;
                case 1:p.pop();ic++;break;
                case 2:System.out.println("a="+mem[0]+" b="+mem[1]);
                case 3:System.exit(0);
                //f()
                case 100:p.push(new BlocA(ic+1,mem[0]+mem[1],12));ic=200;break;
                case 101:p.pop();ic++;break;
                case 102:if(p.peek().getArg1()<2*mem[0] && mem[1]<p.peek().getArg2()){
                    ic-=2;break;
                }
                case 103:ic=p.peek().getAdr();break;
                case 200:if(p.peek().getArg1()<p.peek().getArg2()){
                    mem[0]+=mem[1]; ic++;break;
                }else{
                    mem[1]=-mem[1];ic++;break;
                }
                case 201: ic=p.peek().getAdr();break;
            }
        }
    }
}
