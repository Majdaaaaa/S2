public class Partiel2011Trad {
    public static void main(String[] args){
        int[] mem=new int[10000];
        int ic=0;
        while(true){
            switch(ic){
                case 0: mem[0]=100;ic++;break;//mem[0]= l'adresse de t 
                case 1:mem[mem[0]]=1;ic++;break;//mem[mem[0]]= t[0]
                case 2: mem[mem[0]+1]=1;ic++;break;
                case 3: mem[1]=2;ic++;break;
                case 4:if(mem[1]<20){  //toujours traduire les boucles avec des if 
                    ic++;break;
                }else{
                    ic=ic+3;break;
                }
                case 5:mem[mem[0]+mem[1]]=2*mem[mem[0]+(mem[1]-1)]+mem[mem[0]+(mem[1]-2)];ic++;break;
                case 6:mem[1]++;ic-=2;break;
                case 7: System.out.println("Nombre(19)="+ mem[mem[0]+19]);ic++;break;
                case 8:System.exit(0);
            }
        }
    }
}
