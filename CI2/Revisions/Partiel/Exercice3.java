public class Exercice3 {
    static int appelsF=0; //initialiser avant le while 

    public static int f(int x){
        appelsF++;//ic=200
        System.out.println("f("+x+")");//ic=201
        if(x<10){//ic=202 (saut conditionnel )
            x--; //ic=203
        }
        return x;//ic=204
    }//ic=205

    public static int g(int x,int y){
        System.out.println("g("+x+","+y+")"); //ic=100
        for(int j=0;j<y;j++){//ic=101(initilisation de j) ic=102(saut incond) ic=105(incrementer j)
            x+=f(x);//ic=103(appel de f) ic=104(retour et maj )
        }
        return x;//ic=106
    }

    public static void main(String[] args) {
        int n=2;//ic=0
        int m=3;//ic=1
        System.out.println(g(n,m));//ic=2(appel de g) ic=3(affichage et retour de g)
        System.out.println(appelsF);//ic=4 (affichage)
    }
}//ic=5(sortie du programme)
