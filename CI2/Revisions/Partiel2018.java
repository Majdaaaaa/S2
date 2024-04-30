public class Partiel2018 {
    static int i=0, j, km=20, mun=20;  //a intitialiser avant le while 
    
    static void tirs (){
        System.out.println(" debut tirs"); //ic=200
        j=1;//ic=201
        while(j<=5){//ic=202
            cible();//ic=203 ic=204
            j++;//ic=205
        }
        System.out.println(" fin tirs"); //ic=206
    }//ic=207 (sortie )
   
    static void cible (){
        System.out.println(" cible "+j); //300
        mun--;//301
    }//302(sortie)
    
    static void tour (){ 
        System.out.println("dans le tour "+(++i)); //ic=100
        km-=4;//ic=102
    }//ic=103
    public static void main(String[] args){
        tour (); //ic=0(appel) ic=1 (retour)
        while(i<=4){ //ic=2
            tirs(); //ic=3(appel) ic=4
            tour();//ic=5(appel ) ic=6
        } //ic=7
    } //ic=8 (sortie)
}

