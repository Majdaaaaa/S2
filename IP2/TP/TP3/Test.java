package TP.TP3;

public class Test{
    public static void main(String[] args){
        Utilisateur u=new Utilisateur("yelan","pantalonecoat","yelan@secretliyue.liy");
        Utilisateur u1= new Utilisateur("diluc", "fuckfavonius", "diluc.ragndiv@wine.mond");
        Utilisateur u2= new Utilisateur("kaeya", "wine", "kaeya.albreich@favonius.mond");
        System.out.println(u.testMotDePasse("pantalonecoat"));
        u.changerMotDePasse("pantalonecoat","shenhe'sgirl");
        System.out.println(u.testMotDePasse("shenhe'sgirl"));
        System.out.println(u.getPseudonyme());
        u.getPseudonyme();
        //u.setPseudonyme();
        Message m=new Message("lalalalala",u);
        Message m1=new Message("blabla",u1);
        m.affichermes();
        Utilisateur[] V={u1,u};
        Message[] M={m,m1};
        Salon s=new Salon(V,M,0,0);
        System.out.println(s.estPresent(u));
    }
}