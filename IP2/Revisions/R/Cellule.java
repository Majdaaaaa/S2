public class Cellule {
    private Element e;
    private Cellule next;
    public Cellule(Element e,Cellule next){
        this.e=e;
        this.next=next;
    }
    public Cellule(Element e){
        this.e=e;
        this.next=null;
    }


    public Element getEl(){
        return this.e;
    }

    public void afficher(){
        Cellule tmp=this;
        while(tmp!=null){
            System.out.println(tmp.e.getVal());
            tmp=tmp.next;
        }
    }

    public void addFin(Cellule c){
        Cellule tmp=this;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=c;
    }

    public void addEnI(Element e,int i){ 
        Cellule tmp=this;
        while(tmp.next!=null && i!=1){ //i>=1 //c come une boucle for on avance avec l'indice jusqu'a trouver ou mettre la nouvelle cellule
            tmp=tmp.next;
            i--;
        }
        tmp.next=new Cellule(e,tmp.next);
    }

    public void addAvantX(Element E,Element x){
        if(this.next!=null && this.next.getEl()==x){
            this.next=new Cellule(E, this.next);
        }else{
            this.next.addAvantX(E, x);
        }
    }

    public void removeI(int i){
        Cellule tmp=this;
        while(tmp.next!=null){
            if(i>=1){
                i--;
                tmp=tmp.next;
            }else{
                tmp.next=tmp.next.next;
            }
        }
    }

    public Liste pair(){
        Cellule tmp=this;
        Liste l=new Liste();
        while(tmp!=null){
            if(tmp.e.getVal()%2==0){
                l.addFin(tmp.e);;
            }
            tmp=tmp.next;
        }
        return l;
    }

    

    

    

    


}
