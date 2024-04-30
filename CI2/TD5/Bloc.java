import java.util.Stack;

public class Bloc{
    private int adresseRetour;

    public Bloc (int adr){
        this.adresseRetour=adr;
    }

    public int getAdresse(){
        return this.adresseRetour;
    }
    public static void main(String[] args){
        int ic=0;
        Stack<Bloc> p=new Stack<Bloc>(); //possible aussi avec Stack<int> (essaye de le faire avec int)
        switch(ic){
            case 0: System.out.println("Entrée main");ic++;break;
            case 1:p.push(new Bloc(ic+1));ic=100;break;//appel de f
            case 2:p.pop();ic++;break;//depiler //retour de f
            case 3:p.push(new Bloc(ic+1));ic=200;break;//appel de g
            case 4:p.pop();ic++;break; //retour de g
            case 5:System.out.println("Sortie de main");ic++;break;
            case 6:System.exit(0);
            //f()
            case 100:System.out.println("Milieu f");ic++;break;
            case 101:ic=p.peek().getAdresse();break;//sortie de f    //le pop mais pas le supprimer 
            //h()
            case 200:System.out.println("Entrée h");ic++;break;
            case 201:p.push(new Bloc(ic+1));ic=300;break;//appel de g
            case 202:p.pop();ic++;break;//retour de g
            case 203:System.out.println("Sortie h");ic++;break;
            case 204:ic=p.peek().getAdresse();break; //ic=l'adresse de retour pas le retour lui meme //sortie de h
            //g()
            case 300:System.out.println("Entrée g");ic++;break;
            case 301:p.push(new Bloc(ic+1));ic=100;break; //appel de f
            case 302:p.pop();ic++;break; //retour de f
            case 303:System.out.println("Sortie h");ic++;break;
            case 304:ic=p.peek().getAdresse();break; //retour de g
        }
    }
}