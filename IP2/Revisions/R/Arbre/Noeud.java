package Arbre;

public class Noeud {
    public int etiq;
    public Noeud G;
    public Noeud D;
    public Noeud(int etiq,Noeud G,Noeud D){
        this.etiq=etiq;
        this.G=G;
        this.D=D;
    }
    public Noeud(int etiq){
        this(etiq,null,null);
    }

    public void afficheInfixe(){
        if(this.G!=null){
            System.out.print(this.G.etiq+",");
            this.G.afficheInfixe();
        }
        if(this.D!=null){
            
        }
    }
}
