import java.util.Stack;

public class AppelFGTrad {
    static int mem[]=new int[10000]; //c'est la meme chose que de le mettre dans le main
    static Stack <Bloc> p=new Stack<Bloc>();
    public static void main(String[] args){
        mem[0]=2;
        mem[1]=1;
        int ic=0;
        while (true){
            switch(ic){
                case 0: mem[2]=400;ic++;break;
                case 1:mem[mem[2]]=2;ic++;break;
                case 2:mem[mem[2]+1]=3;break;
                case 3:mem[mem[2]+2]=3;ic++;break;
                case 4:mem[mem[2]+3]=4;ic++;break;
                case 5:mem[3]=0;ic++;break;
                case 6:if(mem[3]<4){
                    ic++;//gerer l'appel de f
                }else{
                    ic+=4; //pour aller a ic=10
                }
                case 7:p.push(new BlocF(ic+1,mem[mem[2]+mem[3]]));ic=100;break;
                case 8:p.pop();
                case 9:mem[3]++;ic-=3;break;
                case 10:p.push(new BlocG(ic+1/*adrs de retour*/,1,6));ic=200;break;
                case 11:System.out.println(((BlocR)p.pop()).getVal());
                case 12:System.exit(0);
                case 100: //tmp a mettre dans un bloc 
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 200:
                case 201:
            }
        }
    }
}
