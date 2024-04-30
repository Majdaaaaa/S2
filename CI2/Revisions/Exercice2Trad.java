import java.util.Stack;

public class Exercice2Trad {
    static int[] mem=new int[1000];
    static Stack<BlocE> p=new Stack<BlocE>();
    static int ic=0;
    public static void main(String[] args) {
        while(true){
            switch(ic){
                case 0: mem[0]=5;ic++;break;
                case 1:mem[1]=10;ic++;break;
                case 2:p.push(new BlocE(ic+1,mem[0],mem[1]));ic=100;break;
                case 3:System.out.println(p.pop().getVal());ic++;break;
                case 4:System.exit(0);
                //f(x,y)
                case 100:p.peek().setVar(1);ic++;break;
                case 101:
                    if(p.peek().getArg2()>p.peek().getArg1()){
                        ic++;
                    }else{
                        ic=106;
                    }break;
                case 102:p.peek().setVar((p.peek().getVar())+1);ic++;break;
                case 103:
                    if(p.peek().getArg2()%p.peek().getVar()==0){
                        ic++;
                    }else{
                        ic=101;
                    }
                case 104:p.peek().setArg2(p.peek().getArg2()-1);ic++;break;
                case 105:p.peek().setArg1(p.peek().getArg1()+1);ic=101;break;
                case 106:p.peek().setVal(p.peek().getArg1());ic++;break;
                case 107:ic=p.peek().getAdr();break;



            }
        }
    }
}
