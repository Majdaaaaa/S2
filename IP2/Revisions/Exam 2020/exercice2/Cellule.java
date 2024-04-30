public class Cellule {
    private char x;
    private Cellule next ;

    public Cellule(char x,Cellule next ){
        this.x=x;
        this.next=next;
    } 
    public Cellule (char x){
        this(x,null);
    }
    public void build(String s) {
        Cellule tmp=this;
        String q=s.substring(1);
        for(int i=0;i<q.length();i++){
            tmp.next=new Cellule(q.charAt(i));
            tmp=tmp.next;
        }
    }











}
