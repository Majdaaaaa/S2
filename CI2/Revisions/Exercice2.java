public class Exercice2 {

    public static int f(int x,int y){
        int u=1; //ic=100
        while(y>x){//ic=101 saut conditionnel
            u++;//ic=102
            if(y%u==0){//ic=103 saut conditionnel 
                y--;//ic=104
                x++;//ic=105
            }
        }
        return x;//ic=106
    }//ic=107(sortie de f)
    public static void main(String[] args) {
        int n=5;//ic=0
        int m=10;//ic=1
        System.out.println(f(n,m)); //ic=2(appel de f) ic=3(retour et affichage de f)
    }
}//ic=4 sortie de programme

