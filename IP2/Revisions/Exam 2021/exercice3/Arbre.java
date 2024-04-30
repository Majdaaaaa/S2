package exercice3;
public class Arbre {
    private Noeud racine;
    private Arbre(Noeud n){
        racine=n;
    } 

    public static boolean verificationFg(int[] fg){
        boolean res=false;
        for(int i=0;i<fg.length;i++){
            if(fg[i]!=-1){
                res=true;
            }
        }
        return res;
    }
    public static boolean verificationFd(int[] fd){
        boolean res=false;
        for(int i=0;i<fd.length;i++){
            if(fd[i]!=-1){
                res=true;
            }
        }
        return res;
    }

    public static Arbre build(int[] etiq, int[] fg,int[] fd){
        if (etiq==null && fg==null && fd ==null){
            return new Arbre (null); //l'arbre nulle
        }  
        if (etiq==null || fg ==null || fd==null || etiq.length!= fg.length || etiq.length !=fd.length) {
            return null; //cas ou c illogique d'avoir un arbre 
        }
        int nbrNoeud=etiq.length;
        Noeud[] all=new Noeud[nbrNoeud];
        for(int i=0;i<nbrNoeud;i++){
            all[i]=new Noeud(etiq[i]); //on met les etiquettes sur chaque noeuds 
        }
        for (int i=0;i<nbrNoeud;i++) {
            if (fg[i]!=-1) { 
                all[i].setG(all[fg[i]]);
            }
            if (fd[i]!=-1) {
                all[i].setD(all[fd[i]]);
            }
        }
        // la racine c'est le noeud qui n'est pas fils de qq'un
        boolean [] estFils =new boolean [nbrNoeud];
        for (int i=0;i<nbrNoeud;i++) {
            estFils[i]=false; // probablement inutile
        }
        // marquage des noeuds qui sont fils au moins une fois
        for (int i=0;i<nbrNoeud;i++) {
            if (fg[i]!=-1) {
                if (estFils[ fg[i] ]) {
                    return null;
                }else{
                    estFils[ fg[i] ] = true;
                }
            if (fd[i]!=-1) 
                if (estFils[ fd[i] ]) {
                    return null;
                }else {
                    estFils[ fd[i] ] |= true;
                }
            }
        } 
        Noeud racine=null;
        for (int i=0;i<nbrNoeud; i++) {
            if (!estFils[i]){
                if (racine !=null) {
                    return null;
                }else{
                    racine=all[i];
                }
            }     
        }
        if (racine !=null) {
            return new Arbre(racine);
        }
        return null;
    }

    void affichePref() {
        if (racine==null) {
            System.out.println("Arbre vide");
        }
        racine.affichePref();
    }
        
}


