public class Test{
    public static void main (String[] args){
        Robot r=new Robot('r',"ararara");
        Robot r2=new Robot('t',"ararara");
        Robot r3=new Robot('e',"ararara");
        //Cellule c=new Cellule(r);
        Cellule c1= new Cellule(r2,c);
        Groupe g =new Groupe();
        prendreTete(r);
        
    }

}