package exercice3;
public class Noeud {
    private int val;
    private Noeud fg;
    private Noeud fd;
    public Noeud(int x,Noeud g,Noeud d){
        val=x;
        fg=g;
        fd=d;
    }
    public Noeud (int x){
        this(x,null,null);
    }
    public void setG(Noeud g){
        fg=g;
    }
    public void setD(Noeud d){
        fd=d;
    }
    public void affichePref() {
    }



    
}
