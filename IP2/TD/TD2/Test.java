package TD.TD2;


public class Test{
    public static void main(String[] args){
        Confiture c1= new Confiture("fraise",50,120);
        Confiture c2 = new Confiture("frase", 50, 120);
        Confiture c3=new Confiture("orange", 40,190);
        //System.out.println(c1==c2); //false 
        //System.out.println(c1.fruit); //fruit pas visible car private 
        System.out.println(c1.description());
        System.out.println(c1.c(3));
        System.out.println(c1.egal(c2)); //true
        System.out.println(c1.getFruit());
        c1.setCal(200);
        System.out.println(c1.description());
        c3.setProp(80);
        System.out.println(c3.description());
        Pot p1=new Pot (c1,40);
        Pot p2=new Pot (c2,50);
        Pot p3=new Pot(c3,100);
        System.out.println(p1.description());
        System.out.println(Pot.getNvId());
        Temperature t= new Temperature(333.0,"Kelvin");
        
    }
}