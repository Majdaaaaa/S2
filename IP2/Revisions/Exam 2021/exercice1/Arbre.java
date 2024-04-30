package exercice1;

public class Arbre {
    private Noeud sommet;

    public boolean arbreAnid(){
        if(sommet==null){
            return false;
        }
        int hauteur=sommet.nbEtage();
        sommet.setAllDistances(0);
        int[] nbNidsADistance=new int[hauteur];
        sommet.recensement(nbNidsADistance);
        for(int i=0;i<nbNidsADistance.length;i++){
            if(nbNidsADistance[i]!=1){
                return false;
            }
        }
        return true;
    }
    public int nbEtage(){
        if(this.sommet==null){
            return 0;
        }
        return this.sommet.nbEtage();
    }

    public void setAllDistances(int p){
        if(this.sommet!=null){
            this.sommet.setAllDistances(p);
        }
    }
}
