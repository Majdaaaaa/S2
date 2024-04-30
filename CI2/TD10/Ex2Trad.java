import java.util.Stack;

public class Ex2Trad {
    static boolean mem;
    static int ic=0;
    static Stack<Bloc> p =new Stack<>();

    public static void main(String[] args) {
        while(true){
            switch(ic){
                case 0:p.push(new BlocA(ic++,3));ic=100;break;
                case 1: ((BlocA) p.pop()).getVal(); ic++;break;
                case 2:p.push(new BlocA(ic++,6));ic=100;break;
                case 3:((BlocA)p.pop()).getVal();ic++;break;
                case 4:System.exit(0);

                case 100:((BlocB)p.peek()).setVar(false);ic++;break;
                case 101:
                if(((BlocB) p.peek()).getArg()!=0){
                    ic++; 
                }else{
                    ic=108;
                }break;
                case 102:p.push(new BlocA(ic++,((BlocA)p.peek()).getArg()));ic=200;break; //appel est_pair
                case 103:mem=((BlocA)p.pop()).getVal(); ((BlocB)p.peek()).setVar(mem); ic++;break;
                case 104:
                if(((BlocB)p.peek()).getVar()){
                    ic++;
                }else{
                    ic+=2;
                }break;
                case 105: System.out.print(0);ic=107;break;
                case 106:System.out.print(1);ic++;break;
                case 107:((BlocB)p.peek()).setArg(((BlocA)p.peek()).getArg()/2);ic=101;
                case 108:System.out.println();ic++;break;
                case 109:ic= p.peek().getAdr();

                case 200:((BlocA)p.peek()).setVal(((BlocA)p.peek()).getArg()%2==0);ic++;break;
                case 201:ic=p.peek().getAdr();
            }
        }
    }
}
