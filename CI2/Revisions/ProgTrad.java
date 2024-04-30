import java.util.Stack;

public class ProgTrad {
    public static void main (String[] args){
        int[] mem=new int[1000];
        Stack<BlocR> p=new Stack<BlocR>();
        int ic=0;
        while(true){
            switch(ic){
                case 0:p.push(new BlocR(ic+=2));ic=100;break;
                case 1:p.push(new BlocR(ic+=2));ic=200;break;
                case 3:
                case 4:p.pop();ic++;break;
                case 5:p.pop();ic++;break;

                case 100:p.peek().setVal(2*-2+3*5);ic++;break;
                case 101:ic=p.peek().getAdresse();break;
                case 200:if(4>p.peek().getVal()){
                    p.peek().setVal(4+p.peek().getVal());
                }
            }
        }
    }
}
