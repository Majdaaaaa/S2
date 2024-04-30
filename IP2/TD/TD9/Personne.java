import java.util.ArrayList;

class Personne{
    private final String prenom, nomDeFamille;
    private Personne mere, pere;
    //EXO 1
    public Personne(String prenom, String nomDeFamille){
        this.prenom=prenom;
        this.nomDeFamille=nomDeFamille;
    }
    public Personne(String prenom, String nomDeFamille, Personne pere, Personne mere){
        this.prenom=prenom;
        this.nomDeFamille=nomDeFamille;
        this.pere=pere;
        this.mere=mere;
    }
    //Q1
    public boolean estFrereOuSoeur(Personne p){
        if(this.pere==p.pere && this.mere==p.mere){
            return true;
        }else{
            return false;
        }
    }
    //Correction 
    public boolean estFrereOuSoeurCorr(Personne p){
        if(p==null)
            return false; 
        return this.pere == p.pere && this.mere==p.mere;
    }
    //Q2
    public boolean estCousinGermain(Personne p){
        if((this.pere.pere==p.pere.pere && this.pere.mere==p.pere.mere) || (this.mere.pere==p.mere.pere && this.mere.mere==p.mere.mere) ){
            return true;
        }else{
            return false;
        }
    }
    //Correction 
    public boolean estCousinGermainCorr(Personne p){
        if(this.pere!=null &&(this.estFrereOuSoeurCorr(p.pere)|| this.pere.estFrereOuSoeurCorr(p.pere)))
            return true;
        if(this.mere!=null &&(this.estFrereOuSoeurCorr(p.mere)|| this.mere.estFrereOuSoeurCorr(p.mere)))
            return true;
        return false;
    }
    //Q3
    public int nbAscendants(){
        int res=0;
        if(this.pere!=null && this.mere!=null){
            res=2+this.mere.nbAscendants()+this.pere.nbAscendants();
        }else if(this.pere!=null && this.mere==null){
            res=1+this.pere.nbAscendants();
        }else if(this.mere!=null && this.pere==null){
            res=1+this.mere.nbAscendants();
        }
        return res;
    }
    //Correction
    public int nbAscendantCorr(){
        int res=0;
        if(this.pere!=null){
            res+=1+this.pere.nbAscendantCorr();
        }
        if(this.mere!=null){
            res+=1+this.mere.nbAscendantCorr();
        }
        return res;
    }
    //Q4
    public boolean possedeCommeAscendants(Personne p){
        if(p==null)
            return false;
        if(this.pere==p || this.mere==p)
            return true;
        if(this.pere!=null && this.pere.possedeCommeAscendants(p))
            return true;
        if(this.mere!=null && this.mere.possedeCommeAscendants(p))
            return true;
        else
            return false;
    }
    //Q5
    public int distanceDAscendance(Personne p){
        if(this==p){
            return 0;
        }
        if(p==null){
            return -1;
        }
        if(this.pere!=null){
            int distancePere=this.pere.distanceDAscendance(p);
            if(distancePere!=-1){
                return 1+distancePere;
            }
        }
        if(this.mere!=null){
            int distanceMere=this.mere.distanceDAscendance(p);
            if(distanceMere!=-1){
                return 1+distanceMere;
            }
        }
        return -1;    
    }
    //Q6
    public String  afficheAscendantUnAux(Personne p){
        //faut toujours verifier que p n'est pas null
        if(this==p){
            return ", enfant de "+this.prenom+" "+this.nomDeFamille;
        }
        if(this.pere!=null){
            String pereAux = this.pere.afficheAscendantUnAux(p);
            if(pereAux!=null){
            return ", enfant de "+this.prenom +" "+ this.nomDeFamille+ pereAux;
            }
        }
        
        if(this.mere!=null){
            String mereAux = this.mere.afficheAscendantUnAux(p);
            if(mereAux!=null){
            return ", enfant de "+this.prenom +" "+ this.nomDeFamille+ mereAux;
            }
        }
        
        return null;
    }

    public void afficheAscendantUn(Personne p){
        if(p==null){
            return ;
        }
        String res=this.prenom+" "+this.nomDeFamille;
        String rec=" ";
        if(this!=p){
            rec=this.afficheAscendantUnAux(p);
        }
        if(res!=null){
            res+=rec;
        }
        System.out.println(res);
    }
    //Q7
    public int nbDeGenerations(){
        int genPere=0;
        int genMere=0;
        if(this.pere!=null){
            genPere=1+this.pere.nbDeGenerations();
        }
        if(this.mere!=null){
            genMere=1+this.mere.nbDeGenerations();
        }
        return Math.max(genMere,genPere);
    }
    //Q7_2
    public boolean verification(){
        boolean bonNom=this.pere==null || this.pere.nomDeFamille.equals(this.nomDeFamille);
        boolean frereSoeur= (this.pere==null || this.mere==null) && !this.pere.estFrereOuSoeurCorr(this.mere);
        boolean cousinGermain=false;
        boolean pereNormal=this.pere==null || this.pere.verification();
        boolean mereNormal=this.mere==null || this.mere.verification();
        return bonNom && !frereSoeur && !cousinGermain && mereNormal && pereNormal;
    }

    //Q8
    public ArrayList<Personne> getTousLesAscendant(){
        ArrayList<Personne> p= new ArrayList<>();
        getTousLesAscendantAux(p);
        return p;
    }
    public void getTousLesAscendantAux(ArrayList<Personne> p){
        if(this.pere!=null){
            p.add(this.pere);
            this.pere.getTousLesAscendantAux(p);
        }
        if(this.mere!=null){
            p.add(this.mere);
            this.mere.getTousLesAscendantAux(p);
        }
    }
    //Q9
    public boolean estDeMemeFamille(Personne p){
        if(p==null){
            return false;
        }
        ArrayList<Personne> thisFam=this.getTousLesAscendant();
        ArrayList<Personne> pFam=p.getTousLesAscendant();
        for(Personne p1 :thisFam){ //p1 dans thisFam
            for(Personne p2 : pFam){
                if(p1==p2){
                    return true;
                }
            }
        }   
        return false;
    }
}
