package TD.TD1;
// this est obligatoire dans un construteur 
public class Animal {
    //objet 
    public String nom;
    public char sexe;
    public int age; 
    public int poids; 
    public String espece; 
    public int faim;
    //Constructeur
    public Animal (String n,char s,int a,int p,String e,int f){
        this.nom=n;
        this.sexe=s;
        this.age=a;
        this.poids=p;
        this.espece=e;
        if (faim>=10){
            this.faim=10;
        }else if(faim<=0){
            this.faim=0;
        }else{
            this.faim=f;
        }
    }
    //Q6
    public static String description (Animal m){
        String ss="";
        String rr="";
        if (m.sexe=='M'){
            ss="male";
        }else {
            ss="femelle";
        }
        if (m.sexe=='M'){
            rr="un";
        }else{
            rr="une";
        }
        return ("je m'apelle "+ m.nom +", je suis " +rr +" "+ m.espece +" "+ ss +", j'ai " + m.age +" jours et je pese "+ m.poids+ " kg.");
    }
    //Q8
    public static String descriptionbis (Animal m){
        String ss="";
        String rr="";
        if (m.sexe=='M'){
            ss="male";
        }else {
            ss="femelle";
        }
        if (m.sexe=='M'){
            rr="un";
        }else{
            rr="une";
        }
        int x=m.age/365;
        int y=m.age%365;
        //enlever les jours si y=0
        return ("je m'apelle "+ m.nom +", je suis " +rr +" "+ m.espece +" "+ ss +", j'ai "+x+ " et "+y+" jours et je pese "+ m.poids+ " kg.");
    }
    //Q9
    public static void nourrir(Animal a){
        if (a.faim==0){
            a.poids*=1.1; //augmente de 10%
        }else{
            a.faim--; //diminue la faim de 1
        }
    }
    //Q10
    public static Animal lePlusGros(Animal[] t){
        int poids_max=-1;
        Animal res=null;
        for(int i=0;i<t.length;i++){
            Animal actu=t[i];
            if(actu==null){
                continue;
            }
            if(actu.poids>poids_max)
                poids_max=actu.poids;
                res=actu;
        }
        return res;
    }
    //cast ex: double d=2.3;  int i=(int)d;(change le double en int )
    //Q11
    public static Animal reproduction (Animal p, Animal s){
        if((p.faim>=5)||(s.faim>=5)||(p.espece!=s.espece)||(p.sexe==s.sexe)){
            return null;
        }
        char ss;
        if(Math.round(Math.random())==1){
            ss='F';
        }else{
            ss='M';
        }
        int p_min=Math.min(p.poids,s.poids);
        int max_p=Math.max(p.poids,s.poids);
        int poids=(int)(Math.random()*(max_p-p_min)+p_min);
        String nom=(p.nom+s.nom);
        Animal res=new Animal(nom,ss,0,poids,p.espece,0);
        return res;
    } 



   
}