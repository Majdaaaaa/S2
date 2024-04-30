package TD.TD2;

public class Temperature {
    private double temp;
    private String uni;

    public Temperature(){
        this.temp=0;
        this.uni="Kelvin";
    }
    public Temperature(double temp,String uni){
        this.temp=temp;
        if((!this.uni.equals("Kelvin")) && (!this.uni.equals("Celsius") && (!this.uni.equals("Farhrenheit"))) ){
            this.uni="Kelvin";
        }else{
            this.uni=uni;
        }
    }
    public Temperature(Temperature t){
        this.temp=t.temp;
        this.uni=t.uni;
    }
    public double getTemp(){
        return this.temp;
    }
    public String getUni(){
        return this.uni;
    }
    public void setTemp(double t){
        this.temp=t;
    }
    public void setUni(String u){
        this.uni=u;
    }
    private Temperature conversionKC(){
        Temperature res=null;
        if(this.uni.equals("Kelvin")){
            res.temp=this.temp-273.15;
            res.uni="Celsius";
        }
        return res;
    }
    /*public int read (Temperature t){
     faut faire plusieurs methodes de conversion puis dans la methode read faut mettre des if pour chaque cas de conversion 
    }*/

}
