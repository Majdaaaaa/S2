public class Test{
    public static void main (String[] args){
        //Q5
        Boulangerie b1=new Boulangerie();
        Boulangerie b2=new Boulangerie(60, 1500.0, 1, 0.90);
        System.out.println(b2.vendreUnite());
        System.out.println(b2.vendre(65));
    }
}