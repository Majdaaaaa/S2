//exemple de CC slide 3
public class Boulangerie{
    //Q1
    private int stock;
    private double euro;
    private int fours;
    private double prix;
    //Q2
    Boulangerie(int s,double eu,int f,double p){
        this.stock=s;
        this.euro=eu;
        this.fours=f;
        this.prix=p;
    }
    //Q3
    Boulangerie(){
        this(0,1000.0,1,1.0);
    }
    //Q4
    public int getS(){
        return this.stock;
    }
    public double getEu(){
        return this.euro;
    }
    public int getF(){
        return this.fours;
    }
    public double getP(){
        return this.prix;
    }
    //les getters sont inportant car nos valeurs ici sont privées dans inaccesible en dehors de la class
    //Q6
    public boolean vendreUnite(){
        if(this.stock==0){
            return false;
        }else{
            this.stock--;
            this.euro+=this.prix;
            return true;
        }
    }
    //Q7
    public int vendre(int nombre){
        int res=0;
        if(nombre>this.stock){
            while(this.stock>0){
                this.vendreUnite();
                res++;
            }        
            //return res;        
        }else{
            for(int i=0;i<nombre;i++){
                this.vendreUnite();
                res++;
            }
            //return res;
        }
        return res;
    }



}