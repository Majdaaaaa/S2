public class ProgTraduit {
    public static void main (String[] args){
        int ic=0;
        int[] mem=new int[100000];
        while(true){
            switch(ic){
                case 0: mem[0]=0;ic++;break;
                case 1:mem[1]=0;ic++;break;
                case 2:if(mem[0]>=6){
                            ic+=4;
                        }else{
                            ic++;
                        }
            }
        }
    }
}
//finir en remplacant les variables i et k par le tableau 