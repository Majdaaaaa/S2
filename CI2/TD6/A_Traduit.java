import java.util.Stack;

public class A_Traduit {
    public static void main(String[] arg){
        int[] mem=new int [1000];
        Stack <BlocA> P=new Stack<BlocA>();
        int ic=0;
        mem[0]=5;
        mem[1]=3;
        while(true){
            switch(ic){
                case 0: P.push(new BlocA(ic+1,7,11));ic=100;break; //ic+1 = l'adresse de retour de f
                case 1:P.pop();ic++;break; //retour de f 
                case 2:System.out.println("a="+mem[0]+" b="+mem[1]);
                case 3: System.exit(0);
                case 100:P.push(new BlocA(ic+1,mem[0]+mem[1],12));ic =200;break;  //appel de f 
                case 101:P.pop();ic++;break; //retour de g 
                case 102: if(P.peek().getArg1()<2*mem[0] && mem[1]<P.peek().getArg2()){ //boucle while 
                    ic-=2;
                }else{
                    ic++;
                }break;
                case 103:ic=P.peek().getAdr();break; //ic=l'adresse de retour de f 
                case 200: if(P.peek().getArg1() <P.peek().getArg2()){ //p.peek affiche sans enlever de la pile 
                    ic++;
                }else{
                    ic+=2;
                }break;
                case 201: mem[0]+=mem[1];ic+=2;break; //ic+=2=203 sort de fonction g
                case 202:mem[1]=-mem[1];ic++;break;
                case 203:ic=P.peek().getAdr(); //ic=l'adresse de retour de la fonction g 
            }
        }
    }
}
