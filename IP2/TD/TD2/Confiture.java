package TD.TD2;


public class Confiture {
    private final String fruit;
    private int proportion;
    private int cal;
    private final static int sucre =387;

    public Confiture (String fruit,int proportion,int cal){
        this.fruit=fruit;
        this.proportion=proportion;
        this.cal=cal;
    }

    public Confiture (String fruit,int cal){
        this(fruit,50,cal);
    }

    public String description(){
        return(this.fruit+", "+this.proportion+"% de fruit,"+this.cal+" calories aux 100 grames");
    }

    public double c(int quantite){
        return this.cal*quantite*100;
    }
    //Q6
    public boolean egal(Confiture c){  //true si ils sont egaux false sinon 
        if(c==null){ //toujours verifier si c null ou pas 
            return false;
        }else if((!this.fruit.equals(c.fruit)) && this.cal!=c.cal && this.proportion!=c.proportion){
            return false;
        }else{
            return true;
        } 
    }
    //Q9
    public String getFruit(){ //getter pour avoir/utilisé la valeur en dehors de la classe lorsqu'elle est privée 
        return this.fruit;
    }
    public void setCal(int cal){ //setter pour modifier une valeur 
        this.cal=cal;   //impossible de faire un setter pour une valeur final
        
    }
    //Q11
    public void setProp(int proportion){
        if(proportion>=0 && proportion<=100){
            this.proportion=proportion;
        }else{
            System.out.println("Valeur impossible");
        }
    }
    


}