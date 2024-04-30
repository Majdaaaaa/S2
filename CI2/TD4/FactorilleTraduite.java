public class FactorilleTraduite {
    public static void main(String[] args){
        int ic=0;
        int[] mem=new int[100000];
        while(true){
            switch(ic++){
                case 0:mem[0]=100; break; //mem[0]=n 
                case 1: mem[1]=1;break; //mem[1]=res
                case 2: if(mem[0]<=1){
                    ic+=3;break;  //saut vers ic=6
                }else{
                    break;
                }
                case 3: mem[1]*=mem[0];break;
                case 4: mem[0]--;break;
                case 5: ic-=4;break;
                case 6: System.out.println(mem[1]);
                case 7:System.exit(0);
            }
        }
    }
    //chaque case represente une instruction faite dans le programme de base 
}
