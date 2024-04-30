package TP.TP2;

public class Trio {
    private Etudiant[] members;
    //Q2
    Trio(Etudiant e1,Etudiant e2,Etudiant e3){
        members=new Etudiant[3] ;
        members[0]=e1;
        members[1]=e2;
        members[2]=e3;
    }
    //Q4
    Etudiant premier(){
        double max=members[0].note;
        Etudiant et=members[0];
        for(int i=1;i<this.members.length;i++){
            if(max<members[i].note){
                max=members[i].note;
                et=members[i];
            }
        }
        return et;
    }
    //Q5
    //verifier que le nom est la 
    //

}
