package exercice3;

public class Noeud {
    private Oiseau bird ;
    private Noeud filsG ; 
    private Noeud filsD ;

    public void nommeEspece() {
        for(int i=0;i<26;i++){
            char x='a';
            this.bird.espece=x+i;
            if(this.filsG!=null){
                this.filsG.nommeEspece();
            }
            if(this.filsD!=null){
                this.filsD.nommeEspece();
            }
        } 
    }
}
