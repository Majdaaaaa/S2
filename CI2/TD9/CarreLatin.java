import java.util.ArrayList;

public class CarreLatin{
    static int[][] grille; //y les colonnes et x les lignes
    static int dim ; //dimension 


    static void init(int n){ //repmli la 1ere ligne et la 1ere colonne 
        dim=n;
        grille=new int[dim][dim];
        for(int i=0;i<dim;i++){
            grille[0][i]=i+1;
            grille[i][0]=i+1;
        }
    }

    static void printGrille(){
        for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
                System.out.print(grille[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    static Pair nextPos(Pair p){
        Pair q=p.add(new Pair(0,1)); //q nouvelle pair avec q.x=p.x et q.y=p.y+1
        if(q.x>= dim){
            q=new Pair(p.x+1,1);
        }
        return q;
    }

    static ArrayList<Integer> possible(Pair p){ //renvoie la liste des prochaines cases possibles depuis la position p
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=1;i<=dim;i++){
            if(isValid(i,p)){
                res.add(i);
            }
        }
        return res;
    }

    private static boolean isValid(int n, Pair p) {
        for(int i=0;i<dim;i++){
            if(grille[i][p.y]==n || grille[p.x][i]==n){
                return false;
            }
        }
        return true;
    }

    static void backtracking(Pair p){ //p= la pair d'entrée p.x p.y 
        if(p.x>=dim){ //une solution est construite 
            printGrille();
        }else{
            for(int j:possible(p)){
                grille[p.x][p.y]=j;
                backtracking(nextPos(p));
                grille[p.x][p.y]=0;  //pour eviter d'afficher une solution inexistante 
            }
        }
    }


}