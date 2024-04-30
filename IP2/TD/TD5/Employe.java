public class Employe{
    private final String nom;
    private int salaire;

    public Employe(String nom, int salaire){
        this.nom=nom;
        this.salaire=salaire;
    }

    public String getNom(){
        return this.nom;
    }
    public int getSal(){
        return this.salaire;
    }
    public void setSal(int x){
        this.salaire=x;
    }

    public void description(){
        System.out.println("L'employé s'appelle "+this.nom+" avec un salaire de "+this.salaire );
    }
    public void augmente(int M){
        this.salaire+=M;
    }
}