package TD.TD1;
public class Enclos{
    Animal[] habitants;
    int nb_hab;
    public Enclos(int capacite){
        this.nb_hab=0;
        this.habitants=new Animal[capacite];
    }
    public static boolean ajout (Enclos e, Animal a){
        if(e.nb_hab==e.habitants.length){
            for(int i=0;i<e.habitants.length;i++){
                if(e.habitants[i]==null){
                    e.habitants[i]=a;
                    e.nb_hab++;
                    return true;
                }
            }
        }
        return true;
    }
}