public class Listex3 {
    private Cellulex3 first;
    private Cellulex3 last;

    public int milieu(){
        if(this.first!=null){
            return this.first.milieu(this.last);
        }
        return 0;
    }
}
