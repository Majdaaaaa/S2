public class  ProgTraduit2 {
    static int i;
    static int k;
    public static void main (String[] args){
        int ic=0; 
        while (true){
            switch(ic++){
                case 0: i=0;break;
                case 1: k=0;break;
                case 2: if(i>=6){
                    ic+=3;break;
                }else{
                    break;
                }
                case 3: k+=i;break;
                case 4: i++;break;
                case 5: ic-=4;break;
                case 6: System.out.println(k);break;
                case 7:System.exit(0);
            }
        }

    }
}
