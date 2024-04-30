public class Navigateur{
    private Page courante;

    public Navigateur(){
        this.courante=null;
    }

    public void nouvellePage(String adresse){
        Page p=new Page (adresse);
        if(this.courante!=null){
            Page in=this.courante;
            this.courante=p;
            this.courante.precedent=in;
            this.courante.suivant=null;
        }else{
            this.courante=p;
            this.courante.precedent=null;
            this.courante.suivant=null;
        }
    }

    //Correction
    public void nouvellePageCorr(String adresse){
        Page p=new Page(adresse,this.courante,null);
        this.courante.setSuiv(p);
        this.courante=p;
    }

    public boolean precedent(){
        if(this.courante!=null && this.courante.precedent!=null){ //verifie que courante et son precedent ne sont pas nuls 
            this.courante=this.courante.precedent;  
            return true;
        }else{
            return false;
        }
    }
    //Correction
    public boolean precedentCorr(){
        if(this.courante!=null && this.courante.getPrec()!=null){
            this.courante=this.courante.getPrec();
            return true;
        }else{
            return false;
        }
    }

    public void afficher(){
        if(this.courante!=null){//verifie que courante n'est pas null
            if(this.courante.precedent!=null){ //verifie que le precedent n'est pas null
                this.courante.precedent.afficher();//affiche tout les precedent
                System.out.print(this.courante.adress); 
            }else if(this.courante.suivant!=null){ //verifie que le suivant n'est pas null
                this.courante.suivant.afficher2(); //affiche tout les suivant
            }
        }else{
            System.out.print(this.courante.adress+"->"+"null");
        }
    }

    //Correction 
    public void afficherCorr(){
        if(this.courante!=null){
            this.courante.afficherCorr();
        }
    }

    public void supprimeCourant(){
        if(this.courante!=null){
            Page in=this.courante; //dans une variable intermediaire on stocke la page courante 
            if(in.suivant!=null){
                this.courante=in.suivant; 
            }else if(in.precedent!=null){
            this.courante=in.precedent;                 //on modifie courante 
            }else{
                this.courante=null;
            }
            in.suivant=null;    //le suivant et le precedent sont null dans la Page est suprimer 
            in.precedent=null;
        }
    }

    //Correction 
    public void supprimeCourantCorr(){
        if(this.courante!=null){
            this.courante=this.courante.supprimeCourantCorr();

        }
    }

    public int taille(){
        if(this.courante!=null){
            return this.courante.taille();
        }else{
            return 0;
        }
    }

    public static boolean disjoint(Navigateur n1,Navigateur n2){
        if(n1.courante==n2.courante){
            return true;
        }else if(n1.courante!=null && n2.courante!=null){
            return Page.disjoint(n1.courante, n2.courante);
        }else{
            return false;
        }
    }

    //Correction
    public static boolean disjointCorr(Navigateur n1,Navigateur n2){
        if(n1==null || n2==null || n1.courante==null || n2.courante==null ){
            return false;
        }else{
            return Page.disjointCorr(n1.courante, n2.courante);
        }
    }

    public int compte(String s){
        if(this.courante!=null){
            return this.courante.compte(s);
        }else{
            return 0;
        }
    }

    public boolean contient(String s){
        if(this.courante!=null){
            return this.courante.contient(s);
        }else{
            return false;
        }
    }

    public void inverse(){
        if(this.courante!=null){
            this.courante.inverse(); 
        }
    }
}