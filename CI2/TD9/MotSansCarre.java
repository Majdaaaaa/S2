public class MotSansCarre{
    private String mot="";
    private int taille;
    private boolean trouve=false;
    private char[] l={'A','B','C'};
    MotSansCarre(int t ){
        taille=t;
    }

    boolean charLegal(char c){
        String nvMot=mot+c;
        return (motLegal(nvMot));
    }

    static boolean motLegal(String m){ 
        for(int i=1;i<=m.length()/2;i++){ //i=la longeur du motif 
            if(m.substring(m.length()-i, i).equals(m.substring(m.length()-2*i, i))){
                return false;
            }
        }
        return true;
    }



    void backtrack(){ //on evite les parametres ici 
        if(mot.length()==taille){
            System.out.println(mot);
            trouve=true;
        }else{
            for(int i=0;i<l.length;i++){
                if(charLegal(l[i])){
                    mot+=charLegal(l[i]);
                    backtrack();
                    if(trouve){ //sans ca on cherche toute les solution // si on enleve on a toute les solutions possibles  
                        return ; //sors de la fonction 
                    }
                    mot=mot.substring(0, mot.length()-1); //enleve la derniere lettre 
                }
            }
        }
    }
    
    public static void main(String[] args) {
        MotSansCarre m=new MotSansCarre(100);
        m.backtrack();
    }
    
}