import java.util.Stack;

public class BasiqueTrad {
    public static void main (String[] args){
        Stack<Bloc> p=new Stack<Bloc>();
        int ic=0;
        while(true){
            switch(ic){
                case 0:System.out.println("Entree main");ic++;break;
                case 1:p.push(new Bloc(ic+1));ic=100;break; //appel de f
                case 2:p.pop();ic++;break;//retour de f on depile 
                case 3:p.push(new Bloc(ic+1));ic=200;break; //appel de h
                case 4:p.pop();ic++;break; //retour de h
                case 5:System.out.println("Sortie main");ic++;break;
                case 6:System.exit(0);
                //f()
                case 100:System.out.println("Milieu f");ic++;break;
                case 101: ic=p.peek().getAdresse();break; //ic=l'adresse de retour de f 
                //h()
                case 200:System.out.println("Entree h");ic++;break;
                case 201:p.push(new Bloc (ic+1));ic=300;break; //appel de g
                case 202:p.pop();ic++;break; //retour de g
                case 203:System.out.println("Sortie h");ic++;break;
                case 204:ic=p.peek().getAdresse();break; //sortie de h
                //g()
                case 300:System.out.println("Entree g");ic++;break;
                case 301:p.push(new Bloc(ic+1));ic=100;break;//appel de f
                case 302:p.pop();ic++;break;//retour de f
                case 303:System.out.println("Sortie g");ic++;break;
                case 304:ic=p.peek().getAdresse();break;//sortie de g
            }
        }
    }
}
