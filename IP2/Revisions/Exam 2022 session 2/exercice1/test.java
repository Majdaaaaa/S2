package exercice1;

public class test {
    public static void main(String[] args) {
        Cell f=new Cell(60);
        Cell e=new Cell(50, f);
        Cell d=new Cell(40, e);
        Cell c=new Cell(30, d);
        Cell b=new Cell(20, c);
        Cell a=new Cell(10, b);
        List l=new List(a);
        l.print();
        l.rotateIt(4);
        //l.print();
        //l.rotateRec(4);
        l.print();
        System.out.print('a'+1);
    }

}
