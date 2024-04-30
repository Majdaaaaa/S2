package exercice2;
//cellule avec que le suivant  
public class B {
    private int x;
    private B next;
    public B(int x,B next){
        this.x=x;
        this.next=next;
    }
    public B(int x){
        this(x,null);
    }
    public int getX() {
        return this.x;
    }
    public void setNext(B next){
        this.next=next;
    }
    public void affiche() {
        B tmp=this;
        while(tmp.next!=null){
            System.out.print(tmp.x+",");
            tmp=tmp.next;
        }
        System.out.print(tmp.x);
        System.out.println();
    }

    public void affichePastMilieu(B lievre ,B tortue) {
        B tmp=tortue;
        B tmp2=lievre;
        if(this.next==null){
            System.out.println(this.x);
        }
        while(tmp2.next!=null){
            tmp2=tmp2.next.next;
            tmp=tmp.next;
        }
        System.out.println(tmp.x); 
    }

    //faut verifier que la tortue ne depasse jamais la tortue donc le suivant de la tortue ne doit jamais 
    //le lievre et que le suivant du lievre ne soit jamais la tortue
    public static boolean isListe(B tortue, B lievre) {
        while (tortue.next!=null){
            while(lievre.next!=null){
                if(tortue.next!=lievre && lievre.next!=tortue){
                    return true;
                }
                isListe(tortue, lievre.next.next);
            }
            isListe(tortue.next, lievre);
        }
        return false;
    }
}
