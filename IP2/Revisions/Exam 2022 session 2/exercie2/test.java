package exercie2;



public class test {
    public static void main(String[] args) {
        char [] etiq={'p', 'a', 'l', 'm','i', 'e', 'r', 's'}; 
        int[]pere= {-1,0,0,1,2,2,4,5};
        //System.out.println( Tree.checkOneRoot(pere));
        //System.out.println(Tree.checkLegalValues(pere, etiq));
        //System.out.println(Tree.checkBin(pere ));
        Tree.traduit(etiq,pere).afficheInfixe();
    }
}
