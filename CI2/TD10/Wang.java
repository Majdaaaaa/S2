import java.util.ArrayList;
import java.util.Stack;

public class Wang{
    static int dim=3;//la dimension 
    static int[][] dom={{0,0,0,2},{0,2,1,2},{1,2,0,0}}; //{Ouest Nord Est Sud}
    static int nbr_sol=0;
    static ArrayList<Integer> t; //liste dans laquelle on range les domino choisis   
    //pour tester si on a une solutions on regarde la taille de t si la taille de t =9 alors c bon on a tout nos dominos 

    public static boolean dominoAutorisé(int k){ //test si on peux mettre un domino dans la pile  //k=num du domino a tester (soit 1,2,3)
        if(t.size()>=dim){
            if(dom[t.get(t.size()-dim)][3] != dom[k][1]){ //3 represente le sud et 1 le nord 
                return false;
            }
        }
        if(!(t.size()%dim==0)){
            if(dom[t.get(t.size()-1)][2] != dom[k][0] ){ //2 represente l'est et 0 l'ouest 
            return false;
            }
        }
        return true;
    }

    public static Stack<Integer> possibles(){ //vu que tout est static on a pas besoin de mettre les parametres
        Stack<Integer> res=new Stack<Integer>();
        for(int k=0;k<dom.length;k++){ 
            if(dominoAutorisé(k)){
                res.push(k);
            }
        }
        return res;
    }

    static void backtrack(){
        if(t.size()==dim*dim){
            nbr_sol+=1;//afficher la solution 
        }else{
            Stack<Integer> possible=possibles();
            while(!possible.empty()){
                int d=possible.pop();
                t.add(d);
                backtrack();
                t.remove(t.size()-1); //vide la grille 
            }
        }
    }

    public static void main(String[] args) {
        t=new ArrayList<Integer>();
        backtrack();
        System.out.println();
    }


}