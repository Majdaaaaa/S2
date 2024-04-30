import java.util.Stack;

public class Partiel2018Trad {
    public static void main (String[] args){
        int[] mem=new int[10000];
        int ic=0;
        mem[0]=0; //i
        mem[1]=0;//j
        mem[2]=20;//km
        mem[3]=20;//mun
        Stack<Bloc> p=new Stack<Bloc>();
        while(true){
            switch(ic){
                case 0:p.push(new Bloc(1));ic=100;break;//appel tour
                case 1:p.pop();ic++;break; //retour tour
                case 2: if((mem[0]<=4)==true){
                    ic++;
                }else{
                    ic=7;
                }break;
                case 3:p.push(new Bloc(4));ic=200;break;//appel tirs 
                case 4:p.pop();ic++;break;
                case 5:p.push(new Bloc(6));ic=100;break; //appel tour
                case 6:p.pop();ic=2;break;
                case 7:System.exit(0);
                //tour()
                case 100:System.out.println("dans le tour "+(++mem[0]));ic++;break;
                case 101:mem[2]-=4;ic++;break;
                case 103:ic=p.peek().getAdresse();break;
                //tirs()
                case 200:System.out.println(" debut tirs");ic++;break;
                case 201:mem[1]=1;ic++;break;
                case 202: if(mem[1]<=5){
                    ic++;
                }else{
                    ic=206;
                }break;
                case 203:p.push(new Bloc(204));ic=300;break; //appel cible
                case 204:p.pop();ic++;break;//retour cible 
                case 205:mem[1]++;ic=202;break;
                case 206:System.out.println(" fin tirs");ic++;break;
                case 207: ic=p.peek().getAdresse();break;
                //cible()
                case 300:System.out.println(" cible "+mem[1]);ic++;break;
                case 301:mem[3]--;ic++;break;
                case 302:ic=p.peek().getAdresse();break; //sortie cible 
            }
        }
    }
}
