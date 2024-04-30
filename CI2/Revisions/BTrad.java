import java.util.Stack;

public class BTrad {
    public static void main(String[] args){
        int[] mem=new int[10000];
        Stack<BlocB> p=new Stack<BlocB>();
        int ic=0;
        while(true){
            switch(ic){
                case 0:mem[0]=0;ic++;break;//i
                case 1:mem[1]=1;ic++;break;//tmp
                case 2:if(mem[0]<10){
                    ic++;break;
                }else{
                    ic+=5;break;
                }
                case 3:p.push(new BlocB(ic+1,mem[0]));ic=100;break;
                case 4:mem[1]*=p.peek().getVal();ic++;break;
                case 5:p.pop();ic++;break;
                case 6:mem[0]++;ic-=4;break;
                case 7:System.out.println(mem[1]);ic++;break;
                case 8:System.exit(0);
                //v()
                case 100:p.push(new BlocB(ic+1,mem[0]));ic=200;break;
                //case 101:p.peek().setVar(p.peek().getVal());ic++;break;
                case 101:p.pop();ic++;break;
                case 102:p.peek().setVar(2+mem[0]);ic++;break;
                case 103:ic=p.peek().getAdr();break;
                //u()
                case 200: p.peek().setVar(2+mem[0]);ic++;break;
                case 201:ic=p.peek().getAdr();break;
                    //a demander a la prof !!!
            }
        }
    }
}
