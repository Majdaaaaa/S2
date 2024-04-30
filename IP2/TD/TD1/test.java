package TD.TD1;

public class test{
    public static void main (String[] args){
        Animal m=new Animal ("Marti",'M',5*365,300,"zebre",0);
        Animal g=new Animal( "Gloria",'F',7,1500,"hippopotame",10);  
        g.poids=g.poids-50; //g.poids-=50;
        //code pris du TD1/ ca affiche le poids de a (car a et b pointent vers la meme chose)
        Animal a = new Animal ( " Melman ",'M',1230,99,"girafe",-4);
        Animal b = a ;
        b.poids = 950;
        System.out.println(a.poids);
        System.out.println(Animal.description(m));
        System.out.println(Animal.descriptionbis(m));
        Animal[] t={m,g,a};
        System.out.println(Animal.lePlusGros(t));
    }
}