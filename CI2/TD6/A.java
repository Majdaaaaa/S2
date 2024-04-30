class A {
    static int a = 5; 
    static int b = 3;
    static void f(int x, int y){ 
        do g(a+b, 12); //ic=100 (appel de g) //ic=101(retour de g)
        while(x < 2*a && b < y); //ic=102 (saut conditionnel vers ic=100 si condition verifié)
    }//ic=103 (sortie de f)
    static void g(int z, int w){
        if(z < w)  //ic=200(saut conditionnel si condition vrai)
            a += b; //ic=201
        else b = -b;//ic=202
    }//ic=203 (sortie de g)
    public static void main(String[] args){
        f(7,11); //ic=0(appel de f) //ic=1(retour de f )
        System.out.println("a="+a+" b="+b); //ic=2
        //ic=3 (exit)
    } 
}