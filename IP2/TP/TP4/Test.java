package TP.TP4;

public class Test {
    public static void main (String[] args){
        Robot r=new Robot('a',"Coucou");
        Robot r2=new Robot('2',"Coucou");

        r.description();
        System.out.println(r2.nomCorrect());
    }
}
