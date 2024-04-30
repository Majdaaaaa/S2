class B{
    public static void main(String[] args){
        int i = 0; //ic=0
        int tmp = 1; //ic=1
        while(i<10){ //ic=2 (saut conditionnel vers )
            tmp *= v(i); //ic=3 (appel de v)  //ic=4(retour de v & maj de la memoire(psq on modifie tmp) )
            i++; //ic=5(2 possibilité gerer i++ et saut en 1 instruction, soit en 2)
        }//ic=6
        System.out.println(tmp); //ic=7(affichage)
    }//ic=8(sortie du programme )

    static int u(int n){ 
        return 2+n; //ic=200 (initialisation valeur de retour)
    }//ic=201(sortie de u)

    static int v(int n) {
        return u(n); //ic=100(appel de u) //ic =101 (retour de u et stockage du resultat )
    } //ic=102 (sortie  de v)

}