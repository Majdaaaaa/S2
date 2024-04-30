import java.util.Stack;

public class factoTraduite {
    static int[] mem=new int[1000];
    static int ic=0;
    static Stack<BlocF> p=new Stack<BlocF>();
    public static void main(String[] args) {
        while(true){
            switch(ic){
                case 0: mem[0]=4;ic++;break;
                case 1:p.push(new BlocF(ic+1,mem[0]));ic=100;break;
                case 2:System.out.println("resultat : "+p.pop().getVal());ic++;break;
                case 3: System.exit(0);

                case 100: p.peek().setVar1(1);ic++;break; //i
                case 101: p.peek().setVar2(1);ic++;break;//r
                case 102: 
                    if(p.peek().getVar1()>p.peek().getArg()){ //faire attention au erreur d'inatention 
                        ic+=4;
                    }else{
                        ic++;
                    }break;
                case 103: p.peek().setVar2(p.peek().getVar2()*p.peek().getVar1());ic++;break;
                case 104: p.peek().setVar1(p.peek().getVar1()+1);ic++;break;
                case 105: ic-=3;break;
                case 106: p.peek().setVal(p.peek().getVar2());ic++;break;
                case 107: ic=p.peek().getAdr();break;

            }
        }
    }
}
