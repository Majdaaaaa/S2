package TP.TP7bis;

public class Memoire{
    private Memoire precedente;
    private Memoire suivante;
    private int valeur;
    public Memoire() { //je pense q'on a pas besoin de le créer sauf que si psq ya un 2eme constructeur 
        this.precedente=null;
        this.suivante=null;
        this.valeur=0;
    }
    public Memoire(int n){
        Memoire m=this;
        Memoire tmp=m;
        for(int i=0;i<n;i++){
            tmp.suivante=new Memoire(); //(est ce que faut expliciter les liens fais par les cellules?)
            tmp=tmp.suivante;
        }
    }
    public Memoire getPre(){
        return this.precedente;
    }
    public Memoire getSuiv(){
        return this.suivante;
    }
    public int getVal(){
        return this.valeur;
    }
    public void setVal(int v){
        this.valeur=v;
    }

    public void modifie(int n){
        Memoire tmp=this;
        while (tmp!=null){
            
        }
    } 
//une pour gauche et une pour droite 
    private String G(){
        String res1="";
        Memoire tmp1=this.precedente;
        while(tmp1!=null){
            res1=res1+" "+tmp1.valeur;
            tmp1=tmp1.precedente;
        }
        return res1;

    }
    private String D(){
        Memoire tmp=this.suivante;
        String res="";
        while(tmp!=null){
            res=res+" "+tmp.valeur;
            tmp=tmp.suivante;
        }
        return res;
    }

    public void inspecte(){
        String res=G()+this.valeur+D();
        System.out.println("-".repeat(res.length()));
        System.out.println(res);
        for(int i=0;i>this.D().length() ;i++){  
            System.out.print(" ");
        }
        //System.out.println();
        System.out.print("^");
        System.out.println();
        //apres print ^
        System.out.println();
        System.out.println("-".repeat(res.length()));
    }

}