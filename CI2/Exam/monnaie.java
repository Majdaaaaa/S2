import java.util.ArrayList;

public class monnaie {
    static ArrayList<Integer> sol;
    static int[] system;
    static int n;

    static boolean solutionComplete(){
        int res=0;
        for(int i=0;i<sol.size();i++){
            res+=sol.get(i);
        }
        if(n==res){
            return true;
        }else{
            return false;
        }
    }



    static boolean possible(int i,int i2) {
        if(i+i2>=n){
            return true;
        }
        else{
            return false;
        }
    }





    static void backtrack(){
        if(solutionComplete()){
            System.out.println(sol);
        }else{
            for(int i=0;i<system.length-1;i++){
                if(possible(i,i+1)){
                    sol.add(i);
                    sol.add(i+1);
                    backtrack();
                    sol.remove(sol.size()-1);
                }
            }
        }
    }








}
