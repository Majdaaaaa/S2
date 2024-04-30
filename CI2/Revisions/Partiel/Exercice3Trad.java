import java.util.Stack;

public class Exercice3Trad {
    static int[] mem=new int[10000];
    static Stack<Bloc> p=new Stack<Bloc>();
    static int ic=0;
    public static void main(String[] args) {
        mem[0]=0;//appelsF
        while(true){
            switch(ic){
                case 0:mem[1]=2;ic++;break;//n
                case 1:mem[2]=3;ic++;break;//m
                case 2:p.push(new BlocG(ic+1,mem[1],mem[2]));ic=100;break;
                case 3:System.out.println((((BlocR) p.pop()).getVal()));ic++;break;
                case 4:System.out.println(mem[0]);ic++;break;
                case 5:System.exit(0);
                //g(x,y)
                case 100:System.out.println("g("+(((BlocG) p.peek()).getArg1())+","+(((BlocG)p.peek()).getArg2()+")"));
                case 101:((BlocG)p.peek()).setVar(0); ;ic++;break;
                case 102:
                    if(((BlocG)p.peek()).getVar()<((BlocG)p.peek()).getArg2()){
                        ic++;
                    }else{
                        ic=106;
                    }break;
                case 103:mem[3]=((BlocG)p.peek()).getArg1();p.push((BlocG)new BlocF(ic+1,mem[3]));ic++;break;
                case 104:mem[3]+=((BlocR)p.pop()).getVal();ic++;break;
                case 105:((BlocG)p.peek()).setVar(((BlocG)p.peek()).getVar()+1);ic=102;break;
                case 106:((BlocR)p.peek()).setVal(mem[3]);ic++;break;
                case 107:ic=p.peek().getAdr();break;
                //f(x)
                case 200:mem[0]++;ic++;break;
                case 201:System.out.println("f("+((BlocG)p.peek()).getArg1()+")");ic++;break;
                case 202:
                    if(((BlocG)p.peek()).getArg1()<10){
                        ic++;
                    }else{
                        ic=204;
                    }break;
                case 203:((BlocG)p.peek()).setArg1(((BlocG)p.peek()).getArg1()+1);ic=202;break;
                case 204:((BlocR)p.peek()).setVal(((BlocG)p.peek()).getArg1());ic++;break;
                case 205:ic=p.peek().getAdr();break;
            }
        }
    }
}
