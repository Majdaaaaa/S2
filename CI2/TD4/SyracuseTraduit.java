public class SyracuseTraduit {
    public static void main(String[] args){
        int ic=0;
        int[] mem=new int[100000];
        while(true){
            switch(ic++){
                case 0: mem[0]=100;break;
                case 1: mem[1]=0;break;
                case 2: if(mem[0]!=1){
                    break;
                }else{
                    ic+=6;break; //saut vers ic=8 
                }
                case 3:if(mem[0]%2==0){
                    break;
                }else{
                    ic+=1;break; //saut vers ic=5
                }
                case 4: mem[0]=mem[0]/2;ic++;break; //saut vers ic=6
                case 5: mem[0]=3*mem[0]+1;break;
                case 6: mem[1]++;break;
                case 7: ic-=6;break;
                case 8: System.out.print(mem[1]);break;
                case 9: System.exit(0);

            }
        }
    }
}
